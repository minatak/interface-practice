package t11_interface5;

public interface Action {

	// 경찰관(범인잡기, 물건찾기)
	void catching();
	void search();
	
	// 소방관(불을 끈다, 구조한다)
	void fire();
	void safe();
	
	// 요리사(피자, 스파게티를 만든다)
	void pizza();
	void spaghetti();
	
	// 역할명
	default void action(String action) {
		System.out.println(action + "의 역할 : ");
	}
}
