import java.awt.*;

import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dakyo 2nd Frame");
		
		//add new component on the frame

		
		setLayout(new FlowLayout());
		//setLayout�޼ҵ�� JFrame�� ���� ������Ʈ���� ��ġ����� �����ϴ� �޼ҵ�.
		//FlowLayout�� ���ʿ��� ����������, ������ �Ʒ��� �������
		//�����̳��� ũ�Ⱑ ����Ǹ� ������Ʈ���� ��ġ�� ���ϰ� ũ��� ����.
		
		JLabel label = new JLabel("�ٱ���");
		JTextField tf = new JTextField(20);	//��ĭ���� ���ֱ�
		JPasswordField pw = new JPasswordField(15);
		JButton button = new JButton();
		
		button.setText("ON");
		button.setEnabled(false);
		tf.setText("�̴ٱ����� �����ϼ̽��ϴ�.");
		
		//�г� ����
		JPanel p = new JPanel();
		//�гξȿ� add�� ���̺�� textfield�� �־��ش�.
		p.add(label);
		p.add(tf);
		
		//������ �ȿ� �г��� �߰����ش�.
		add(p);
		
		this.add(pw);
		this.add(button);
		
//		pack();		//������ ����� ������Ʈ ������� ���巯�ش�
		
		setVisible(true);

	}
	
}