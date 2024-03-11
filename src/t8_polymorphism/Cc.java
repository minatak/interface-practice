package t8_polymorphism;

public class Cc extends Aa {
	public int su = 30;
	
	public Cc() {
		System.out.println("이곳은 Cc 기본 생성자입니다.");
	}
	
	@Override
	public void medCc() {
		System.out.println("이곳은 Cc 클래스의 modCc메소드입니다.");
	}

	@Override
	public void medHh(int a, int b) {
		System.out.println("두 수의 합은?" + (a+b));
	}
	
	
	
}
