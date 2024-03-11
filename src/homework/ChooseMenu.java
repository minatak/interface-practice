package homework;

import java.util.Scanner;

public class ChooseMenu implements Menu {
	Scanner sc = new Scanner(System.in);
	String[] chooseList = new String[6];
	int[] price = new int[6];
	int totalPrice = 2500;
	int cnt = 1;


	@Override
	public void chooseLunch(int choose) {
		System.out.println();
		System.out.println("아래 메뉴 중 추가로 먹을 메뉴를 골라주세요.");
		System.out.println("*불고기와 쌀밥은 필수로 제공됩니다*");
		System.out.println("1.두부조림 2.미역국 0.선택완료/추가선택 안함");
		while(true) {
			System.out.print(" > ");
			choose = sc.nextInt();
			
			if(choose == 0) break;
			if (choose < 1 || choose > 2) System.out.println("1,2중에 입력해주세요.");
			else {
				switch (choose) {
					case 1:
						chooseList[0] = "두부조림";
						price[0] = Menu.DUBU;
						break;
					case 2:
						chooseList[1] = "미역국";
						price[1] = Menu.GUK;
						break;
				}
			}
		}
	}

	@Override
	public void chooseSnack(int choose) {
		System.out.println();
		System.out.println("아래의 간식 메뉴중 먹고싶은 간식을 선택해주세요.");
		System.out.println("1.요플레 2.바나나 3.우유 4.아몬드 0.선택완료/추가선택 안함");
		while(true) {
			System.out.print(" > ");
			choose = sc.nextInt();
			
			if(choose == 0) break;
			if (choose < 0 || choose > 4) System.out.println("1,2,3,4중에 입력해주세요.");
			else {
				switch (choose) {
					case 1:
						chooseList[2] = "요플레";
						price[2] = Menu.YOGURT;
						break;
					case 2:
						chooseList[3] = "바나나";
						price[3] = Menu.BANANA;
						break;
					case 3:
						chooseList[4] = "우유 ";
						price[4] = Menu.MILK;
						break;
					case 4:
						chooseList[5] = "아몬드";
						price[5] = Menu.ALMOND;
						break;
				}
			}
		}
	}
	

	@Override
	public void CalculatePrice(String childName) {
		System.out.println();
		System.out.println("╔═══━━━─── • ───━━━═══╗");
		System.out.println("    " + childName + " 어린이의 식단\t");
		System.out.println("  점심 메뉴: ");
		System.out.println("  1. 불고기\t2000원");
		System.out.println("  2. 쌀밥 \t500원");
		System.out.println();
		System.out.println("  선택 메뉴: ");
		for(int i = 0; i < chooseList.length; i++) {
			if (chooseList[i] != null) {
				System.out.println("  " + cnt + ". " + chooseList[i] + "\t" + price[i] + "원");
				totalPrice += price[i];
				cnt++;
			}
		}
		if(chooseList.length == 0) System.out.println("없음");
		System.out.println();
		System.out.println("\t총 가격: " + totalPrice + "원");
		System.out.println("╚═══━━━─── • ───━━━═══╝");
	}
	
}
	
