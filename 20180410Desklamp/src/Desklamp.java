
public class Desklamp {

	//�ʵ�
	
	private boolean isOn;
	
	
	//�޼ҵ�
	public void turnOff() {
		this.isOn = false;
		
	}
	public void turnOn() {
		this.isOn = true;
		
	}
	
	public String toString() {
		if(isOn) {
			return "�����־��!";
		}
		else {
			return "�����־��!";
		}
	}
}
