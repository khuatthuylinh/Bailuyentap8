/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bài.pkg2.pkg11;

public class Bài211 {
    public static void main(String[] args) {
        Notification notification = new Notification();
        
        // Use EmailService
        System.out.println("=== Email Notification ===");
        notification.setMessageService(new EmailService());
        notification.sendNotification("Hello via Email!");
        
        System.out.println("\n=== SMS Notification ===");
        // Use SMSService
        notification.setMessageService(new SMSService());
        notification.sendNotification("Hello via SMS!");
        
        System.out.println("\n=== Change service dynamically ===");
        // Switch service dynamically
        notification.setMessageService(new EmailService());
        notification.sendNotification("Switched to Email!");
    }
}
