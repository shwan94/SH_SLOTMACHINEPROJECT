package five;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMoney {
	
	String stopStr = "";
	int playerMoney = 0;
	
	Scanner scMoney = new Scanner(System.in);
	
	public int playerMoney() {
		
		SlotGameMoney smMoney = new SlotGameMoney();
		
			
		while(true) {
			
			//플레이어의 소지금
			try {
				
				Thread.sleep(1500);
				System.out.println("==================================================================================================================");
				System.out.println("먼저 소지금을 입력해주세요.");
				
				playerMoney = Integer.parseInt(scMoney.nextLine()); // 플레이어의 소지금
				smMoney.playerMoney(playerMoney);
				
				System.out.println("==================================================================================================================");
				return playerMoney;
				
			} catch (InterruptedException e) { // 딜레이 오류
				e.printStackTrace();
				
			} catch (NumberFormatException e) { // 잘 못 입력시 처리
				System.out.println("오류 발생");
				System.out.println("다시 소지금을 제대로 입력해주세요.");
				
			} 
//			catch (InputMismatchException e) { // 잘 못 입력시 처리
//				System.out.println("오류 발생");
//				System.out.println("다시 소지금을 제대로 입력해주세요.");
//				
//			} 
//			return playerMoney;
			
		}//while
			
			
	}
	
}
