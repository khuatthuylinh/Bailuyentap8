package com.cmc.bai410;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField display;

    private double num1 = 0;
    private String operator = "";
    private boolean start = true;

    @FXML
    private void handleNumber(ActionEvent event) {
        if (start) {
            display.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        display.setText(display.getText() + value);
    }

    @FXML
    private void handleOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!"=".equals(value)) {
            if (!operator.isEmpty()) return;
            operator = value;
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        }
    }

    @FXML
    private void handleEqual() {
        if (operator.isEmpty()) return;
        double num2 = Double.parseDouble(display.getText());
        double result = calculate(num1, num2, operator);
        display.setText(String.valueOf(result));
        operator = "";
        start = true;
    }

    @FXML
    private void handleClear() {
        display.setText("");
        operator = "";
        start = true;
    }

    private double calculate(double n1, double n2, String op) {
        switch (op) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
            case "/": 
                if (n2 == 0) return 0;
                return n1 / n2;
            default: return 0;
        }
    }
}
