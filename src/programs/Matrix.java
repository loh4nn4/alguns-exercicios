package programs;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat[][] = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}	
		}
		int x = sc.nextInt();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {	
				if (mat[i][j] == x) {
					System.out.println("Position "+i+","+j+": ");
					int aux = j - 1;
					if(!(aux < 0)) {
						System.out.println("Left: "+mat[i][aux]);
					}
					aux = j + 1;
					if(!(aux >= mat[i].length)) {
						System.out.println("Right: "+mat[i][aux]);
					}
					aux = i - 1;
					if(!(aux < 0)) {
						System.out.println("Up: "+mat[aux][j]);
					}
					aux = i + 1;
					if(!(aux >= mat.length)) {
						System.out.println("Down: "+mat[aux][j]);
					}
					System.out.println("");
				}
			}
		}
		
		sc.close();
	}

}
