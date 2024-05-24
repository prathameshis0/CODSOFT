package Task01;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;;


public class Project {
    static Random rand=new Random();
   static int num=rand.nextInt(100)+1;
    static JTextField text;
    static JLabel i3;

    static JFrame f=new JFrame();
    Project(){
        f.setTitle("Guess Number :");
        f.setLayout(null);
        JLabel i1=new JLabel("Guess The Number ");
        i1.setBounds(170, 50, 115, 50);
        f.add(i1);

        JLabel i0=new JLabel("Choose between 1-100");
        i0.setBounds(60,102,130,50);
        f.add(i0);
        JLabel i2=new JLabel("Life/Chances:");
        i2.setBounds(300,100,115,50);
        f.add(i2);

        i3=new JLabel();
        i3.setText("10");
        i3.setBounds(390,106,100,40);
        f.add(i3);

        JLabel i4=  new JLabel("Input The Number :");
        i4.setBounds(90,200,120,50);
        f.add(i4);


        text=new JTextField();
        text.setBounds(210,210,120,30);
        f.add(text);

        JButton submit=new JButton("Submit");
        submit.setBounds(200,250,100,30);
        submit.addActionListener(new ActionListener() {
            @SuppressWarnings("static-access")
            public void actionPerformed(ActionEvent ae){
                JOptionPane message=new JOptionPane();
                String str1=i3.getText();
                int i=10,count=Integer.parseInt(str1);
                while(i!=1 && count!=0){ 
                    String str=text.getText().trim();   
                if(num==Integer.parseInt(str)){
                    message.showMessageDialog(null,"You Won The Game");
                    message.showMessageDialog(null,"Your Score was "+count);
                    System.exit(0);
                }else if(num<Integer.parseInt(str)){
                    message.showMessageDialog(null,"Try again the Number was too big ");
                    count--;
                    i3.setText(""+count);
                }else if(num>Integer.parseInt(str)){
                    message.showMessageDialog(null,"Try again the Number was too Small ");
                    count--;
                    i3.setText(""+count);
                }else{
                    message.showMessageDialog(null,"YOU LOSS And the number was "+num);
                    message.showMessageDialog(null,"Your Score was 0");
                    System.exit(0);

                }
                text.setText(" ");
                    i--;
                }
                message.showMessageDialog(null,"YOU LOSS And the number was "+num);
                    message.showMessageDialog(null,"Your Score was 0");
                    System.exit(0);
            }
        });
        f.add(submit);

        JButton exit=new JButton("exit");
        exit.setBounds(200,300,100,30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
        f.add(exit);




        f.setLocation(500,80);
        f.setSize(500,700);
        f.setVisible(true);
    }
    
    public static void main(String args[]){
        new Project();
    }
    
}
