package gui1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

public class gui3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
    private String password_1;
    private String id_1;
	private Scanner x;
	public int i=0;
	public int temp_4;
	FileWriter fw;
	PrintWriter pw;
	//private File x;
		public void writeFile(int j)
		{
		
			try {
				fw= new FileWriter("a.txt",false); ///false to rewrite
				
				pw= new PrintWriter(fw);
				pw.printf("%d",j);
				System.out.println("Data succes");
				pw.flush();
				
			
					pw.close();
					fw.close();
			}catch(IOException io) {}
			}
		
		
		
			
		
	tuk user[]=new tuk[10];
	
	public void openFile() {
		
		try {
			x= new Scanner(new File("abci.txt"));
		}
	
	catch(Exception e) {
		System.out.println("couldnt find file");
	  }
	
		while(x.hasNext())
		{
			
			user[i]=new tuk();
	
		user[i].username= x.next();
		user[i].id= x.next();
		user[i].country= x.next();
		user[i].major=x.next();
		user[i].phone= x.next();
		user[i].age=x.next();
		user[i].sex=x.next();
		user[i].password=x.next();
			
	   // System.out.printf("%s %s %s %s %s %s %s %s%n",user[i].username,user[i].id,user[i].country,user[i].major,user[i].phone,user[i].age,user[i].sex,user[i].password);
			i++;
		}
	
	
		x.close();	
	
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui3 frame = new gui3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui3() {
		
		setTitle("chakan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		textField.setBounds(251, 139, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(251, 203, 130, 26);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("    学号");
		lblNewLabel.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(85, 144, 123, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("输入信息");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(191, 75, 174, 26);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(180, 283, 117, 29);
		contentPane.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
		        openFile();
		        //System.out.println(i);
		        id_1=textField.getText();
		        password_1=passwordField.getText();
		       System.out.println(i);
		        //temp_4=1;
		        if(i==1) {
		        	if(id_1.equals(user[0].id)&&password_1.equals(user[0].password))
		        	{
		        		//count_1=i;
		        		System.out.println("tem====111111");
		        		writeFile(0);
		        			JOptionPane.showMessageDialog(null, "正确!");
		        			temp_4=1;
		        			
		        }
		        	else 
		        	{
		        		JOptionPane.showMessageDialog(null, "不对!,重新输入");
	        			temp_4=0;
		        	}
		        }
		        	else if(i>1)
		        	{
		        for(int j=0;j<=i-1;j++)
		        {
		        	
		        	if(id_1.equals(user[j].id)&&password_1.equals(user[j].password))
		        	{
		        		//count_1=i;
		        		System.out.println("tem====111111");
		        		writeFile(j);
		        			JOptionPane.showMessageDialog(null, "正确!");
		        			temp_4=1;
		        			break;
		        		
		        			
		        		
		        	}
		        
		        	else if(j==i-1 && !id_1.equals(user[j].id)&&!password_1.equals(user[j].password))
		        	{
		        			JOptionPane.showMessageDialog(null, "不对!,重新输入");
		        			temp_4=0;
		        	}
		        	
		        		
		        	
		        }
		        	}
		        if(temp_4==1)
		        {
		        dispose();
				gui4 gui4 = new gui4();//
				gui4.setVisible(true);
		        }
		
			}
		});
		/*
		JButton btnNewButton_1 = new JButton("退出");
		btnNewButton_1.setBounds(264, 283, 117, 29);
		contentPane.add(btnNewButton_1);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(temp_4!=1 && ) {
				JOptionPane.showMessageDialog(null, "谢谢使用,再见 !");
				dispose();
				}
			}
			});
			*/
		JLabel label = new JLabel("    密码");
		label.setForeground(UIManager.getColor("InternalFrame.borderShadow"));
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		label.setBounds(85, 208, 123, 26);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookpro/Desktop/eclipse/my_tut/win_3/bin/gui1/s.jpg"));
		lblNewLabel_1.setBounds(0, 0, 572, 448);
		contentPane.add(lblNewLabel_1);
	}
}
class tuk{
	public String username;
	public String id;
	public String country;
	public String major;
	 public String phone;
	public String age;
	public String sex;
	public String password;
	
}