package t4_override;

public class Cc extends Aa {

//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이 = " + area);
//	}
	
	@Override
	public void areaCircle(int r) {
		double area = r * r * Math.PI;
		System.out.println("반지름 "+r+"인 원넓이 = " + area);
	}
	
	public void areaCircle2(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이 = " + area);
		super.areaCircle(r);
	}
	
}
