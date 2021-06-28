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
		
		
		
		//±âº» ¹èÄ¡°ü¸®ÀÚ´Â BorderLayout
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));//¹èÄ¡°ü¸®ÀÚ ¼³Á¤
		
		contentPane.add(new JButton("µ¡¼À"));
		contentPane.add(new JButton("»¬¼À"));
		contentPane.add(new JButton("°ö¼À"));
		contentPane.add(new JButton("³ª´°¼À"));
		contentPane.add(new JButton("°è»êÇÏ±â"));
	
	setLocationByPlatform(true);
	setSize(300,200);
	setVisible(true);
	
	
	
	}
	
	public static void main(String[] args) {
		 new Ex2();

	}//main

}
