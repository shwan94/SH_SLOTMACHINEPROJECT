package four;

public class SlotGameMoney extends InGameResult {
	
	public static int playerMoney = 0; //플레이어 소지금
	public static int battingMoney = 0; //플레이어 배팅금
	private int leftMoney = 0; //플레이어의 남은 돈
	private int battingWinMoney = 0; //배팅 성공시 받는 금액
	private int totalMoney = 0; //플레이어의 총합 소지금 
	
	
	

	public int playerMoney(int playerMoney) {
		
		return this.playerMoney = playerMoney;
	}
	
	public int battingMoney(int battingMoney) {
		
		return this.battingMoney = battingMoney;
		
	}
	

	public int leftMoney() {
		
		return this.leftMoney = playerMoney - battingMoney;
	}
	
	public int battingWinMoney() {
		
		return this.battingMoney = battingWinMoney;
	} 
	
	public int totalMoney() {
		
		return totalMoney = leftMoney - battingWinMoney;
	}
}
