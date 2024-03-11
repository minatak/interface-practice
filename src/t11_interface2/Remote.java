package t11_interface2;

public interface Remote {
	public static final int MAX_VOLUME = 10; // 상수. 초기값 10
	int MIN_VOLUME = 0; // public static final 생략됨
	
	public abstract void switchOn();
	void switchOff();
	
	void remotedName(String name);
}
