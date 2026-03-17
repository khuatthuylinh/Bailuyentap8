/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

public class PaymentFactory {

    public static Payment getPayment(String type) {

        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        } 
        else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        } 
        else if (type.equalsIgnoreCase("cash")) {
            return new CashPayment();
        } 
        else {
            throw new IllegalArgumentException("Phương thức không hợp lệ!");
        }
    }
}
