/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

public class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Tiền mặt: " + amount);
    }
}