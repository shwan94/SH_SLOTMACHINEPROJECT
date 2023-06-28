package three;

public class SlotMachine2 {
	
	int slotNum1 = 0;
	int slotNum2 = 0;
	int slotNum3 = 0;
	int playerMoney = 0;
	int battingMoney = 0;
	int leftMoney = 0;
	int battingWinMoney = 0;
	int totalMoney = 0;
	
	
	public void gameRule() {
		
	}
	
	public void slotNum1(){
		slotNum1 = (int) (Math.random() * 10);
	}
	
	public void slotNum2(){
		slotNum2 = (int) (Math.random() * 10);
	}
	
	public void slotNum3(){
		slotNum3 = (int) (Math.random() * 10);
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
		
		
	}

}
