package t2_inheritance;

public class Bb extends Aa {
	// item1 = 1000; // 안되는 이유 : 필드 - 정의만 함. 동작을 시키지 못함(값 변경안됨)
	int su = item1;
	
	public Bb() {
		super(2, 3, 4);
		System.out.println("이곳은 Bb클래스의 기본생성자");
	}
	
	public Bb(int su) {
		super(10); // super()은 무조건 생성자의 첫번째에 와야한다
		System.out.println("이곳은 Bb클래스의 사용자 정의 생성자, su = "+ su);
	}
	
	public Bb(int item1, int x, int y) {
		super(item1, x, y); // super()은 무조건 생성자의 첫번째에 와야한다
		System.out.println("이곳은 Bb클래스의 사용자 정의 생성자, su = "+ su);
	}
	
//사다리꼴 면적
	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적(윗변: "+x+", 아랫변: "+y+", 높이: "+z+") : " + area);
	}
}
