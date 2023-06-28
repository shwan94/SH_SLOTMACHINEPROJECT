package five;
import java.util.InputMismatchException;
import java.util.Scanner;

import four.SlotGameMoney;

public class InputBatting {
	
	String stopStr = "";
	int playerBatting = 0;
	
	Scanner scBatting = new Scanner(System.in);
	
	public int playerBattingMoney() {
		
		SlotGameMoney smMoney = new SlotGameMoney();
		
		while(true) {
			//플레이어의 배팅금
			try {
				
				Thread.sleep(1500);
				System.out.println("==================================================================================================================");
				System.out.println("배팅금을 입력해주세요.");
				
				playerBatting = Integer.parseInt(scBatting.nextLine()); // 플레이어의 배팅금
				smMoney.battingMoney(playerBatting);
				
				System.out.println("==================================================================================================================");
				return playerBatting;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			} catch (NumberFormatException e) { // 잘 못 입력시 처리
				System.out.println("오류 발생");
				System.out.println("다시 배팅금을 제대로 입력해주세요.");
				
			} 
//			catch (InputMismatchException e) {
//				System.out.println("오류 발생");
//				System.out.println("다시 배팅금을 제대로 입력해주세요.");
//				
//			} 
//			return playerBatting;
			
		}//while
			
	}

}
