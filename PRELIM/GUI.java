import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
public class GUI{
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame implements ActionListener{

    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button14;
    JButton button15;
    JButton button16;
    JButton button17;
    JButton button18;
    JButton button19;

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JTextField textField = new JTextField();
    StringBuilder number = new StringBuilder();

    public MyFrame(){
        ImageIcon icon = new ImageIcon("pmda.png");
        
        button0 = new JButton("0");
        button0.addActionListener(this);
        button0.setFocusable(false);
        button0.setPreferredSize(new Dimension(100,100));

        button1 = new JButton("1");
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setPreferredSize(new Dimension(50,50));

        button2 = new JButton("2");
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setPreferredSize(new Dimension(50,50));

        button3 = new JButton("3");
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setPreferredSize(new Dimension(50,50));

        button4 = new JButton("4");
        button4.addActionListener(this);
        button4.setFocusable(false);
        button4.setPreferredSize(new Dimension(50,50));

        button5 = new JButton("5");
        button5.addActionListener(this);
        button5.setFocusable(false);
        button5.setPreferredSize(new Dimension(50,50));

        button6 = new JButton("6");
        button6.addActionListener(this);
        button6.setFocusable(false);
        button6.setPreferredSize(new Dimension(50,50));

        button7 = new JButton("7");
        button7.addActionListener(this);
        button7.setFocusable(false);
        button7.setPreferredSize(new Dimension(50,50));

        button8 = new JButton("8");
        button8.addActionListener(this);
        button8.setFocusable(false);
        button8.setPreferredSize(new Dimension(50,50));

        button9 = new JButton("9");
        button9.addActionListener(this);
        button9.setPreferredSize(new Dimension(50,50));

        button10 = new JButton("+");
        button10.addActionListener(this);
        button10.setFocusable(false);
        button10.setFont(new Font("Sans Serif",Font.BOLD, 20));
        button10.setPreferredSize(new Dimension(50,50));

        button11 = new JButton("-");
        button11.addActionListener(this);
        button11.setFocusable(false);
        button11.setFont(new Font("Sans Serif",Font.BOLD, 20));
        button11.setPreferredSize(new Dimension(50,50));

        button12 = new JButton("*");
        button12.addActionListener(this);
        button12.setFocusable(false);
        button12.setFont(new Font("Sans Serif",Font.BOLD, 20));
        button12.setPreferredSize(new Dimension(50,50));

        button13 = new JButton("/");
        button13.addActionListener(this);
        button13.setFocusable(false);
        button13.setFont(new Font("Sans Serif",Font.BOLD, 20));
        button13.setPreferredSize(new Dimension(50,50));

        button14 = new JButton("^");
        button14.addActionListener(this);
        button14.setFocusable(false);
        button14.setFont(new Font("Sans Serif",Font.BOLD, 20));
        button14.setPreferredSize(new Dimension(50,50));

        button15 = new JButton("(");
        button15.addActionListener(this);
        button15.setPreferredSize(new Dimension(50,50));

        button16 = new JButton(")");
        button16.addActionListener(this);
        button16.setFocusable(false);
        button16.setPreferredSize(new Dimension(50,50));

        button17 = new JButton("<=");
        button17.addActionListener(this);
        button17.setFocusable(false);
        button17.setFont(new Font("Sans Serif",Font.BOLD, 30));
        button17.setPreferredSize(new Dimension(50,50));

        button18 = new JButton("=");
        button18.addActionListener(this);
        button18.setFocusable(false);
        button18.setFont(new Font("Sans Serif",Font.BOLD, 30));
        button18.setPreferredSize(new Dimension(50,50));

        button19 = new JButton("C");
        button19.setFont(new Font("Sans",Font.BOLD,20));
        button19.setFocusable(false);
        button19.addActionListener(this);
        button19.setPreferredSize(new Dimension(50,50));

        panel.setBounds(0,250,340,400); 
        panel.setLayout(new GridLayout(5,3,5,5));
        panel.setForeground(Color.RED);
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button19);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button17);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button10);
        panel.add(button9);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button14);
        panel.add(button15);
        panel.add(button16);
        panel.add(button18);

        textField = new JTextField("0");
        textField.setFont(new Font("Sans Serif", Font.BOLD, 50));
        textField.setPreferredSize(new Dimension(340,100));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        panel2 = new JPanel();
        panel2.setBounds(0,30,340,140);
        panel2.add(textField);
        

        this.add(panel, BorderLayout.SOUTH);
        this.add(panel2);
        this.setTitle("PEMDAS Calculator");
        this.setSize(350,680);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setIconImage(icon.getImage());

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button0){
            number.append("0");
            textField.setText(number.toString());
        }
        if(e.getSource() == button1){
            number.append("1");
            textField.setText(number.toString());
        }
        if(e.getSource() == button2){
            number.append("2");
            textField.setText(number.toString());
        }
        if(e.getSource() == button3){
            number.append("3");
            textField.setText(number.toString());
        }
        if(e.getSource() == button4){
            number.append("4");
            textField.setText(number.toString());
        }
        if(e.getSource() == button5){
            number.append("5");
            textField.setText(number.toString());
        }
        if(e.getSource() == button6){
            number.append("6");
            textField.setText(number.toString());
        }
        if(e.getSource() == button7){
            number.append("7");
            textField.setText(number.toString());
        }
        if(e.getSource() == button8){
            number.append("8");
            textField.setText(number.toString());
        }
        if(e.getSource() == button9){
            number.append("9");
            textField.setText(number.toString());
        }
        if(e.getSource() == button10){
            number.append("+");
            textField.setText(number.toString());
        }
        if(e.getSource() == button11){
            number.append("-");
            textField.setText(number.toString());
        }
        if(e.getSource() == button12){
            number.append("*");
            textField.setText(number.toString());
        }
        if(e.getSource() == button13){
            number.append("/");
            textField.setText(number.toString());
        }
        if(e.getSource() == button14){
            number.append("^");
            textField.setText(number.toString());
        }
        if(e.getSource() == button15){
            number.append("(");
            textField.setText(number.toString());
        }
        if(e.getSource() == button16){
            number.append(")");
            textField.setText(number.toString());
        }
        if(e.getSource() == button17){
            number.deleteCharAt(number.length());
        }
        if(e.getSource() == button18){
            Convert convert = new Convert(number.toString());
            String gConvert = convert.convertPostfix();
            double gResult = convert.evaluateExpression(gConvert);
            String showResult = Double.toString(gResult);
            textField.setText(showResult);
        }
        if(e.getSource() == button19){
            number.setLength(0);
            textField.setText(number.toString());
        }

    }
}
