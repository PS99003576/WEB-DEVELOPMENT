import java.util.*;
public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the match format");
		System.out.println("1. Test ");
		System.out.println("2. ODI");
		System.out.println("3. T20");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			TestMatch t = new TestMatch();
			
			System.out.println("Enter the current score:");
			int testscore = sc.nextInt();
			t.setCurrentscore(testscore);
			
			System.out.println("Enter the current over:");
			int currentover = sc.nextInt();
			t.setCurrentover(currentover);
			System.out.println("Enter the Target Score:");
			int targetscore = sc.nextInt();
			
			System.out.println("Requirements:");
			
			//t.display(rr, balls);
			
			
			
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
		
		

	}

}
