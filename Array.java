package pgdp.array;

import java.util.Arrays;

public class Array {
	public static int[][] minsAndMaxs(int[][] a) {
		// TODO
		if(a.length == 0 || a[0].length == 0){
			return a;
		}

		int [][]result = new int[a.length][2];
		for(int i = 0; i < a.length; i++){
			int minimum = a[i][0];
			int maximum = a[i][0];
			for(int j = 0; j < a[i].length; j++){
				if(a[i][j]<= minimum){
					minimum = a[i][j];
				}
				if(a[i][j] >= maximum){
					maximum = a[i][j];
				}
			}
			result[i][0] = minimum;
			result[i][1] = maximum;
		}
		return result;
	}

	public static int[][] transpose(int[][] a) {
		// TODO
		if(a.length == 0 || a[0].length == 0){
			return a;
		}
		int length = 0;
		for(int i = 0; i < a.length; i++){
			 length = a[i].length;
		}
		int[][]result = new int[length][a.length];

		for(int j = 0; j < length; j++){
			for(int k = 0; k < a.length; k++){
				result[j][k] = a[k][j];
			}
		}

		return result;
	}

	public static int[] linearize(int[][] a) {
		// TODO
		if(a.length == 0 || a[0].length == 0){
			int[] exception = new int[0];
			return exception;
		}
		int length = 0;
		for(int i = 0; i < a.length; i++){
			length += a[i].length;
		}

		int[]result = new int[length];
		int p = 0;
		for(int k = 0; k < a.length;k++){
		for(int j = 0; j < a[k].length; j++) {

			result[p] = a[k][j];
			p++;
		}
		}return result;
	}

	public static boolean crossword(char[][] letterGrid, char[] word) {
		// TODO
		return false;
	}

	public static void main(String[] args) {
		//System.out.println(Arrays.deepToString(minsAndMaxs(new int[][]{{-7,2,55},{-1,2,3},{-700,10,66}})));
		//System.out.println(Arrays.deepToString(transpose(new int[][]{{1,2,3},{4,5,6}})));
		System.out.println(Arrays.toString(linearize(new int[][]{})));
	}
}
