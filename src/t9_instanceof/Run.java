package t9_instanceof;

public class Run {
	public static void main(String[] args) {
		
		// Aa aa = new Aa();
		Aa aa = new Bb();
		
		// aa객체가 과거에 Aa타입으로 업캐스팅 했었는지를 알아보고 처리해야 함.(instanceof)
		if(aa instanceof Bb)  {// instanceof앞이 객체(변수)명, 뒤에가 타입명.
			Bb bb = (Bb)aa;
			System.out.println("Down Casting 성공~!");
		}
		else {
			System.out.println("Down Casting 불가...");
		}
	}
}
