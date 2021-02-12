package gui1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class gui2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ButtonGroup bg;
	private JRadioButton male;
	private JRadioButton female;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private String country;
	private String major;
	private String phone;
	private String id;
	private String sex;
	private String age;
	private String username;
	private String password;
	public int count=0;
	private int temp=1;
	
	private Scanner z;
	
muk user[]=new muk[20];
	
	public void openFile() {
		
		try {
			z= new Scanner(new File("abci.txt"));
		}
	
	catch(Exception e) {
		System.out.println("couldnt find file");
	  }
	
		while(z.hasNext())
		{
			
			user[count]=new muk();
	
		user[count].username= z.next();
		user[count].id= z.next();
		user[count].country= z.next();
		user[count].major=z.next();
		user[count].phone= z.next();
		user[count].age=z.next();
		user[count].sex=z.next();
		user[count].password=z.next();
			
	  
			count++;
		}
	
	
		z.close();	
	
	}
	
	
	FileWriter fww;
	PrintWriter pww;
	//private File x;
	
		public void write(int j)
		{
		
			try {
				fww= new FileWriter("a.txt",false); ///false to rewrite
				
				pww= new PrintWriter(fww);
				pww.printf("%d",j);
				System.out.println("Data succes");
				pww.flush();
				
			
					pww.close();
					fww.close();
			}catch(IOException io) {}
			}
	
		
		
	FileWriter fw;
	BufferedWriter bw;
	PrintWriter pw;
	//private File x;
		public void writeFile()
		{
			fw=null;
			bw=null;
			pw=null;
			try {
				fw= new FileWriter("abci.txt",true);
				bw= new BufferedWriter(fw);
				pw= new PrintWriter(bw);
				pw.printf("%s %s %s %s %s %s %s %s%n",username,id,country,major,phone,age,sex,password);
				System.out.println("Data succes");
				pw.flush();
				
			
					pw.close();
					bw.close();
					fw.close();
			}catch(IOException io) {}
			}
		
		
		
	
		
	
	//public void count();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui2 frame = new gui2();
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
	public gui2() {
		
		setTitle("information window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     姓名");
		lblNewLabel.setBounds(94, 23, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("     学号");
		lblNewLabel_1.setBounds(94, 61, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 230, 250));
		textField.setBounds(182, 18, 104, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setBounds(182, 56, 104, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("     国家");
		lblNewLabel_5.setBounds(94, 103, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		String s2[]= {"中国","土库曼斯坦","突尼斯","马拉维","未知"};
		JComboBox comboBox_1 = new JComboBox(s2);
		country=comboBox_1.getSelectedItem().toString();
		
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			if(arg0.getStateChange()==ItemEvent.SELECTED) {
				country=comboBox_1.getSelectedItem().toString();
				
			}
			}});
		comboBox_1.setBounds(182, 99, 104, 27);
		contentPane.add(comboBox_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("     专业");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(94, 148, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		String s1[]= {"计算机","通信工程","医学","经济学","未知"};
		JComboBox comboBox = new JComboBox(s1);
		comboBox.setSelectedIndex(0);
		major=comboBox.getSelectedItem().toString();
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			if(arg0.getStateChange()==ItemEvent.SELECTED) {
				
				major=comboBox.getSelectedItem().toString();
			
			}
			}});
		comboBox.setBounds(182, 126, 104, 63);
		
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("     年龄");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(94, 230, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 250, 240));
		textField_2.setBounds(182, 225, 104, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("     性别");
		lblNewLabel_4.setBackground(Color.RED);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(94, 258, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		bg = new ButtonGroup();
		male = new JRadioButton("男");
		female = new JRadioButton("女");
		bg.add(male);
		bg.add(female);
		male.setBounds(182,254,61,23);
		female.setBounds(245,254,54,23);
		contentPane.add(male);
		contentPane.add(female);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("  手机号");
		lblNewLabel_6.setForeground(Color.GREEN);
		lblNewLabel_6.setBounds(82, 23, 204, 359);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 250, 205));
		textField_3.setBounds(182, 187, 104, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("  密码");
		lblNewLabel_7.setForeground(Color.CYAN);
		lblNewLabel_7.setBounds(106, 302, 61, 16);
		contentPane.add(lblNewLabel_7);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(250, 240, 230));
		passwordField.setBounds(182, 297, 104, 26);
		contentPane.add(passwordField);
		
		
		
	   
	   
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setBounds(82, 353, 104, 29);
		contentPane.add(btnNewButton);
		openFile();
		btnNewButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0)
			{
				 id = textField_1.getText();
				    phone=textField_3.getText();
				    age=textField_2.getText();
				username = textField.getText();
				 if(male.isSelected())
				    	sex= "男";
				    if(female.isSelected())
				    	sex="女";
				    
				    password = passwordField.getText();
				    
				    
				if(username.length()==0||id.length()==0||phone.length()==0||age.length()==0||sex==null||password.length()==0)
					JOptionPane.showMessageDialog(null, "fill all information!");
				else { 
					
				
				for(int k=0;k<=count-1;k++)
				{
					
					if(id.equals(user[k].id))
					{
						
						JOptionPane.showMessageDialog(null, "这个学号已经存在 !");
						temp=0;
						break;
					}
					
					if(k==count-1)
					{
						
						temp=1;
					}
						
				}
				
				if(temp==1) {
				writeFile();
				
				write(count);
				
				JOptionPane.showMessageDialog(null, "加入成功!");
				dispose();
				gui4 gui_4 = new gui4();//
				gui_4.setVisible(true);
				}
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton(" exit");
		btnNewButton_1.setBounds(182, 353, 117, 29);
		
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addMouseListener(new MouseAdapter() { 
			public void mouseClicked(MouseEvent e)
			{
				JOptionPane.showMessageDialog(null, "谢谢使用,再见 !");
		        dispose();
		
			}
		});
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("/Users/macbookpro/Desktop/eclipse/my_tut/win_2/bin/win_2/1.jpg"));
		lblNewLabel_9.setBounds(0, 0, 559, 448);
		contentPane.add(lblNewLabel_9);
		
		
		
		
		
		
		
	}
}
class muk{
	public String username;
	public String id;
	public String country;
	public String major;
	 public String phone;
	public String age;
	public String sex;
	public String password;
	
}