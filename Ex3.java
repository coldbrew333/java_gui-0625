package java0625;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex3 extends javax.swing.JFrame {

	public Ex3() {
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());//��ġ������ ����
		
		contentPane.add(new JButton("����ϱ�"),BorderLayout.CENTER);
		contentPane.add(new JButton("����"),BorderLayout.NORTH);
		contentPane.add(new JButton("����"),BorderLayout.SOUTH);
		contentPane.add(new JButton("����"),BorderLayout.EAST);
		contentPane.add(new JButton("������"),BorderLayout.WEST);
	
	
	
		//���̴°Ͱ� ���õ� ����(�������� ���ش�)->������(�������)���� �ݿ�(����ȿ��)
				setLocationByPlatform(true);//setLocationByPlatform �ü���� â�� �ڿ������� ���� ��ɾ�
				setSize(400,300);//âũ�� 400x300���� (�⺻ũ�� ���μ��� ���0)
				setVisible(true);//â�� ȭ�鿡 ���̰� ����(�⺻�� ����� �Ǿ��ִ�.)
	
	
	
	}//public Ex3

	public static void main(String[] args) {
	 new Ex3();
	}
	
	
	
}//JFrame
