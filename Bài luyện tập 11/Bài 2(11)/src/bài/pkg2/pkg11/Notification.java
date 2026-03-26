/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bài.pkg2.pkg11;

// Notification.java
public class Notification {
    private MessageService messageService;
    
    // Setter Injection method
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("🔧 Dependency injected: " + messageService.getClass().getSimpleName());
    }
    
    public void sendNotification(String message) {
        if (messageService != null) {
            System.out.println("\n🔄 Processing notification...");
            messageService.sendMessage(message);
        } else {
            System.out.println("\n❌ Error: No message service configured!");
            System.out.println("Please inject a dependency using setMessageService() first.");
        }
    }
    
    // Optional: Get current service
    public MessageService getMessageService() {
        return messageService;
    }
}