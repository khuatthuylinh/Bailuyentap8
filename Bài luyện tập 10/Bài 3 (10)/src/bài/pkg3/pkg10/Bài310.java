/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bài.pkg3.pkg10;

// 1. Kế thừa Thread
class WorkerThread extends Thread {
    public void run() {
        System.out.println("Thread đang chạy...");
    }
}

// 2. Triển khai Runnable
class WorkerRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable đang chạy...");
    }
}

public class Bài310 {
    public static void main(String[] args) {
        // Khởi chạy Thread
        WorkerThread t1 = new WorkerThread();
        t1.start();

        // Khởi chạy Runnable
        Thread t2 = new Thread(new WorkerRunnable());
        t2.start();
    }
}
