package t11_interface;

public interface Test1 {
	int MAX = 1000000;  // 글자가 약간 옆으로 누움 -> 상수. static이 자동으로 붙음 (근데 생략해서 보임)
	public static final int MIN = 0; // 가급적이면 상수명 대문자로 쓰는게 좋음. 소문자로 쓰면 변수 선언과 햇갈릴 수 있음
	
	void data(); // -> 추상 메소드인데 public abstract void 생략돼보이는것
	void data1(int su);
	public abstract void data2(); // 위,아래 똑같은것. 추상 메소드.
	
	default void data3() {	// 실행블록{} 필요
	// 실행할 내용을 포함/생략함	
		System.out.println("이곳은 data3메소드(default)");
	} 
	
	
	static void data4() {	 // 실행블록{} 필요
		// 실행할 내용을 포함/생략함 (근데 포함하는게 좋음)
		System.out.println("이곳은 data4메소드(static)");
	}
}
