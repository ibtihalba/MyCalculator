import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI extends Calculator implements ActionListener {
    JFrame frame ;
    JTextField textfield; 
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton, lnButton, powButton, sqrtButton, factButton, equButton, clrButton;
    JPanel panel2;
    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    Font myFont2 = new Font("SansSerif", Font.BOLD, 20);
  
    
    
    

    GUI(){
        frame = new JFrame("Calculator");
        frame.setLayout(new BorderLayout());

      //adding operation buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        lnButton = new JButton("ln");
        powButton = new JButton("pow");
        sqrtButton = new JButton("sqrt");
        factButton = new JButton("!");
        equButton = new JButton("=");
        clrButton = new JButton("C");


        //adding number buttons 
        functionButtons[0] = addButton ;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton ;
        functionButtons[4] = lnButton ;
        functionButtons[5] = powButton ;
        functionButtons[6] = sqrtButton ;
        functionButtons[7] = factButton ;
        functionButtons[8] = equButton ; 
        functionButtons[9] = clrButton ;


        for(int i = 0; i<10; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        for(int i = 0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        panel2 = new JPanel();
        panel2.setBounds(4,4,100,100);

        // adding buttons to pannel
        panel2.add(numberButtons[0]);
        panel2.add(numberButtons[1]);
        panel2.add(numberButtons[2]);
        panel2.add(numberButtons[3]);
        panel2.add(clrButton);
        panel2.add(numberButtons[4]);
        panel2.add(numberButtons[5]);
        panel2.add(numberButtons[6]);
        panel2.add(numberButtons[7]);
        panel2.add(factButton);
        panel2.add(numberButtons[8]);
        panel2.add(numberButtons[9]);
        panel2.add(addButton);
        panel2.add(subButton);
        panel2.add(mulButton);
        panel2.add(powButton);
        panel2.add(sqrtButton);
        panel2.add(lnButton);
        panel2.add(equButton);
        panel2.add(divButton);


        textfield=new JTextField(10);
        frame.add(panel2,BorderLayout.CENTER);
        frame.add(textfield,BorderLayout.NORTH);
        textfield.setPreferredSize(new Dimension(20,40)); 
        frame.setVisible(true);
        frame.setSize(320,380);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel2.setBackground(Color.lightGray);
        for (int i = 0; i < 10; i = i + 1) {
            numberButtons[i].setBackground(Color.gray);
            functionButtons[i].setBackground(Color.pink);
        }

        clrButton.setBackground(Color.orange);
        textfield.setFont(myFont2);
       
        
    
        
        



    }
    public static void main(String[] args){
        GUI calc = new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0 ; i<10 ;  i++){
            if(e.getSource()== numberButtons[i]){
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == addButton){
            first = Double.parseDouble(textfield.getText());
            add();
            textfield.setText("");
        }
        if (e.getSource() == subButton){
            first = Double.parseDouble(textfield.getText());
            substract();
            textfield.setText("");
        }
        if (e.getSource() == mulButton){
            first = Double.parseDouble(textfield.getText());
            multiply();
            textfield.setText("");
        }
        if (e.getSource() == divButton){
            first = Double.parseDouble(textfield.getText());
            divide();
            textfield.setText("");
        }
        if (e.getSource() == factButton){
            first = Double.parseDouble(textfield.getText());
            factorial();
            textfield.setText("");
        }
        if (e.getSource() == powButton){
            first = Double.parseDouble(textfield.getText());
            pow();
            textfield.setText("");
        }
        if (e.getSource() == sqrtButton){
            first = Double.parseDouble(textfield.getText());
            rootSquare();
            textfield.setText("");
        }
        if (e.getSource() == lnButton){
            first = Double.parseDouble(textfield.getText());
            nepLog();
            textfield.setText("");
        }
        if (e.getSource() == equButton){
            switch(oP){
                case"+":
                    second= Double.parseDouble(textfield.getText());
                    compute();
                    break ;
                case"-":
                    second= Double.parseDouble(textfield.getText());
                    compute();
                    break ;
                case"*":
                    second= Double.parseDouble(textfield.getText());
                    compute();
                    break;
                case"/":
                    second= Double.parseDouble(textfield.getText());
                   compute() ;
                    break;
                case"!":
                    second = 1 ;
                    compute();
                    break;
                case"POW":
                    second= Double.parseDouble(textfield.getText());
                    compute();
                    break;
                case"sqrt":
                    second = 1 ;
                    compute();
                    break;
                case"ln":
                    second = 1 ;
                    compute();
                    break;
            }
            textfield.setText(String.valueOf(display()));
            first = result;
        }
        if (e.getSource() == clrButton){
            clear();
            textfield.setText("");
        }
    }
}
