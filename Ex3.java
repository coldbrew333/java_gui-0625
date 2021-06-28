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
		contentPane.setLayout(new BorderLayout());//배치관리자 설정
		
		contentPane.add(new JButton("계산하기"),BorderLayout.CENTER);
		contentPane.add(new JButton("덧셈"),BorderLayout.NORTH);
		contentPane.add(new JButton("뺄셈"),BorderLayout.SOUTH);
		contentPane.add(new JButton("곱셈"),BorderLayout.EAST);
		contentPane.add(new JButton("나눗셈"),BorderLayout.WEST);
	
	
	
		//보이는것과 관련된 설정(마지막에 해준다)->최종적(구성요소)으로 반영(갱신효과)
				setLocationByPlatform(true);//setLocationByPlatform 운영체제가 창을 자연스럽게 여는 명령어
				setSize(400,300);//창크기 400x300설정 (기본크기 가로세로 모두0)
				setVisible(true);//창을 화면에 보이게 설정(기본이 숨기기 되어있다.)
	
	
	
	}//public Ex3

	public static void main(String[] args) {
	 new Ex3();
	}
	
	
	
}//JFrame
