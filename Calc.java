package bbbbb;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.color.*;

class GUICalc extends JFrame implements ActionListener {
    JButton numberButtons[] = new JButton[10];
    JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    int operand1, operand2;
    char operator;
    JTextField resultField;
    
    
    GUICalc() {
        JFrame frame = new JFrame("CALCULATOR");
        frame.getContentPane().setBackground(new Color(54, 70, 82));
        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,3,9,9));
        buttonPanel.setLayout(new GridLayout(5,3,9,9));
        buttonPanel.setBorder(new EmptyBorder(5,4,9,5));
       // buttonPanel.setBackground(new Color(54, 70, 82));
        for (int i = 7; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
        }
        clearButton = new JButton("C");
        buttonPanel.add(clearButton);
        clearButton.addActionListener(this);
        clearButton.setForeground(Color.red);
        for (int i =4 ; i <7 ; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
            
        }
         addButton = new JButton("+");
        buttonPanel.add(addButton);
        addButton.addActionListener(this);
        for (int i =1 ; i < 4; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
        }

       
        subtractButton = new JButton("-");
        buttonPanel.add(subtractButton);
        subtractButton.addActionListener(this);
        for (int i =0 ; i < 1; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
        }
        multiplyButton = new JButton("X");
        buttonPanel.add(multiplyButton);
        multiplyButton.addActionListener(this);
        divideButton = new JButton("/");
        buttonPanel.add(divideButton);
        divideButton.addActionListener(this);
        equalsButton = new JButton("=");
        buttonPanel.add(equalsButton);
        equalsButton.addActionListener(this);
       

        resultField = new JTextField(5);
        resultField.setPreferredSize(new Dimension(200, 50));

        
        add(buttonPanel, BorderLayout.CENTER);
        add(resultField, BorderLayout.NORTH);

        setVisible(true);
        setSize(300, 350);
        this.setTitle("Calculator by Nygil");
        frame.getContentPane().setBackground(Color.red);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton == clearButton) {
            operand1 = operand2 = 0;
            resultField.setText("");
        } else if (clickedButton == equalsButton) {
            operand2 = Integer.parseInt(resultField.getText());
            evaluate();
            resultField.setText(String.valueOf(operand1));
            operand1 = 0; // Reset operand1 for future calculations
        } else {
            boolean isOperator = false;
            if (clickedButton == addButton) {
                operator = '+';
                isOperator = true;
            }
            if (clickedButton == subtractButton) {
                operator = '-';
                isOperator = true;
            }
            if (clickedButton == multiplyButton) {
                operator = '*';
                isOperator = true;
            }
            if (clickedButton == divideButton) {
                operator = '/';
                isOperator = true;
            }

            if (!isOperator) {
                for (int i = 0; i < 10; i++) {
                    if (clickedButton == numberButtons[i]) {
                        String currentText = resultField.getText();
                        currentText += i;
                        resultField.setText(currentText);
                    }
                }
            } else {
                operand1 = Integer.parseInt(resultField.getText());
                resultField.setText("");
            }
        }
    }

    void evaluate() {
        switch (operator) {
            case '+':
                operand1 += operand2;
                break;
            case '-':
                operand1 -= operand2;
                break;
            case '*':
                operand1 *= operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    operand1 /= operand2;
                } else {
                    resultField.setText("Error: Divide by zero");
                }
                break;
        }
    }

    public static void main(String[] args) {
        new GUICalc();
    }
}
