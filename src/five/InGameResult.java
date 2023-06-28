package five;

import java.util.Scanner;

public class InGameResult extends SlotMachine {
	
	private String player = "";// 플레이어
	private int countNum = 0; // 플레이어의 도전 카운트
	private int num = 0; // 플레이어의 도전 횟수
	private int remainingNum = 10; // 플레이어의 남은 도전 횟수
	private int slotNum1 = 0; // 1번 슬롯머신 숫자
	private int slotNum2 = 0; // 2번 슬롯머신 숫자
	private int slotNum3 = 0; // 3번 슬롯머신 숫자
	
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void gameResult(String player) {
		
		SlotGameMoney slotMoney = new SlotGameMoney();
		
		int playerMoney = slotMoney.playerMoney;
		int battingMoney = slotMoney.battingMoney;
		int leftMoney = slotMoney.leftMoney();
		int battingWinMoney = slotMoney.battingWinMoney();
		int totalMoney = slotMoney.totalMoney();
		
		
		try {
			
			Thread.sleep(1500);
			System.out.println("==================================================================================================================");
			System.out.println("");
			System.out.println("[Slot Machine]에 오신 것을 환영합니다.");
			System.out.println("[Slot Machine]을 하기 위해 이름을 입력해주세요.");
			System.out.println("");
			System.out.println("==================================================================================================================");
			System.out.println("");
			
			System.out.print("플레이어 이름 : ");
			player = sc.nextLine();
			
			System.out.println("");
			
			Thread.sleep(1500);
			System.out.println("==================================================================================================================");
			System.out.println("");
			System.out.println("플레이어의 소지금 : " + playerMoney);
			System.out.println("배팅금 : " + battingMoney);
			System.out.println("");
			System.out.println("==================================================================================================================");
			System.out.println("");
			
			
			if (playerMoney < battingMoney) {
				System.out.println("배팅금이 소지금보다 높습니다.");
				System.out.println("다시 조정해주세요.");
				return;

			} else if(playerMoney <= 0) {
				System.out.println("소지금이 부족합니다.");
				System.out.println("다음에 다시 찾아와 주세요.");
				return;
			} 
			
			
				do {
					System.out.println("ENTER키를 누르면 슬롯머신이 작동됩니다.");
					System.out.println("슬롯머신을 실행하시겠습니까?");
					player = sc.nextLine();
					countNum += num;
					num++;
					
					try {
						Thread.sleep(1000);
						for (int i = 0; i < 10; ) {
							i = (int) (Math.random() * 10);
							this.slotNum1 = i;
							System.out.print(" [" + slotNum1 + "] " );
							break;
						}
						
					} catch (Exception e) {
						System.out.println("오류 발생");
					}
					try {
						Thread.sleep(1000);
						for (int i = 0; i < 10; ) {
						i = (int) (Math.random() * 10);
						this.slotNum2 = i;
						System.out.print(" [" + slotNum2 + "] " );
						break;
					}
						
					} catch (Exception e) {
						System.out.println("오류 발생");
					}
					try {
						Thread.sleep(1000);
						for (int i = 0; i < 10; ) {
							i = (int) (Math.random() * 10);
							this.slotNum3 = i;
							System.out.print(" [" + slotNum3 + "] " + "\n");
							break;
						}
					} catch (Exception e) {
						System.out.println("오류 발생");
					}
					
					if(this.slotNum1 == 7 
						&& this.slotNum2 == 7 
						&& this.slotNum3 == 7) {
						
						System.out.println("==================================================================================================================");
						System.out.println("플레이어의 이름 : " + player + "\n나온 번호 :" 
								+ " [" + this.slotNum1 + "] " + "[" + this.slotNum2
								+ "] " + "[" + this.slotNum3 + "] ");
						System.out.println("777 잭팟입니다!");
						System.out.println("축하합니다!");
						System.out.println("총 도전 한 횟수는 " + num + "번입니다.");
						System.out.println("777잭팟 보상 금액은 " + battingWinMoney * 20 + " 입니다. 축하합니다!");
						System.out.println("==================================================================================================================");
						System.out.println("");
						break;
						
					} else if (this.slotNum1 == this.slotNum2 
								&& this.slotNum1 == this.slotNum3 
								&& this.slotNum2 == this.slotNum3) {
						
						System.out.println("==================================================================================================================");
						System.out.println("플레이어의 이름 : " + player + "\n나온 번호 :" 
								+ " [" + slotNum1 + "] " + "[" + slotNum2
								+ "] " + "[" + slotNum3 + "] ");
						System.out.println("축하합니다. 모두 같은 수 입니다.");
						System.out.println("총 도전 한 횟수는 " + num + "번입니다.");
						System.out.println("보상금은 " + battingWinMoney * 7 + " 입니다. 축하합니다");
						System.out.println("==================================================================================================================");
						System.out.println("");
						break;
						
					} else {
						System.out.println("==================================================================================================================");
						System.out.println("플레이어의 이름 : " + player + "\n나온 번호 :" 
								+ " [" + this.slotNum1 + "] " + "[" + this.slotNum2
								+ "] " + "[" + this.slotNum3 + "] ");
						System.out.println("실패! 다음 기회를 노려보세요.");
						System.out.println("==================================================================================================================");
						System.out.println("");
						
				}
				System.out.println("==================================================================================================================");
				System.out.println("현재 도전 한 횟수는 " + num + "번입니다.");
				System.out.println("앞으로 남은 횟수는 " + (remainingNum - num) + "번입니다.");
				System.out.println("==================================================================================================================");	
				} while (num < 10);
				
					if(this.slotNum1 != this.slotNum2 
						|| this.slotNum1 != this.slotNum3 
						|| this.slotNum2 != this.slotNum3) {
						totalMoney = leftMoney + battingWinMoney;
					System.out.println("아쉽군요. 다음 기회를 노려보세요.");
					System.out.println("남은 금액 : " + totalMoney);
					
					if(totalMoney <= 0) {
						System.out.println("남아 있는 금액이 부족합니다.");
						System.out.println("다음에 다시 찾아와주세요.");
					}else if(totalMoney < battingMoney) {
						System.out.println("남아 있는 돈이 배팅금액보다 높습니다.");
						System.out.println("배팅금액을 다시 조정해주세요.");
					}
						
				}
			
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		
		
		
	}

}//class
