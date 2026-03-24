/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bài.pkg2.pkg10;

// 1. Interface cũ
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// 2. Thư viện mới (Advanced)
class VlcPlayer {
    void playVlc(String fileName) {
        System.out.println("Đang phát file VLC: " + fileName);
    }
}

// 3. Adapter: Kết nối MediaPlayer với VlcPlayer
class MediaAdapter implements MediaPlayer {
    VlcPlayer vlcPlayer = new VlcPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Định dạng " + audioType + " không được hỗ trợ qua Adapter.");
        }
    }
}

public class Bài210 {
    public static void main(String[] args) {
        MediaAdapter adapter = new MediaAdapter();
        adapter.play("vlc", "bai_hat_hay.vlc");
    }
}
