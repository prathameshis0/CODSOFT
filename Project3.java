package Task01;

import java.util.*;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.*;

public class Project3 implements ActionListener{
    static int total,avg;
    static String grade="";
    static JFrame f=new JFrame();
    static JTextField name,name1,s1,s2,s3,s4,s5,m1,m2,m3,m4,m5;
    static JOptionPane message;


    // Result Frame
    public static void result(){
        f.setVisible(false);
        JFrame f1=new JFrame();
        f1.setLayout(null);
        JLabel a=new JLabel();
        a.setFont(new Font("Tahoma",Font.BOLD,20));
        a.setText("NAME-"+name.getText());
        a.setBounds(80,20,300,50);
        f1.add(a);

        JLabel b=new JLabel();
        b.setFont(new Font("Tahoma",Font.BOLD,20));
        b.setText("Roll No-"+name1.getText());
        b.setBounds(80,70,300,50);
        f1.add(b);
        String subname[][]={{s1.getText(),m1.getText(),"100"},{s2.getText(),m2.getText(),"100"},{s3.getText(),m3.getText(),"100"},{s4.getText(),m4.getText(),"100"},{s5.getText(),m5.getText(),"100"}},colum[]={"Subject_Name","Marks Obtained","Out Of"};
        
        JTable subjects=new JTable(subname,colum);
        subjects.setBounds(100,200,300,100);
        JScrollPane sp=new JScrollPane(subjects);
        sp.setBounds(50,200,430,100);
        f1.add(sp);


        JLabel c=new JLabel();
        c.setFont(new Font("Tahoma",Font.BOLD,20));
        c.setText("Total Marks Obtained "+total+" Out of 500");
        c.setBounds(50,350,370,50);
        f1.add(c);

        JLabel e=new JLabel();
        e.setFont(new Font("Tahoma",Font.BOLD,20));
        e.setText("Percentage "+avg+" % ");
        e.setBounds(50,400,370,50);
        f1.add(e);

        JLabel d=new JLabel();
        d.setFont(new Font("Tahoma",Font.BOLD,20));
        d.setText("Grade---> "+grade);
        d.setBounds(50,490,370,50);
        f1.add(d);
        
        JButton exit=new JButton("Exit");
        exit.setBounds(210,510,80,50);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
        f1.add(exit);
        f1.setLocation(500,80);
        f1.setSize(500,700);
        f1.setVisible(true);
    }
    @SuppressWarnings("static-access")
    public static void isVaild(){
        while(true){
        if(name.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Name");
        }else if(name1.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Roll No");
        }else if(s1.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Subject Name");
        }else if(s2.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Subject Name");
        }else if(s3.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Subject Name");
        }else if(s4.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Subject Name");
        }else if(s5.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Subject Name");
        }else if(m1.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Marks");
        }else if(m2.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Marks");
        }else if(m3.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Marks");
        }else if(m4.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Marks");
        }else if(m5.getText().isEmpty()){
            message.showMessageDialog( null, "Please Provide Marks");
        }
        if(Integer.parseInt(m1.getText())>=100){
            message.showMessageDialog( null, "Please Provide Marks less than 100");
        }else if(Integer.parseInt(m2.getText())>=100){
            message.showMessageDialog( null, "Please Provide Marks less than 100");
        }else if(Integer.parseInt(m3.getText())>=100){
            message.showMessageDialog( null, "Please Provide Marks less than 100");
        }else if(Integer.parseInt(m4.getText())>=100){
            message.showMessageDialog( null, "Please Provide Marks less than 100");
        }else if(Integer.parseInt(m5.getText())>=100){
            message.showMessageDialog( null, "Please Provide Marks less than 100");
        }else{
            break;
        }
    }

        
    }
    

