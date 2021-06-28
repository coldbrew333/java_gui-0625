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
		contentPane.setLayout(gridLayout);//gridLayout 배치관리자 설정
		
		contentPane.setLayout(new BorderLayout());//배치관리자 설정
		
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField());//한줄
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField());
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField());
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField());
	
		//보이는것과 관련된 설정(마지막에 해준다)->최종적(구성요소)으로 반영(갱신효과)
		setLocationByPlatform(true);//setLocationByPlatform 운영체제가 창을 자연스럽게 여는 명령어
		setSize(300,200);//창크기 400x300설정 (기본크기 가로세로 모두0)
		setVisible(true);//창을 화면에 보이게 설정(기본이 숨기기 되어있다.)
	 
	
	
	}//public Ex4

	public static void main(String[] args) {
	
		new Ex4();
	
	
	}
	
	
	
}//JFrame
