package t11_interface4;

import java.util.Scanner;

/*
 		 기능   	곰돌이		로보트		비행기	  탱크
 		움직임	   O        O       x      O
 		레이저(불) X				  X			  O		   O
 		미사일 		 X				O			  O			 O
 		연령			전연령		  4~		  8~		13세 이상
 		
 		구매 어린이의 나이를 입력하여 구매 가능한 장난감을 표시해주세요.
 */

public class ToyRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Toy[] toys = {new Bear(), new Robot(), new Airplane(), new Tank()};
		String[] titles = {"곰돌이","로보트","비행기","탱크"};
		int[] possible = new int[4];
		
		for(int i=0; i<toys.length; i++) {
			System.out.println("장난감 : " + titles[i]);
			
			toys[i].moving();
			toys[i].fire();
			toys[i].misail();
			toys[i].possibleAge();
			System.out.println();
			possible[i] = toys[i].possibleAge();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		int age;
		System.out.print("어린이의 나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		System.out.println("구매 가능한 장난감: ");
			for(int i=0; i<titles.length; i++) {
				if(age >= possible[i]) {
					System.out.print(titles[i] + " / ");
				}
			}
			System.out.println("\n 감사합니다.");
			System.out.println();
		
		sc.close();
	}
}
