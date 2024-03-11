package t11_interface4;

import java.util.Scanner;

/*
 		 기능   	곰돌이		로보트		비행기	  탱크
 		움직임	   O        O       x      O
 		레이저(불) X				  X			  O		   O
 		미사일 		 X				O			  O			 O
 		연령			전연령		  4~		  8~		13세 이상
 		
 		장난감 목록을 표시해주고, 해당 장난감의 기능을 보여주세요.
 		e.g. 어떤 장ㄴ
 */

public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Toy[] toys = {new Bear(), new Robot(), new Airplane(), new Tank()};
		String[] titles = {"곰돌이","로보트","비행기","탱크"};
		String buy;
		int choice;
		
		while(true) {
			System.out.println();
			System.out.print("어떤 장난감 구매를 희망하시나요? \n1.곰돌이 2.로보트 3.비행기 4.탱크 0.종료 > ");
			choice = sc.nextInt();
			
			if(choice == 0) break;
			
			System.out.println();
			System.out.println("~" + titles[choice - 1] + "의 기능 ~");
			toys[choice - 1].moving();
			toys[choice - 1].fire();
			toys[choice - 1].misail();
			toys[choice - 1].age();
			
			System.out.println();
			System.out.print("구매를 희망하십니까?(Y/N) > ");
			buy = sc.next().toUpperCase();
			if(buy.equals("N")) {
				System.out.print("다음에 또 이용해주세요."); 
				break;
				}
			else System.out.println(titles[choice - 1] + " 구매가 확정되었습니다. ");
		}
		System.out.println("감사합니다.");
		sc.close();
	}
}
