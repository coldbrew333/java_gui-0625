package java0625;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//컨테이너 : 컴포넌트를 포함할 수있는 요소. 예) JFrame 윈도우창
//컴포넌트 : 컨테이너 안에 포함되어야만 나타나는 요소 예) JButton버튼

//GUI프로그램에서는 main 스레드의 역활이 최소화됨.

public class Ex1 extends JFrame {

	public Ex1() {
		setTitle("창제목");//창 제목 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 닫힐때 프로그램도 함께 종료
														//System.exit(0);//자바프로그램 종료
	
		Container contentPane=getContentPane();//컨텐트팬 영역을 가져오기
		contentPane.setBackground(Color.ORANGE);//컨텐트팬 영역에 오렌지색 배경 설정
		
		contentPane.setLayout(new FlowLayout());//컨텐트팬에 FlowLayout배치관리자를 설정
		contentPane.add(new JButton("OK"));//컨텐트팬에 버튼달기
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		
		//보이는것과 관련된 설정(마지막에 해준다)->최종적(구성요소)으로 반영(갱신효과)
		setLocationByPlatform(true);//setLocationByPlatform 운영체제가 창을 자연스럽게 여는 명령어
		setSize(400,300);//창크기 400x300설정 (기본크기 가로세로 모두0)
		setVisible(true);//창을 화면에 보이게 설정(기본이 숨기기 되어있다.)
	}												   
	
	
	
	
	public static void main(String[] args) {
		new Ex1();//객체 생성

	}//main

}
