package java0625;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2 extends JFrame {
	public Ex2() {
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane =(JPanel)getContentPane();
		
		
		
		//�⺻ ��ġ�����ڴ� BorderLayout
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));//��ġ������ ����
		
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("������"));
		contentPane.add(new JButton("����ϱ�"));
	
	setLocationByPlatform(true);
	setSize(300,200);
	setVisible(true);
	
	
	
	}
	
	public static void main(String[] args) {
		 new Ex2();

	}//main

}
