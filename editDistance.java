
/*Program to find minimum number of steps required to make two strings equal*/
import java.util.Scanner;

public class editDistance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		System.out.println(min_steps(str1, str2));

	}

	private static int min_steps(String str1, String str2) {
		int len1 = str1.length(), len2 = str2.length();
		int[][] arr = new int[len1+1][len2+1];
		for(int i = 0;i<=len1;i++){
			for(int j = 0;j<=len2;j++){
				if(i == 0){
					arr[i][j] = j;
					continue;
				}
				else if(j == 0){
					arr[i][j] = i;
					continue;
				}
				if(str1.charAt(len1-i)==str2.charAt(len2-j)){
					arr[i][j] = arr[i-1][j-1];
				}
				else{
					arr[i][j] = 1+Math.min(Math.min(arr[i-1][j], arr[i][j-1]), arr[i-1][j-1]);
				}
			}

			
		}
		return arr[len1][len2];
	}

}
