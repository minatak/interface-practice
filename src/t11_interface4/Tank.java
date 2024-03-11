package t11_interface4;
	
public class Tank implements Toy {
	private int age = 13;

	@Override
	public void age() {
		System.out.println(age + "세 이상 사용할 수 있습니다.");
	}

	@Override
	public void moving() {
		System.out.println("머리부분이 움직입니다.");
	}

	@Override
	public void fire() {
		System.out.println("레이저 발사기능이 있습니다.");
	}

	@Override
	public void misail() {
		System.out.println("미사일 발사기능이 있습니다.");
	}

	@Override
	public int possibleAge() {
		return age;
	}

}
