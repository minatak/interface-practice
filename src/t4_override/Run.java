package t4_override;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Cc cc = new Cc();
		
		Aa aa = new Aa();
		
	//	cc.areaCircle(50);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.신라 2.백제 3.종료 : ");
			int ans = sc.nextInt();
			System.out.print("계산할 반지름을 입력하세요 : ");
			int r = sc.nextInt();
			
			if(ans == 1) cc.areaCircle(r);
			else if(ans == 2) cc.areaCircle2(r);
			else if(ans == 3) {
				System.out.println("종료하겠습니다.");
				break;
			}
			else System.out.println("코드를 확인 후 다시 처리해주세요.");
			
		}
		sc.close();
	}
}
