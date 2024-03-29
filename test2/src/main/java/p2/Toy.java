package p2;

import java.util.Scanner;

public class Toy {
	
	private Battery battery;
	private String text;
	private Scanner sc;
	
	// 배터리가 없으면 객체 toy가 실행이 안됨
	// 따라서 객체간에 의존관계가 발생하는데 
	// 토이 객체는 배터리 객체에 의존성을 가진다고 표현함
	public Toy(Battery battery) {
		this.battery = battery;
		text = "삐약삐약 병아리 음매음매 송아지\n" +
				"따당따당 사냥꾼 뒤뚱뒤뚱 물오리\n" +
				"푸푸 개구리 집게집게집게 가재\n" +
				"푸르르르르르 물풀\n" +
				"따단따단딴 소라!\n";
		sc = new Scanner(text);
	}
	
	public void run() {
		if(sc.hasNextLine() == false) {
			sc = new Scanner(text);
			System.out.println();
		}
		if(sc.hasNextLine() && battery.getEnergy() >= 10) {
			String line = sc.nextLine();
			System.out.println(line);
			battery.useEnergy();
		} 
		else {
			System.err.println("에너지가 없습니다.");
		}
	}
	
}
