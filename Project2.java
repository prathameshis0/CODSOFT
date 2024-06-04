package Task01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class Project2 extends JFrame {
    
    static JLabel l1,questiontext;
    static JOptionPane message;
    JButton submit,exit;
    ButtonGroup group;
    JRadioButton op1,op2,op3,op4;
    static int num=0,count=15,score=0,ans_given=0,number=1,choice;
    static String[] question={"What is Full Form of LAN ?","What is Command For Setting IP in Router ? ","What is full form of ROAS ?","Which device is use to connected Different Network ?","Which Device is use to connected LAN Devices ? ","What is method use to divide a whole Network address ?","What is Full form of MAC ?","What is First Address of 192.168.125.6 /24 ?","Whay is Port Number for FTP ?","What is Port Number of HTTPS ?","What is command for Power on(Shutting up) the interface of Router ?"},
    option1={"Local Air Net","#> ip addition <Ip-address> <MAC>","Read Only Address Space","Switch","Router","Division","Media-Access-Control","192.168.125.3","21","45","Shutdown"},
    option2={"Link Area Network","#> ip address <Ip-address> <Mask-address>","Read on a Stick","HUB","HUB","Sepreator","Media-Address-Configure","192.168.114.1","30","20","No shutdown"},
    option3={"Local Area Network","#>ip shut address <Ip-address>","Router Off Address Switch","PC","Switch","Subnetting","Main-Address-Code","192.168.125.1","50","443","No shutup"},
    option4={"None of These","#> IP add <ip-address> interface name","Router on a Stick","Router","Server","None of These","Main-Access-Code","192.168.125.0","443","79","None of these"};
    HashMap<String,String>ans=new HashMap<>();
    Project2(){
    
        setTitle(" Quiz Game ");
        setLayout(null);
        l1=new JLabel(""+number);
        l1.setText(""+number);
        l1.setBounds(230,120,100,100);
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        add(l1);   
        
        
        JPanel body=new JPanel();
        body.setBackground(Color.lightGray);
        body.setBounds(40,160,400,400);
        body.setLayout(null);
        add(body);

         questiontext=new JLabel();
        questiontext.setText(question[num]);
        questiontext.setBounds(5,0,400,100);
        body.add(questiontext);

        op1=new JRadioButton();
        op1.setText(option1[num]);
        op1.setBounds(40,100,500,55);
        op1.setBackground(Color.LIGHT_GRAY);
        body.add(op1);
        op2=new JRadioButton();
        op2.setText(option2[num]);
        op2.setBounds(40,140,500,55);
        op2.setBackground(Color.LIGHT_GRAY);
        body.add(op2);
        op3=new JRadioButton();
        op3.setText(option3[num]);
        op3.setBounds(40,175,490,55);
        op3.setBackground(Color.LIGHT_GRAY);
        body.add(op3);
        op4=new JRadioButton();
        op4.setText(option4[num]);
        op4.setBounds(40,210,490,55);
        op4.setBackground(Color.LIGHT_GRAY);
        body.add(op4);
        group = new ButtonGroup();
        group.add(op1);
        group.add(op2);
        group.add(op3);
        group.add(op4);

        submit=new JButton();
        submit.setText("Submit");
        submit.setBounds(150,300,100,40);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                if(number!=10){
                    if(ans.get(question[num]).equals(op1.getText()) && op1.isSelected()){
                        score++;
                    }else if (ans.get(question[num]).equals(op2.getText()) && op2.isSelected()) {
                        score++;
                    }else if (ans.get(question[num]).equals(op3.getText()) && op3.isSelected()) {
                        score++;
                    }else if (ans.get(question[num]).equals(op4.getText())&& op4.isSelected()) {
                        score++;
                    }
                    count=15;
                    number++;
                    num++;
                    start(num);
                }else{
                    message.showMessageDialog(null, "Your Correct Answer "+score+"Out of 10");
                    System.exit(0);
                }
            }  
        
        });
        body.add(submit);
        exit=new JButton();
        exit.setText("Exit");
        exit.setBounds(150,360,100,40);
        exit.addActionListener(new ActionListener() {
            @SuppressWarnings("static-access")
            public void actionPerformed(ActionEvent ae){
                message.showMessageDialog(null, "Your Correct Answer "+score+"Out of 10");
                
                System.exit(0);
            }    

        });
        body.add(exit);
        start(num);


        //answerr
        ans.put(question[0], option3[0]);
        ans.put(question[1], option2[1]);
        ans.put(question[2], option4[2]);
        ans.put(question[3], option4[3]);
        ans.put(question[4], option3[4]);
        ans.put(question[5], option3[5]);
        ans.put(question[6], option1[6]);
        ans.put(question[7], option3[7]);
        ans.put(question[8], option1[8]);
        ans.put(question[9], option3[9]);
        ans.put(question[10], option2[10]);

        setLocation(500,80);
        setSize(500,700);
        setVisible(true);

    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        String time="Time Left "+ count+ " Seconds";
        g.setFont(new Font("Tahoma", Font.BOLD, 20));
        if(count>0 && number!=11){
            g.drawString(time,150,80);
        }else{
            g.drawString("Time Up !!",150,80);

        }
        count--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            System.out.println(e);
        }
        if(ans_given==1){
            ans_given=0;
            count=15;
        }else if(count<0 && number!=10){
            count=15;
            if(group.getSelection()==null){
                num++;
                start(num);
                number++;
            }else{
                if(ans.get(question[num]).equals(op1.getText()) && op1.isSelected()){
                    score++;
                }else if (ans.get(question[num]).equals(op2.getText()) && op2.isSelected()) {
                    score++;
                }else if (ans.get(question[num]).equals(op3.getText()) && op3.isSelected()) {
                    score++;
                }else if (ans.get(question[num]).equals(op4.getText()) && op4.isSelected()) {
                    score++;
                }
            }
            num++;
            start(num);
            number++;
            
        }
    }
    public void start(int num){
        questiontext.setText(question[num]);
        l1.setText(""+number);
        op1.setText(option1[num]);
        op2.setText(option2[num]);
        op3.setText(option3[num]);
        op4.setText(option4[num]);
        group.clearSelection();
        
    }

   
    
    public static void main(String args[]){
       
        new Project2();
    }
    
    
}


