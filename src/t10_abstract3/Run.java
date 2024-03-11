package t10_abstract3;

public class Run {
	public static void main(String[] args) {
		Phone samsungPhone = new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsung();
		samsungPhone.powerOff();
		System.out.println();
		
		Phone LgPhone = new Lg("김말숙");
		LgPhone.powerOn();
		LgPhone.sound();
		LgPhone.function();
		LgPhone.functionLg();
		LgPhone.powerOff();
		System.out.println();
	}
}
