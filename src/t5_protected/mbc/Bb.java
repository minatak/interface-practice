package t5_protected.mbc;

import t5_protected.kbs.Aa;

public class Bb extends Aa {
	public int a2 = 10;
	protected int b2 = 20;
	int c2 = 30;
	private int d2 = 40;
	
	public void modA2() {
		System.out.println("이곳은 Bb클래스의 modA2메소드 입니다.");
	}
	protected void modB2() {
		System.out.println("이곳은 Bb클래스의 modB2메소드 입니다.");
	}
	void modC2() {
		System.out.println("이곳은 Bb클래스의 modC2메소드 입니다.");
	}
	private void modD2() {
		System.out.println("이곳은 Bb클래스의 modD2메소드 입니다.");
	}
	
	@Override
	public void test() {
		modC2();
		
		a = 100;
		b = 200;
		//c = 300; default 라서 상속 안됨
		//d = 400; private 이라서 상속 안됨
		int d = getD(); // Aa에 있는 부모변수와 전혀 관계없는 다른 변수임
		System.out.println("d " + d);
	}
}
