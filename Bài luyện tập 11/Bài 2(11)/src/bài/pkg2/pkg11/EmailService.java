/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bài.pkg2.pkg11;

// EmailService.java
public class EmailService implements MessageService {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("========================================");
        System.out.println("📧 SENDING EMAIL");
        System.out.println("========================================");
        System.out.println("To: recipient@example.com");
        System.out.println("Subject: Notification");
        System.out.println("Message: " + message);
        System.out.println("Status: ✓ Email sent successfully!");
        System.out.println("========================================");
    }
}