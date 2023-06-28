package four;

import java.util.Scanner;

public class SlotMachineTest2 {

	public static void main(String[] args) {
		
		String player = "";
		int playerMoney = 0;
		int playerBatting = 0;
		
		GameRule gameRule = new GameRule(); // 게임 룰 설명 객체
		InGameResult smStart = new InGameResult(); // 슬롯머신 객체
		SlotGameMoney smMoney = new SlotGameMoney(); // 슬롯머신에 사용할 돈
		PressEnter pressStart = new PressEnter(); // 게임 스타트 문구
		GameOver gameOver = new GameOver(); //게임 종료 문구
		
		Scanner scMoney = new Scanner(System.in);
		Scanner scBatting = new Scanner(System.in);
		Scanner scPlayName = new Scanner(System.in);

		
		//게임 룰 설명
		gameRule.rule();
		
		//플레이어의 소지금 입력
		try {
			Thread.sleep(1500);
			System.out.println("==================================================================================================================");
			System.out.println("먼저 소지금을 입력해주세요.");
			playerMoney = scMoney.nextInt(); // 플레이어의 소지금
			smMoney.playerMoney(playerMoney);
			System.out.println("==================================================================================================================");
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			System.out.println("다시 소지금을 제대로 입력해주세요.");
			return;
		}
		
				
		//플레이어의 배팅금 입력
		try {
			Thread.sleep(1500);
			System.out.println("==================================================================================================================");
			System.out.println("배팅금을 입력해주세요.");
			playerBatting = scBatting.nextInt(); // 플레이어의 배팅금
			smMoney.battingMoney(playerBatting);
			System.out.println("==================================================================================================================");
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			System.out.println("다시 배팅금을 제대로 입력해주세요.");
			return;
		}
		
				
		//시작 버튼
		pressStart.textPressStart();
		
		//플레이어의 이름
		player = scPlayName.nextLine(); // 플레이어의 이름
		smStart.gameResult(player); 
		
		//시작 종료 문구
		gameOver.textGameOver();

	}// 메인

}