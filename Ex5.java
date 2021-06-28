
package java0625;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//��ġ������ ���� �����̳ʿ� ������Ʈ�� ��ġ�� ũ�⸦ ���밪���� �����ؾ� �Ѵ�.
public class Ex5 extends JFrame {
	
	public Ex5() {
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container contentPane=getContentPane();
	getContentPane().setLayout(null);//����Ʈ���� ��ġ������ �����ϱ�
		
		JLabel jLabel = new JLabel("�ȳ��ϼ���~");
		jLabel.setLocation(130,50);
		jLabel.setSize(200,20);
		contentPane.add(jLabel);
		
		
		//��ư ������Ʈ 9���� ������ũ��� ����
		//��ġ�� ���� �ٸ��� ����
		for(int i=1;i<=9;i++) {
			JButton btn = new JButton(String.valueOf(i));
			btn.setLocation(i*15,i*15);//��ư��ġ����
			btn.setSize(50,20);
			contentPane.add(btn);//��ư�� ����Ʈ�� ������ �����ϱ�
		}
	
	
	
	
	
	
	
	
	
		//���̴°Ͱ� ���õ� ����(�������� ���ش�)->������(�������)���� �ݿ�(����ȿ��)
		setLocationByPlatform(true);//setLocationByPlatform �ü���� â�� �ڿ������� ���� ��ɾ�
		setSize(300,200);//âũ�� 400x300���� (�⺻ũ�� ���μ��� ���0)
		setVisible(true);//â�� ȭ�鿡 ���̰� ����(�⺻�� ����� �Ǿ��ִ�.)
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		
		new Ex5();

	}

}
