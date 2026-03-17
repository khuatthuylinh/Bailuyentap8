import java.util.concurrent.CompletableFuture;

public class Bai3 {

    public static void main(String[] args) {

        // Bước 1: Xác thực
        CompletableFuture<Boolean> authFuture = CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            System.out.println("Đang xác thực người dùng...");
            return true; // đổi false để test lỗi
        });

        // Bước 2: Kiểm tra số dư
        CompletableFuture<Double> balanceFuture = authFuture.thenCompose(auth -> {
            if (!auth) {
                throw new RuntimeException("Xác thực thất bại!");
            }

            return CompletableFuture.supplyAsync(() -> {
                sleep(1500);
                System.out.println("Đang kiểm tra số dư...");
                return 1000.0; // số dư
            });
        });

        // Bước 3: Chuyển tiền
        CompletableFuture<Void> transferFuture = balanceFuture.thenAccept(balance -> {
            double amount = 500;

            if (balance < amount) {
                throw new RuntimeException("Không đủ tiền!");
            }

            sleep(1000);
            System.out.println("Chuyển tiền thành công: " + amount);
        });

        // Xử lý lỗi
        transferFuture.exceptionally(ex -> {
            System.out.println("Lỗi: " + ex.getMessage());
            return null;
        }).join(); // đợi hoàn thành

        System.out.println("Kết thúc giao dịch");
    }

    // Hàm giả lập delay
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}