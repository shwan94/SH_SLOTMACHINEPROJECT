package four;

public class GameRule extends SlotMachine {

	@Override
	public void rule() {
		try {

			Thread.sleep(1000);
			System.out.println(
					"==================================================================================================================");
			System.out.println("");
			System.out.println("[Slot Machine]에 오신 것을 환영합니다.");
			System.out.println("지금부터 [Slot Machine] 사용법에 대해 알려드리겠습니다.");
			System.out.println("[Slot Machine]을 시작 전 소지금과 배당금을 먼저 정해주세요.");
			System.out.println("[Slot Machine]을 하기 위해 이름을 입력하시면 됩니다.");
			System.out.println("[Slot Machine]은 0~9까지 숫자가 랜덤으로 나옵니다.");
			System.out.println("[Slot Machine]의 숫자가 전부 7, 7, 7이 되면 잭팟되어 배팅금의 20배를 받을 수 있습니다.");
			System.out.println("[Slot Machine]의 3개의 숫자가 전부 동일하면  배팅금의 7배를 받을 수 있습니다.");
			System.out.println("그 이외의 숫자들이 나오면 배팅금을 잃게됩니다.");
			System.out.println("10번의 기회로 동일한 숫자를 뽑아 당첨 배팅금을 챙기세요!");
			System.out.println("그럼 행운을 빕니다.");
			System.out.println("");
			System.out.println(
					"==================================================================================================================");
			System.out.println("");
		} catch (InterruptedException e) {
			System.out.println("오류 발생");
		}

	}

}
