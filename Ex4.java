package java0625;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex4 extends javax.swing.JFrame {

	public Ex4() {
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		
		GridLayout gridLayout=new GridLayout(4,2); 
		contentPane.setLayout(gridLayout);//gridLayout ��ġ������ ����
		
		contentPane.setLayout(new BorderLayout());//��ġ������ ����
		
		contentPane.add(new JLabel("�̸�"));
		contentPane.add(new JTextField());//����
		contentPane.add(new JLabel("�й�"));
		contentPane.add(new JTextField());
		contentPane.add(new JLabel("�а�"));
		contentPane.add(new JTextField());
		contentPane.add(new JLabel("����"));
		contentPane.add(new JTextField());
	
		//���̴°Ͱ� ���õ� ����(�������� ���ش�)->������(�������)���� �ݿ�(����ȿ��)
		setLocationByPlatform(true);//setLocationByPlatform �ü���� â�� �ڿ������� ���� ��ɾ�
		setSize(300,200);//âũ�� 400x300���� (�⺻ũ�� ���μ��� ���0)
		setVisible(true);//â�� ȭ�鿡 ���̰� ����(�⺻�� ����� �Ǿ��ִ�.)
	 
	
	
	}//public Ex4

	public static void main(String[] args) {
	
		new Ex4();
	
	
	}
	
	
	
}//JFrame