    Project3(){
        f.setTitle("Grade Calculator");
        f.setLayout(null);
        

        JLabel text=new JLabel("Details/Information of Student");
        text.setFont(new Font("Tahoma",Font.BOLD,15));
        text.setBounds(120,15,280,60);
        f.add(text);

        JLabel text1=new JLabel("NAME:-");
        text1.setBounds(60,100,90,40);
        f.add(text1);
        
        name=new JTextField("");
        name.setFont(new Font("Tahoma",Font.BOLD,15));
        name.setBounds(200,110,180,30);
        f.add(name);

        JLabel text2=new JLabel("ROLL NO:-");
        text2.setBounds(50,167,110,40);
        f.add(text2);
        
        name1=new JTextField("");
        name1.setFont(new Font("Tahoma",Font.BOLD,15));
        name1.setBounds(200,167,150,30);
        f.add(name1);

        JLabel subject1=new JLabel("Subject 1 :");
        subject1.setBounds(50,230,70,40);
        f.add(subject1);

        JLabel text3=new JLabel("Name-");
        text3.setBounds(50,250,110,40);
        f.add(text3);
        
         s1=new JTextField();
        
        s1.setFont(new Font("Tahoma",Font.BOLD,15));
        s1.setBounds(200,260,150,30);
        f.add(s1);

        JLabel text4=new JLabel("Marks Obtained-");
        text4.setBounds(30,290,110,40);
        f.add(text4);
        
        m1=new JTextField();
        m1.setFont(new Font("Tahoma",Font.BOLD,15));
        m1.setBounds(200,300,150,30);
        f.add(m1);
       
        //subject 2
        JLabel subject2=new JLabel("Subject 2 :");
        subject2.setBounds(50,330,70,40);
        f.add(subject2);

        JLabel text5=new JLabel("Name-");
        text5.setBounds(50,350,110,40);
        f.add(text5);
        
         s2=new JTextField();
       
        s2.setFont(new Font("Tahoma",Font.BOLD,15));
        s2.setBounds(200,350,150,30);
        f.add(s2);

        JLabel text6=new JLabel("Marks Obtained-");
        text6.setBounds(30,380,110,40);
        f.add(text6);
    
        m2=new JTextField();
        m2.setFont(new Font("Tahoma",Font.BOLD,15));
        m2.setBounds(200,390,150,30);
        f.add(m2);

        //subject 3
        JLabel subject3=new JLabel("Subject 3 :");
        subject3.setBounds(50,410,70,40);
        f.add(subject3);

        JLabel text7=new JLabel("Name-");
        text7.setBounds(50,430,110,40);
        f.add(text7);
        
         s3=new JTextField("");
        s3.setFont(new Font("Tahoma",Font.BOLD,15));
        s3.setBounds(200,430,150,30);
        f.add(s3);

        JLabel text8=new JLabel("Marks Obtained-");
        text8.setBounds(30,470,110,40);
        f.add(text8);
        
         m3=new JTextField("");
        m3.setFont(new Font("Tahoma",Font.BOLD,15));
        m3.setBounds(200,470,150,30);
        f.add(m3);

        //subject 4

        JLabel subject4=new JLabel("Subject 4 :");
        subject4.setBounds(50,490,70,40);
        f.add(subject4);

        JLabel text10=new JLabel("Name-");
        text10.setBounds(50,510,110,40);
        f.add(text10);
        
         s4=new JTextField("");
        s4.setFont(new Font("Tahoma",Font.BOLD,15));
        s4.setBounds(200,520,150,30);
        f.add(s4);

        JLabel text11=new JLabel("Marks Obtained-");
        text11.setBounds(30,540,110,40);
        f.add(text11);
        
         m4=new JTextField("");
        m4.setFont(new Font("Tahoma",Font.BOLD,15));
        m4.setBounds(200,555,150,30);
        f.add(m4);

        // subject 5
        JLabel subject5=new JLabel("Subject 5 :");
        subject5.setBounds(50,590,70,40);
        f.add(subject5);

        JLabel text12=new JLabel("Name-");
        text12.setBounds(50,610,110,40);
        f.add(text12);
        
         s5=new JTextField("");
        s5.setFont(new Font("Tahoma",Font.BOLD,15));
        s5.setBounds(200,610,150,30);
        f.add(s5);

        JLabel text13=new JLabel("Marks Obtained-");
        text13.setBounds(30,650,110,40);
        f.add(text13);
        
         m5=new JTextField("");
        m5.setFont(new Font("Tahoma",Font.BOLD,15));
        m5.setBounds(200,650,150,30);
        f.add(m5);


        JButton submit=new JButton("Submit");
        submit.setBounds(140,720,80,30);
        submit.addActionListener(this);
        f.add(submit);
        JButton exit=new JButton("Exit");
        exit.setBounds(240,720,80,30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
            System.exit(0);
            }
        });
        f.add(exit);
        f.setLocation(500,30);
        f.setSize(500,800);
        f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent ae){
        isVaild();
        total=Integer.parseInt(m1.getText())+Integer.parseInt(m2.getText())+Integer.parseInt(m3.getText())+Integer.parseInt(m4.getText())+Integer.parseInt(m5.getText());
        avg=(total/5);
        if(avg>100 && avg<=80){
            grade="O";
        }else if(avg<80 && avg >70){
            grade="A";
        }else if(avg<70 && avg >60){
            grade="B";
        }else if(avg<60 && avg >50){
            grade="C";
        }else if(avg<50 && avg >36){
            grade="D";
        }else if(avg<36 && avg >=34){
            grade="E";
        }else{
            grade="F";
        }
    result();
        
    }

    public static void main(String args[]){
        new Project3();
        
                
    }
}
