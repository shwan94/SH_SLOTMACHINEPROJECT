package two;
import java.util.Scanner; 

public class SlotMachine2 {
	
	String player = "";
	String gameRule = "";
	int playerMoney = 0;
	int battingMoney = 0;
	int leftMoney = 0;
	int battingWinMoney = 0;
	int totalMoney = 0;
	int countNum = 0;
	int num = 0;
	int remainingNum = 10;
	int slotNum1 = 0;
	int slotNum2 = 0;
	int slotNum3 = 0;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void gameRule() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println("[Slot Machine]에 오신 것을 환영합니다.");
		System.out.println("지금부터 [Slot Machine] 사용법에 대해 알려드리겠습니다.");
		System.out.println("[Slot Machine]을 하기 위해 이름을 입력하시면 됩니다.");
		System.out.println("[Slot Machine]은 0~9까지 숫자가 랜덤으로 나옵니다.");
		System.out.println("[Slot Machine]의 3개의 숫자가 전부 동일하면 성공입니다.");
		System.out.println("그 이외의 숫자들이 나오면 실패입니다.");
		System.out.println("10번 이내로 동일한 숫자를 나오게 하십시오.");
		System.out.println("그럼 행운을 빕니다.");
		System.out.println("");
		System.out.println("=========================================================");
		System.out.println("");
	}
	
	public void slotNum1(){
		slotNum1 = (int) (Math.random() * 10);
//		System.out.println(slotNum1);
	}
	
	public void slotNum2(){
		slotNum2 = (int) (Math.random() * 10);
//		System.out.println(slotNum2);
	}
	
	public void slotNum3(){
		slotNum3 = (int) (Math.random() * 10);
//		System.out.println(slotNum3);
	}
	
//	public void playerMoney(int playerMoney) {
//		this.playerMoney = playerMoney;
//		System.out.println("현재 플레이어의 소지금은 " + playerMoney + " 입니다.");
//	}
//	
//	public void battingMoney(int battingMoney) {
//		this.battingMoney = battingMoney;
//		System.out.println("배팅금액은 " + battingMoney + " 입니다.");
//	}
	
	
	public void slotResult(String player) {
		
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
			
			for (int i = 0; i < 10; ) {
				i = (int) (Math.random() * 10);
				this.slotNum1 = i;
				break;
			}
			for (int i = 0; i < 10; ) {
				i = (int) (Math.random() * 10);
				this.slotNum2 = i;
				break;
			}
			for (int i = 0; i < 10; ) {
				i = (int) (Math.random() * 10);
				this.slotNum3 = i;
				break;
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
//				System.out.println("777잭팟 보상 금액은 " + battingWinMoney + " 입니다. 축하합니다!");
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
//				System.out.println("보상금은 " + battingWinMoney + " 입니다. 축하합니다");
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

}
