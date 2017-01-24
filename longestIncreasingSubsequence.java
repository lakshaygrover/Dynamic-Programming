
/*program to length of the longest subsequence of a 
given sequence such that all elements of the subsequence
are sorted in increasing order.*/


import java.util.Scanner;

public class longestIncreasingSubsequence {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int[] arr = new int[len];
		for(int i = 0;i<len;i++){
			arr[i] = s.nextInt();
		}
		int sol = solve(arr);
		System.out.println(sol);

	}

	private static int solve(int[] arr) {
		int[] lis = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			lis[i] = 1;
		}
		int max = Integer.MIN_VALUE;
		
		//storing maximum length till each element
		for(int i = 1;i<lis.length;i++){
			for(int j = 0;j<i;j++){
				if(arr[i]>arr[j]&&lis[i]<lis[j]+1){
					lis[i] = lis[j]+1;
				}
			}
		}
		//finding maximum length
		for(int i = 0;i<lis.length;i++){
			if(lis[i]>max){
				max = lis[i];
			}
		}
		return max;
	}

}
