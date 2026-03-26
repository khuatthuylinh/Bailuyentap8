/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bài.pkg2.pkg11;

public class SMSService implements MessageService {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("========================================");
        System.out.println("📱 SENDING SMS");
        System.out.println("========================================");
        System.out.println("To: +84 123 456 789");
        System.out.println("Message: " + message);
        System.out.println("Status: ✓ SMS sent successfully!");
        System.out.println("========================================");
    }
}
