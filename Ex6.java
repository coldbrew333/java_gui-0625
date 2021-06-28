package java0625;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex6 extends JFrame {
	
	public Ex6() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		GridLayout gridLayout = new GridLayout(4, 2);
		contentPane.setLayout(gridLayout); // GridLayout ��ġ������ ����
		
		contentPane.add(new JLabel("�̸�"));
		contentPane.add(new JTextField());
		contentPane.add(new JLabel("�й�"));
		contentPane.add(new JTextField());
		contentPane.add(new JLabel("�а�"));
		contentPane.add(new JTextField());
		contentPane.add(new JLabel("����"));
		contentPane.add(new JTextField());
		
		setLocationByPlatform(true);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex6();
	}

}
