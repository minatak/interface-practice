package t11_interface2;

public class RemoteRun {
	public static void main(String[] args) {
		Audio audio = new Audio();
		TV tv = new TV();
		
		audio.switchOn();
		audio.remotedName("audio");
		audio.switchOff();
		System.out.println();
		
		tv.switchOn();
		tv.remotedName("tv");
		tv.switchOff();
		System.out.println();
	}
}
