
public class Desklamp {

	//필드
	
	private boolean isOn;
	
	
	//메소드
	public void turnOff() {
		this.isOn = false;
		
	}
	public void turnOn() {
		this.isOn = true;
		
	}
	
	public String toString() {
		if(isOn) {
			return "켜져있어용!";
		}
		else {
			return "꺼져있어용!";
		}
	}
}
