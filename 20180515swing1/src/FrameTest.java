import javax.swing.JFrame;	//��Ű�� ����Ʈ ���Ѿߴ��.

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Dakyo Frame");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//EXIT_ON_CLOSE�� static variable
		f.setVisible(true);	//�긦 true�� �����ؾ߸� ���δ�!
	}
}
