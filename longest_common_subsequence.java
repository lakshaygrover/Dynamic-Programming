/*The following program gives the length of 
 * longest common subsequence in two strings
 * entered by user*/
import java.util.Scanner;
public class longest_common_subsequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String first = s.next();
		String second = s.next();
		int ans = solution(first, second);
		System.out.println(ans);
	}

	private static int solution(String first, String second) {
		int length = first.length(), length2 = second.length();
		int[][] dp_array = new int[length+1][length2+1];
		for(int i = 0;i<=length;i++){
			for(int j = 0;j<=length2;j++){
				if(i==0||j==0){
					dp_array[i][j] = 0;
				}
				else if(first.charAt(i-1)==second.charAt(j-1)){
					dp_array[i][j] = dp_array[i-1][j-1]+1;
				}
				else{
					dp_array[i][j] = Math.max(dp_array[i-1][j], dp_array[i][j-1]);
				}
			}
		}
		return dp_array[length][length2];
	}

}