package t11_interface2;

public class RemoteRun2 {
	public static void main(String[] args) {
//		Remote audio = new Audio();
//		Remote tv = new TV();
		
		Remote[] remotes = {new Audio(), new TV()};
		String[] titles = {"Audio", "TV"};
		
		for(int i=0; i<remotes.length; i++) {
			remotes[i].switchOn();
			remotes[i].remotedName(titles[i]);
		  remotes[i].switchOff();
		  System.out.println();
		}
		
		/*
		audio.switchOn();
		audio.remotedName("audio");
		audio.switchOff();
		System.out.println();
		
		tv.switchOn();
		tv.remotedName("tv");
		tv.switchOff();
		System.out.println();
		*/
	}
}
