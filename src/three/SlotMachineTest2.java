package three;

//import java.util.Scanner;


public class SlotMachineTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String player = "";
		
		InGameResult smResult = new InGameResult();
		GameRule rule = new GameRule();
		
		try {
			Thread.sleep(1000);
			rule.Rule();
		} catch (InterruptedException e) {
			System.out.println("오류 발생");
		}
		
		try {
			Thread.sleep(2500);
			smResult.GameResult(player);
		} catch (InterruptedException e) {
			System.out.println("오류 발생");
		}
		

	}// 메인

}