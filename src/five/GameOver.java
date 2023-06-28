package five;

public class GameOver {
	
	public void textGameOver() {
		System.out.println("");
		
		try {
			
			Thread.sleep(1500);
			System.out.println("==================================================================================================================");
			System.out.println("  ####     ###    ##   ##   ######            #####   ##   ##   ######  ######   ");
			System.out.println(" ##  ##   ## ##   ### ###   ##               ##   ##  ##   ##   ##      ##   ##  ");
			System.out.println("##       ##   ##  #######   ##               ##   ##  ##   ##   ##      ##   ##  ");
			System.out.println("##  ###  ##   ##  #######   #####            ##   ##  ### ###   #####   ##  ###  ");
			System.out.println("##   ##  #######  ## # ##   ##               ##   ##   #####    ##      #####    ");
			System.out.println("##   ##  ##   ##  ##   ##   ##               ##   ##    ###     ##      ## ####  ");
			System.out.println("###  ##  ##   ##  ##   ##   ##               ##   ##    ###     ##      ##   ##   ");
			System.out.println(" ######  ##   ##  ##   ##   ######             ###      ###     ######  ##   ##   ");
			System.out.println("==================================================================================================================");
			
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
	}

}
