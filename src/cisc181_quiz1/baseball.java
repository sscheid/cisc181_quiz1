package cisc181_quiz1;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//query the user to enter player name, AB, 
		//H, 2B, 3B, HR, R, BB
		
		System.out.print("Enter player name: ");
		String name = input.nextLine();
		
		System.out.print("Enter AB: ");
		int AB = input.nextInt();
		
		System.out.print("Enter H: ");
		int H = input.nextInt();
		
		System.out.print("Enter 2B: ");
		int B2 = input.nextInt();
		
		System.out.print("Enter 3B: ");
		int B3 = input.nextInt();
		
		System.out.print("Enter HR: ");
		int HR = input.nextInt();
		
		System.out.print("Enter R: ");
		int R = input.nextInt();
		
		System.out.print("Enter BB: ");
		int BB = input.nextInt();
		
		//need HBP to calculate OBP
		System.out.print("Enter HBP: ");
		int HBP = input.nextInt();
		
		//need SF to calculate OBP
		System.out.print("Enter SF: ");
		int SF = input.nextInt();
		
		// display BA, OBP, SLG, OPS, TB
		
		System.out.println("BA = " + BA(AB,H));
		System.out.println("OBP = " + OBP(H,BB,AB,HBP,SF));
		System.out.println("SLG = " + SLG(AB,H,B2,B3,HR));
		System.out.println("OPS = " + OPS(H,BB,AB,B2,B3,HR,HBP,SF));
		System.out.println("TB = " + TB(H,B2,B3,HR));
		
		input.close();
		
	}
	
	private static float BA(int AB, int H) {
		float BA = (float)H / AB;
		return BA;
	}
	
	private static float OBP(int H, int BB, int AB, int HBP, int SF) {
		float OBP = (float)(H + BB + HBP) / (AB + BB + HBP + SF);
		return OBP;
	}
	
	private static int TB(int H, int B2, int B3, int HR) {
		int TB = H + B2 + (2 * B3) + (3 * HR);
		return TB;
	}
	
	private static float SLG(int AB, int H, int B2, int B3, int HR) {
		int TB = TB(H,B2,B3,HR);
		float SLG = (float)TB / AB;
		return SLG;
	}
	
	private static float OPS(int H,int BB,int AB,int B2,int B3,int HR,int HBP,int SF) {
		float OBP = OBP(H,BB,AB,HBP,SF);
		float SLG = SLG(AB,H,B2,B3,HR);
		float OPS = OBP + SLG;
		return OPS;
	}	

}
