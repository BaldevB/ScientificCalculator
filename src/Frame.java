import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

public class Frame extends JFrame implements ActionListener {
    final String[] layout = {
            "MR", "MC", "M+", "M-",
            "1/x", "x²", "x³", "x!",
            "sin", "cos", "tan", "log",
            "√", "exp", "AC", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "+/-", "0", ".", "="
    };

    DecimalFormat format = new DecimalFormat("#.#####");
    final JTextField jScreen;
    double temp, temp1, result, a;
    static double m1, m2;
    int k = 1, x = 0, y = 0, z = 0;
    char ch;

    Frame() {
        setSize(300, 400);
        Dimension screenDims = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenDims.width / 2 - getWidth() / 2, screenDims.height / 2 - getHeight() / 2);
        setBackground(Color.decode("#333333"));
        setResizable(false);
        setTitle("Scientific Calculator");

        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        main.setBackground(getBackground());
        add(main);

        jScreen = new JTextField();
        jScreen.setText("0");
        jScreen.setFont(jScreen.getFont().deriveFont(Font.PLAIN, 28));
        jScreen.setEditable(false);
        jScreen.setHorizontalAlignment(JTextField.RIGHT);
        jScreen.setBackground(getBackground().brighter());
        jScreen.setForeground(Color.lightGray);
        jScreen.setBorder(new LineBorder(Color.darkGray, 1, true));
        main.add(jScreen, BorderLayout.PAGE_START);

        JPanel buttonsGrid = new JPanel();
        buttonsGrid.setLayout(new GridLayout(8, 4));
        buttonsGrid.setBackground(getBackground());
        main.add(buttonsGrid, BorderLayout.CENTER);

