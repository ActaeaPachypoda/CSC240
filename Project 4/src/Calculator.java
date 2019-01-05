import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JButton six;
    private JButton zero;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton plus;
    private JButton minus;
    private JButton times;
    private JButton divide;
    private JButton equals;
    private JTextArea area;
    String value;
    char operator;

    public Calculator() {

        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout(new FlowLayout());
        buttonpanel.add(seven);
        buttonpanel.add(eight);
        buttonpanel.add(nine);
        buttonpanel.add(divide);
        buttonpanel.add(four);
        buttonpanel.add(five);
        buttonpanel.add(six);
        buttonpanel.add(times);
        buttonpanel.add(one);
        buttonpanel.add(two);
        buttonpanel.add(three);
        buttonpanel.add(minus);
        buttonpanel.add(zero);
        buttonpanel.add(plus);
        buttonpanel.add(equals);
        area.setForeground(Color.BLACK);
        area.setBackground(Color.WHITE);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("0".toString());
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("1".toString());
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("2".toString());
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("3".toString());
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("4".toString());
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("5".toString());
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("6".toString());
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("7".toString());
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("8".toString());
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("9".toString());
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("+".toString());
                operator = '+';
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("-".toString());
                operator = '-';
            }
        });
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("*".toString());
                operator = '*';
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("/".toString());
                operator = '/';
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                String leftSide;
                String rightSide;
                try {
                    leftSide = area.getText().substring(0, area.getText().indexOf(operator + ""));
                    rightSide = area.getText().substring(area.getText().indexOf(operator + "") + 1, area.getText().length());
                    switch (operator) {
                        case '+':
                            area.append(" = " + ((Double.parseDouble(leftSide)
                                    + Double.parseDouble(rightSide))));
                            break;
                        case '-':
                            area.append(" = " + ((Double.parseDouble(leftSide)
                                    - Double.parseDouble(rightSide))));
                            break;
                        case '/':
                            area.append(" = " + ((Double.parseDouble(leftSide)
                                    / Double.parseDouble(rightSide))));
                            break;
                        case '*':
                            area.append(" = " + ((Double.parseDouble(leftSide)
                                    * Double.parseDouble(rightSide))));
                            break;
                        default:
                            area.setText(" No Result... ");
                            break;
                    }
                } catch (Exception e) {
                }
            }
        });
    }
}