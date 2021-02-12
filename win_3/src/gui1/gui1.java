package gui1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Frame;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;


public class gui1 {

	public int count_1=0;
	ImageIcon image1;
	JLabel background;
	//JButton add;
	JButton check;
	
	private JFrame frmMainwindow;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui1 window = new gui1();
					window.frmMainwindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui1() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainwindow = new JFrame();
		frmMainwindow.setTitle("MainWindow");
		frmMainwindow.setBounds(100, 100, 559, 460);
		frmMainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainwindow.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("         新学生加入 ");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setBounds(27, 145, 225, 53);
		frmMainwindow.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("查看学生的信息");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2.setBounds(61, 250, 190, 16);
		frmMainwindow.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("     从下面选一个");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(163, 98, 225, 16);
		frmMainwindow.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("查看信息");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(345, 245, 117, 29);
		frmMainwindow.getContentPane().add(btnNewButton);
		
		JButton add = new JButton("加信息");
		add.setForeground(Color.BLUE);
		add.setBounds(345,160,117,25);
		frmMainwindow.getContentPane().add(add);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/macbookpro/Desktop/eclipse/my_tut/win_2/bin/win_2/w.jpg"));
		lblNewLabel.setBounds(0, 0, 599, 417);
		frmMainwindow.getContentPane().add(lblNewLabel);
		add.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				frmMainwindow.dispose();
				gui2 gui2=new gui2();
				gui2.setVisible(true);
			}
		}
			);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
			frmMainwindow.dispose();
			gui3 gui3 = new gui3();//
			gui3.setVisible(true);
			
			}
		}
		);
		
		
	}
}
