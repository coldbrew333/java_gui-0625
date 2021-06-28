
package java0625;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//배치관리자 없는 컨테이너에 컴포넌트의 위치와 크기를 절대값으로 지정해야 한다.
public class Ex5 extends JFrame {
	
	public Ex5() {
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container contentPane=getContentPane();
	getContentPane().setLayout(null);//컨텐트팬의 배치관리자 제거하기
		
		JLabel jLabel = new JLabel("안녕하세요~");
		jLabel.setLocation(130,50);
		jLabel.setSize(200,20);
		contentPane.add(jLabel);
		
		
		//버튼 컴포넌트 9개를 동일한크기로 설정
		//위치는 서로 다르게 설정
		for(int i=1;i<=9;i++) {
			JButton btn = new JButton(String.valueOf(i));
			btn.setLocation(i*15,i*15);//버튼위치설정
			btn.setSize(50,20);
			contentPane.add(btn);//버튼을 컨텐트팬 영역에 부착하기
		}
	
	
	
	
	
	
	
	
	
		//보이는것과 관련된 설정(마지막에 해준다)->최종적(구성요소)으로 반영(갱신효과)
		setLocationByPlatform(true);//setLocationByPlatform 운영체제가 창을 자연스럽게 여는 명령어
		setSize(300,200);//창크기 400x300설정 (기본크기 가로세로 모두0)
		setVisible(true);//창을 화면에 보이게 설정(기본이 숨기기 되어있다.)
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		
		new Ex5();

	}

}
