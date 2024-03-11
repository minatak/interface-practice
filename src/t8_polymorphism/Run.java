package t8_polymorphism;

public class Run {
	public static void main(String[] args) {
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("bb.su : " + bb.su);
		bb.medBb();
		bb.medAa();
		System.out.println();

		/*------------Up Casting---------------*/
		
		Aa ba = new Bb();
		ba.medAa();
		System.out.println();
		
		/*------------Down Casting---------------*/
		// 부모로 Up Casting이 되어있을 경우에만 자신으로 Down Casting할 수 있다.
		Bb bab = (Bb)ba;
		bab.medAa();
		bab.medBb();
		System.out.println();
		/*---------------------------------*/
		Aa ca = new Cc();
		ca.medAa();
		ca.medCc();
		ca.medHh(50, 100);
		ba.medHh(50, 100);
	}
}
