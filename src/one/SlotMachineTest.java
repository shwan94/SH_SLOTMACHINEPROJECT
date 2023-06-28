package one;

import java.util.Scanner;

public class SlotMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SlotMachine sm1 = new SlotMachine();
		SlotMachine sm2 = new SlotMachine();
		SlotMachine sm3 = new SlotMachine();
		SlotMachine rule = new SlotMachine();
		rule.gameRule("룰");
		

		int slotNum1 = 0;
		int slotNum2 = 0;
		int slotNum3 = 0;
		
//		sm1.slotNum1();
//		sm2.slotNum2();
//		sm3.slotNum3();

		Scanner sc = new Scanner(System.in);
		String startStr = "";
		int countNum = 1;
		int num = 0;
		int remainingNum = 10;


		do {
			
			startStr = sc.nextLine();
			countNum += num;
			num++;
			
			for (int i = 0; i < 10; i++) {
				i = (int) (Math.random() * 10);
				slotNum1 = i;
				break;
			}
			for (int i = 0; i < 10; i++) {
				i = (int) (Math.random() * 10);
				slotNum2 = i;
				break;
			}
			for (int i = 0; i < 10; i++) {
				i = (int) (Math.random() * 10);
				slotNum3 = i;
				break;
			}
			if(slotNum1 == 7 && slotNum2 == 7 && slotNum3 == 7) {
				System.out.println("=========================================================");
				System.out.println("플레이어의 이름 : " + startStr + "\n나온 번호 :" 
						+ " [" + slotNum1 + "] " + "[" + slotNum2
						+ "] " + "[" + slotNum3 + "] ");
				System.out.println("777 잭팟입니다!");
				System.out.println("축하합니다.");
				System.out.println("=========================================================");
				break;
				
			} else if (slotNum1 == slotNum2 && slotNum1 == slotNum3 && slotNum2 == slotNum3) {
				System.out.println("=========================================================");
				System.out.println("플레이어의 이름 : " + startStr + "\n나온 번호 :" 
						+ " [" + slotNum1 + "] " + "[" + slotNum2
						+ "] " + "[" + slotNum3 + "] ");
				System.out.println("축하합니다. 모두 같은 수 입니다.");
				System.out.println("=========================================================");
				
				break;
				
			} else {
				System.out.println("=========================================================");
				System.out.println("플레이어의 이름 : " + startStr + "\n나온 번호 :" 
						+ " [" + slotNum1 + "] " + "[" + slotNum2
						+ "] " + "[" + slotNum3 + "] ");
				System.out.println("아쉽군요. 다음 기회를 노려보세요.");
				System.out.println("=========================================================");
				
			}
			
			System.out.println("=========================================================");
			System.out.println("현재 도전 한 횟수는 " + num + "번입니다.");
			System.out.println("앞으로 남은 횟수는 " + (remainingNum - num) + "번입니다.");
			System.out.println("=========================================================");
			

		} while (num < 10);
		System.out.println("도전 한 횟수는 " + num + "번입니다.");

	}// 메인

}