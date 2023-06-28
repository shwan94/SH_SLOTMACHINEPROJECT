package three;

import java.util.Scanner;

public class InGameResult extends SlotMachine {
	
	private String player = "";
	private int countNum = 0;
	private int num = 0;
	private int remainingNum = 10;
	private int slotNum1 = 0;
	private int slotNum2 = 0;
	private int slotNum3 = 0;
	
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void GameResult(String player) {
		
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println("[Slot Machine]에 오신 것을 환영합니다.");
		System.out.println("[Slot Machine]을 하기 위해 이름을 입력해주세요.");
		System.out.println("");
		System.out.println("=========================================================");
		System.out.println("");
		
		
			do {
				System.out.print("플레이어 이름 : ");
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
					
					System.out.println("=========================================================");
					System.out.println("플레이어의 이름 : " + player + "\n나온 번호 :" 
							+ " [" + this.slotNum1 + "] " + "[" + this.slotNum2
							+ "] " + "[" + this.slotNum3 + "] ");
					System.out.println("777 잭팟입니다!");
					System.out.println("축하합니다!");
					System.out.println("총 도전 한 횟수는 " + num + "번입니다.");
//					System.out.println("777잭팟 보상 금액은 " + battingWinMoney + " 입니다. 축하합니다!");
					System.out.println("=========================================================");
					System.out.println("");
					break;
					
				} else if (this.slotNum1 == this.slotNum2 
							&& this.slotNum1 == this.slotNum3 
							&& this.slotNum2 == this.slotNum3) {
					
					System.out.println("=========================================================");
					System.out.println("플레이어의 이름 : " + player + "\n나온 번호 :" 
							+ " [" + slotNum1 + "] " + "[" + slotNum2
							+ "] " + "[" + slotNum3 + "] ");
					System.out.println("축하합니다. 모두 같은 수 입니다.");
					System.out.println("총 도전 한 횟수는 " + num + "번입니다.");
//					System.out.println("보상금은 " + battingWinMoney + " 입니다. 축하합니다");
					System.out.println("=========================================================");
					System.out.println("");
					break;
					
				} else {
					System.out.println("=========================================================");
					System.out.println("플레이어의 이름 : " + player + "\n나온 번호 :" 
							+ " [" + this.slotNum1 + "] " + "[" + this.slotNum2
							+ "] " + "[" + this.slotNum3 + "] ");
					System.out.println("실패! 다음 기회를 노려보세요.");
					System.out.println("=========================================================");
					System.out.println("");
					
			}
			System.out.println("=========================================================");
			System.out.println("현재 도전 한 횟수는 " + num + "번입니다.");
			System.out.println("앞으로 남은 횟수는 " + (remainingNum - num) + "번입니다.");
			System.out.println("=========================================================");	
			} while (num < 10);
			
				if(this.slotNum1 != this.slotNum2 
					|| this.slotNum1 != this.slotNum3 
					|| this.slotNum2 != this.slotNum3) {
				System.out.println("아쉽군요. 다음 기회를 노려보세요.");
			}
		
	}

}//class
