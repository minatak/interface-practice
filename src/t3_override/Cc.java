package t3_override;

public class Cc extends Aa {

	//이것이 오버라이드!!!!
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이 = " + area);
//	}
	
	//재정의한게 없어도 오버라이드! (밑에)
//	public void areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이 = " + area);
//	}
	
//	public double areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이 = " + area);
//		return area; // -> 오버라이드는 선언부가 완전히 같아야하고 리턴타입까지도 같아야 한다. 
//	}
	public void areaCircle(int r) {
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이 = " + area);
	}
	public void areaCircle2(int r) {
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이 = " + area);
	} // 오버라이드 아님 (선언부가 다름)
	
}
