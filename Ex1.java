package java0625;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//�����̳� : ������Ʈ�� ������ ���ִ� ���. ��) JFrame ������â
//������Ʈ : �����̳� �ȿ� ���ԵǾ�߸� ��Ÿ���� ��� ��) JButton��ư

//GUI���α׷������� main �������� ��Ȱ�� �ּ�ȭ��.

public class Ex1 extends JFrame {

	public Ex1() {
		setTitle("â����");//â ���� �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â�� ������ ���α׷��� �Բ� ����
														//System.exit(0);//�ڹ����α׷� ����
	
		Container contentPane=getContentPane();//����Ʈ�� ������ ��������
		contentPane.setBackground(Color.ORANGE);//����Ʈ�� ������ �������� ��� ����
		
		contentPane.setLayout(new FlowLayout());//����Ʈ�ҿ� FlowLayout��ġ�����ڸ� ����
		contentPane.add(new JButton("OK"));//����Ʈ�ҿ� ��ư�ޱ�
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		
		//���̴°Ͱ� ���õ� ����(�������� ���ش�)->������(�������)���� �ݿ�(����ȿ��)
		setLocationByPlatform(true);//setLocationByPlatform �ü���� â�� �ڿ������� ���� ��ɾ�
		setSize(400,300);//âũ�� 400x300���� (�⺻ũ�� ���μ��� ���0)
		setVisible(true);//â�� ȭ�鿡 ���̰� ����(�⺻�� ����� �Ǿ��ִ�.)
	}												   
	
	
	
	
	public static void main(String[] args) {
		new Ex1();//��ü ����

	}//main

}
