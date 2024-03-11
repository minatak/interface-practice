package t11_interface2;

public class TVRun {
	public static void main(String[] args) {
		TV tv =  new TV();
		
		System.out.println("TV 최대 볼륨 : " + tv.MAX_VOLUME);
		System.out.println("TV 최소 볼륨 : " + tv.MIN_VOLUME);
		System.out.println();
		
		tv.switchOn();
		tv.remotedName("TV");
		tv.switchOff();
	}
}
