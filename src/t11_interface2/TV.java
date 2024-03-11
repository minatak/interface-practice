package t11_interface2;

public class TV implements Remote {

	@Override
	public void switchOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void remotedName(String name) {
		System.out.println(name + "리모컨");
	}

}
