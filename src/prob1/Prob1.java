package prob1;
import java.util.Scanner;


public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		
		/*  구현합니다. */
		for(int i=1;i<s.length()+1;i++){
			System.out.println(s.toUpperCase().substring(0, i));
		}
		scanner.close();
	}

}
