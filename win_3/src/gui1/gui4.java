package gui1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class gui4 extends JFrame {
 public int count;
	private JPanel contentPane;
	private Scanner x;
	public int i=0;
	huk user[]=new huk[20];
	Scanner scanner;
	public void read() {
		try {
	 scanner = new Scanner(new File("a.txt"));
		}
		catch(Exception e) {
			System.out.println("couldnt find file");
		  }
	
		     count = scanner.nextInt();
		     //System.out.println(count);
		
	}
	
	public void openFile() {
		
		try {
			x= new Scanner(new File("abci.txt"));
		}
	
	catch(Exception e) {
		System.out.println("couldnt find file");
	  }
	
		while(x.hasNext())
		{
			
			user[i]=new huk();
	
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
					gui4 frame = new gui4();
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
	public gui4() {
		read();
		openFile();
		setTitle("信息窗口");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 99, 71));
		textArea.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 15));
		textArea.setBackground(new Color(47, 79, 79));
		textArea.setBounds(125, 111, 296, 302);
		contentPane.add(textArea);
		/*
		
		
		*/
		JLabel lblNewLabel = new JLabel("personal information");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setForeground(UIManager.getColor("InternalFrame.borderShadow"));
		lblNewLabel.setBounds(173, 31, 201, 39);
		contentPane.add(lblNewLabel);
				
				
	
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/macbookpro/Desktop/eclipse/my_tut/win_3/bin/gui1/e.jpg"));
		lblNewLabel_1.setBounds(0, 0, 559, 438);
		contentPane.add(lblNewLabel_1);
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("   姓名:   ").append(user[count].username);
		sb.append("\n\n");
		sb.append("   学号:   ").append(user[count].id);
		sb.append("\n\n");
		sb.append("   国家:   ").append(user[count].country);
		sb.append("\n\n");
		sb.append("   专业:   ").append(user[count].major);
		sb.append("\n\n");
		sb.append("  手机号:   ").append(user[count].phone);
		sb.append("\n\n");
		sb.append("   年龄:   ").append(user[count].age);
		sb.append("\n\n");
		sb.append("   性别:   ").append(user[count].sex);
		sb.append("\n\n");
		
		textArea.setText(sb.toString());
		
		
		
	}
}
class huk{
	public String username;
	public String id;
	public String country;
	public String major;
	 public String phone;
	public String age;
	public String sex;
	public String password;
	
}