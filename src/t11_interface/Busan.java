package t11_interface;

public class Busan implements Test1 { // 부산 클래스->test1 인터페이스를 상속받아서 사용하는 구현체(implement)이다. 
	int min;

	@Override
	public void data() {
		System.out.println("이곳은 Busan클래스의 data메소드 입니다.");
	}

	@Override
	public void data1(int su) {
		if(su<MIN) min = su;
		System.out.println("최소값: " + min);
	}

	@Override
	public void data2() {
		System.out.println("이곳은 Busan클래스의 data메소드 입니다.");
	}

}
