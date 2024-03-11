package homework;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose = 0;
		String name = "";
		
		ChooseMenu menu = new ChooseMenu();
		
		System.out.print("어린이의 이름을 입력해주세요 > ");
		name = sc.next();
		
		menu.chooseLunch(choose);
		menu.chooseSnack(choose);
		menu.CalculatePrice(name);
		
		sc.close();
		
	}
}