        for (int i = 0; i < 8 * 4 && i < layout.length; i++) {
            JButton button = new JButton(layout[i]);
            button.setFont(button.getFont().deriveFont(Font.PLAIN, 16));
            button.setBorderPainted(false);
            button.setOpaque(true);
            button.setBackground(getBackground());
            if (layout[i].equals("AC") || layout[i].equals("=")) {
                button.setForeground(Color.orange);
                button.setFont(button.getFont().deriveFont(Font.BOLD, 16));
            } else if (layout[i].equals("MR") || layout[i].equals("MC") || layout[i].equals("M+") || layout[i].equals("M-")) {
                button.setForeground(Color.decode("#7777ff"));
                button.setFont(button.getFont().deriveFont(Font.BOLD, 16));
            } else if (layout[i].length() == 1 && layout[i].charAt(0) >= '0' && layout[i].charAt(0) <= '9') {
                button.setForeground(Color.decode("#00c2b5"));
                button.setFont(button.getFont().deriveFont(Font.BOLD, 16));
            } else {
                button.setForeground(Color.lightGray);
            }
            button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    ((JButton) e.getSource()).setBackground(Color.darkGray);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    ((JButton) e.getSource()).setBackground(getBackground());
                }
            });
            button.addActionListener(this);
            buttonsGrid.add(button);
        }

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("1")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("2")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("3")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("4")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("5")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("6")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("7")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("8")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("9")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
            z = 1;
        }
        if (s.equals("0")) {
            int val = Integer.parseInt(s.trim());
            if (z == 0 || jScreen.getText().equals("0"))
                jScreen.setText(String.valueOf(val));
            else {
                jScreen.setText(jScreen.getText() + val);
            }
        }
        if (s.equals("AC")) {
            jScreen.setText("0");
            x = 0;
            y = 0;
            z = 0;
        }
        if (s.equals("log")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = Math.log(Double.parseDouble(jScreen.getText()));
                jScreen.setText("");
                if (a == (int) a)
                    jScreen.setText(jScreen.getText() + (int)a);
                else
                    jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("1/x")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = 1 / Double.parseDouble(jScreen.getText());
                jScreen.setText("");
                if (a == (int) a)
                    jScreen.setText(jScreen.getText() + (int)a);
                else
                    jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("exp")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = Math.exp(Double.parseDouble(jScreen.getText()));
                jScreen.setText("");
                if (a == (int) a)
                    jScreen.setText(jScreen.getText() + (int)a);
                else
                    jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("x²")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = Math.pow(Double.parseDouble(jScreen.getText()), 2);
                jScreen.setText("");
                if (a == (int) a)
                    jScreen.setText(jScreen.getText() + (int)a);
                else
                    jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("x³")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = Math.pow(Double.parseDouble(jScreen.getText()), 3);
                jScreen.setText("");
                if (a == (int) a)
                    jScreen.setText(jScreen.getText() + (int)a);
                else
                    jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("+/-")) {
            if (jScreen.getText().startsWith("-"))
                jScreen.setText(jScreen.getText().substring(1));
            else
                jScreen.setText("-" + jScreen.getText());
        }
        if (s.equals(".")) {
            z = 1;

            if (jScreen.getText().contains(".") == false) {
                jScreen.setText(jScreen.getText() + ".");
            } else if (jScreen.getText().endsWith(".")) {
                jScreen.setText(jScreen.getText().substring(0, jScreen.getText().length() - 1));
            }
        }
        if (s.equals("+")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
                temp = 0;
                ch = '+';
            } else {
                temp = Double.parseDouble(jScreen.getText());
                jScreen.setText("0");
                ch = '+';
                y = 0;
                x = 0;
            }
            jScreen.requestFocus();
        }
        if (s.equals("-")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
                temp = 0;
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(jScreen.getText());
                jScreen.setText("0");
            }
            ch = '-';
            jScreen.requestFocus();
        }
        if (s.equals("÷")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
                temp = 1;
                ch = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(jScreen.getText());
                ch = '/';
                jScreen.setText("0");
            }
            jScreen.requestFocus();
        }
        if (s.equals("×")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
                temp = 1;
                ch = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(jScreen.getText());
                ch = '*';
                jScreen.setText("0");
            }
            jScreen.requestFocus();
        }
        if (s.equals("MC")) {
            m1 = 0;
            jScreen.setText("0");
        }
        if (s.equals("MR")) {
            if (m1 == (int)m1)
                jScreen.setText(String.valueOf((int)m1));
            else
                jScreen.setText(format.format(m1));
        }
        if (s.equals("M+")) {
            if (k == 1) {
                m1 = Double.parseDouble(jScreen.getText());
                k++;
            } else {
                m1 += Double.parseDouble(jScreen.getText());
            }
        }
        if (s.equals("M-")) {
            if (k == 1) {
                m1 = Double.parseDouble(jScreen.getText());
                k++;
            } else {
                m1 -= Double.parseDouble(jScreen.getText());
            }
        }
        if (s.equals("√")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = Math.sqrt(Double.parseDouble(jScreen.getText()));
                jScreen.setText("");
                jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("sin")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = Math.sin(Double.parseDouble(jScreen.getText()) * 3.142 / 180);
                jScreen.setText("");
                jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("cos")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = Math.cos(Double.parseDouble(jScreen.getText()) * 3.142 / 180);
                jScreen.setText("");
                jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("tan")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else {
                a = Math.tan(Double.parseDouble(jScreen.getText()) * 3.142 / 180);
                jScreen.setText("");
                jScreen.setText(jScreen.getText() + format.format(a));
            }
        }
        if (s.equals("=")) {
            simulateEqualTo();
        }
        if (s.equals("x!")) {
            if (temp != 0)
                simulateEqualTo();

            if (jScreen.getText().equals("0")) {
                jScreen.setText("0");
            } else if (!jScreen.getText().contains(".") && !jScreen.getText().contains("-")) {
                a = fact(Double.parseDouble(jScreen.getText()));
                jScreen.setText("");
                jScreen.setText(jScreen.getText() + (int)a);
            }
        }
        jScreen.requestFocus();
    }

    void simulateEqualTo() {
        if (jScreen.getText().equals("")) {
            jScreen.setText("");
        } else {
            temp1 = Double.parseDouble(jScreen.getText());
            switch (ch) {
                case '+':
                    result = temp + temp1;
                    break;
                case '-':
                    result = temp - temp1;
                    break;
                case '/':
                    result = temp / temp1;
                    break;
                case '*':
                    result = temp * temp1;
                    break;
            }
            jScreen.setText("");
            if (result == (int) result)
                jScreen.setText(jScreen.getText() + (int)result);
            else
                jScreen.setText(jScreen.getText() + result);
            temp = 0;
            z = 1;
        }
    }

    double fact(double x) {
        if (x < 0)
            return 0;

        double i, s = 1;
        for (i = 2; i <= x; i += 1.0)
            s *= i;
        return s;
    }
}