import java.util.Scanner;

public class InputView {
	
	Scanner sc = new Scanner(System.in);
	
	public void startMessage() {
		System.out.println("체스 게임을 시작합니다.");
		System.out.println("게임 시작은 start, 종료는 end 명령을 입력하세요.");			
	}
	
	public boolean start() {
		String start = sc.next();
		
		if(start.equals("start"))
			return true;
		if(start.equals("end"));
			return false;	
	}

}
