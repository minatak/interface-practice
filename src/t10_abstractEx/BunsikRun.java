package t10_abstractEx;

public class BunsikRun {
	public static void main(String[] args) {
		WangjaBunsik wangjaBunsik = new WangjaBunsik();
		wangjaBunsik.getShopName();
		wangjaBunsik.kimchi();
		wangjaBunsik.budae();
		wangjaBunsik.bibim();
		wangjaBunsik.sundae();
		wangjaBunsik.konggi();
		System.out.println("===================");
		
		SeoulBunsik seoulBunsik = new SeoulBunsik();
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println("===================");
		
		WoojuBunsik woojuBunsik = new WoojuBunsik();
		woojuBunsik.getShopName();
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibim();
		woojuBunsik.sundae();
		woojuBunsik.konggi();
		System.out.println("===================");
	}
}
