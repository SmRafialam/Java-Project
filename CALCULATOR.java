import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
 
public class CALCULATOR extends JFrame {
 

    JButton Zero = new JButton(" 0 ");
    JButton One = new JButton("  1 ");
    JButton Two = new JButton(" 2 ");
    JButton Three = new JButton(" 3 ");
    JButton Four = new JButton(" 4 ");
    JButton Five = new JButton(" 5 ");
    JButton Six = new JButton(" 6 ");
    JButton Seven = new JButton(" 7 ");
    JButton Eight = new JButton(" 8 ");
    JButton Nine = new JButton(" 9 ");
    JButton Plus = new JButton(" + ");
    JButton Minus = new JButton(" - ");
    JButton Times = new JButton(" * ");
    JButton Divide = new JButton(" / ");
    JButton Clear = new JButton(" CE ");
    JButton Equals = new JButton("   =   ");
    String value;
    char operator;
    JTextArea area = new JTextArea(3, 5);
 
    public static void main(String[] args) {
       
        CALCULATOR calculator = new CALCULATOR();
        calculator.setSize(230, 340);
        calculator.setTitle(" CALCULATOR ");
        calculator.setResizable(false);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public CALCULATOR () {
        add(new JScrollPane(area), BorderLayout.NORTH);
        JPanel buttonPANEL = new JPanel();
        buttonPANEL.setLayout(new FlowLayout()); 
        buttonPANEL.add(Seven);
        buttonPANEL.add(Eight);
        buttonPANEL.add(Nine);
        buttonPANEL.add(Divide);
        buttonPANEL.add(Four);
        buttonPANEL.add(Five);
        buttonPANEL.add(Six);
        buttonPANEL.add(Times);
        buttonPANEL.add(One);
        buttonPANEL.add(Two);
        buttonPANEL.add(Three);
        buttonPANEL.add(Minus);
        buttonPANEL.add(Zero);
        buttonPANEL.add(Plus);
        buttonPANEL.add(Equals);
        buttonPANEL.add(Clear);
       
 
        add(buttonPANEL, BorderLayout.CENTER);
        area.setForeground(Color.GREEN);
        area.setBackground(Color.YELLOW);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);
 
        Zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("0".toString());
            }
        });
 
        One.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("1".toString());
            }
        });
 
        Two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("2".toString());
            }
        });
 
        Three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("3".toString());
            }
        });
 
        Four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("4".toString());
            }
        });
 
        Five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("5".toString());
            }
        });
 
        Six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("6".toString());
            }
        });
 
        Seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("7".toString());
            }
        });
 
        Eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("8".toString());
            }
        });
 
        Nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("9".toString());
            }
        });
 
        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("+".toString());
                operator = '+';
            }
        });
 
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("-".toString());
                operator = '-';
            }
        });
 
        Times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("*".toString());
                operator = '*';
            }
        });
 
        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("/".toString());
                operator = '/';
            }
        });
 
        Equals.addActionListener(new ActionListener() {
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
 
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.setText("");
            }
        });
    }
}