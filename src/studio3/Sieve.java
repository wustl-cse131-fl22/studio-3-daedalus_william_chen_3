package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Print primes up to what number? ");
		int n = in.nextInt()+1;
		boolean[] arr = new boolean[n];
		for(int i = 2; i < n; i ++) {
			if(!arr[i]) {
				System.out.println(i);
				for(int j = i*2; j < n; j+=i) {
					arr[j]=true;
				}
			}	
		}
		
		
	}

}
