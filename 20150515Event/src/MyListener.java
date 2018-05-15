import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		//JButton의 객체라고 캐스팅을 해준다
		//e.getSource는 이벤트에서 받아온 버튼을 선택해주는것.
		
		JButton button = (JButton) e.getSource();	
		button.setText("버튼이 눌러졌어요");
		System.out.println("OMG 버튼이 눌러졌어요!!!");

	}

}
