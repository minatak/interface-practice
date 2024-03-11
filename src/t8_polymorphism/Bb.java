package t8_polymorphism;

public class Bb extends Aa {
	public int su = 20;
	
	public Bb() {
		System.out.println("이곳은 Bb 기본 생성자입니다.");
	}
	
	public void medBb() {
		System.out.println("이곳은 Bb 클래스의 modBb메소드입니다.");
	}

	@Override
	public void medAa() {
		System.out.println("이곳은 Bb클래스의 MedAa메소드입니당");
	}
	@Override
	public void medHh(int a, int b) {
		System.out.println("두 수의 합은?" + (a*b));
}
}
