package five;

import java.util.Scanner;

public class SlotMachineTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		String player = "";
		int playerMoney = 0;
		int playerBatting = 0;
		
		GameRule gameRule = new GameRule(); // 게임 룰 설명 객체
		InGameResult smStart = new InGameResult(); // 슬롯머신 객체
		InputMoney inputPlayerMoney = new InputMoney(); // 플레이어의 소지금 입력
		InputBatting inputBattingMoney = new InputBatting(); // 플레이어의 배팅금 입력
		
		SlotGameMoney smMoney = new SlotGameMoney(); // 슬롯머신에 사용할 돈
		PressEnter pressStart = new PressEnter(); // 게임 스타트 문구
		GameOver gameOver = new GameOver(); //게임 종료 문구
		
		Scanner scMoney = new Scanner(System.in);
		Scanner scBatting = new Scanner(System.in);
		Scanner scPlayName = new Scanner(System.in);

		
		//게임 룰 설명
		gameRule.rule();
		
		playerMoney = inputPlayerMoney.playerMoney(); // 플레이어의 소지금 입력
		playerBatting = inputBattingMoney.playerBattingMoney(); // 플레이어의 배팅금 입력
		
		
		// 플레이어의 소지금
		smMoney.playerMoney(playerMoney);
		
		// 플레이어의 배팅금
		smMoney.battingMoney(playerBatting);
		
				
		//시작 버튼
		pressStart.textPressStart();
		
		//플레이어의 이름
		player = scPlayName.nextLine(); // 플레이어의 이름
		smStart.gameResult(player); 
		
		//시작 종료 문구
		gameOver.textGameOver();

	}// 메인

}