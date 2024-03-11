package t11_interface6;

import java.util.Scanner;

public class ActorRun {
	public static void main(String[] args) {
		Actor actor = new Actor();
		Scanner sc = new Scanner(System.in);
		int act = 0;
		
		actor.catching();
		actor.fire();
		actor.pizza();
		actor.safe();
		actor.search();
		actor.spaghetti();
		System.out.println("=========================================");
		
		String[] titles = {"경찰관", "소방관", "요리사"};
		
		while(true) {
			System.out.print("원하는 배역을 선택하세요. (1.경찰관 2.소방관 3.요리사 4.종료) ==> ");
			act = sc.nextInt();
			
			if(act < 1 || act > 3) {
				if(act == 4) break;
				System.out.println("1,2,3번의 배역만 조회가 가능합니다.");
				continue;
			}
			// 각각의 역할을 출력
			System.out.println(titles[act - 1] + "의 역할 : ");
			switch(act) {
				case 1 : 
					actor.catching();
					actor.search();
					break;
				case 2 : 
					actor.fire();
					actor.safe();
					break;
				case 3 : 
					actor.pizza();
					actor.spaghetti();
					break;
		}
		System.out.println("============================");
		System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}

