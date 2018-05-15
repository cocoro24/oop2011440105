import javax.swing.JFrame;	//패키지 임포트 시켜야댄당.

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Dakyo Frame");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//EXIT_ON_CLOSE는 static variable
		f.setVisible(true);	//얘를 true로 설정해야만 보인당!
	}
}
