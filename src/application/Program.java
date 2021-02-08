package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the number of rows: ");
			int rows = sc.nextInt();
			System.out.print("Enter the number of columns: ");
			int columns = sc.nextInt();
			int matrix[][] = new int[rows][columns];
			
			System.out.println();
			System.out.println("Enter " + columns + " numbers for each of the " + rows + " matrix rows: ");
			for (int i=0; i<matrix.length; i++) {
				for (int j = 0; j<matrix[i].length; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			
			System.out.println();
			System.out.print("Enter a matrix number to get information about it: ");
			int N = sc.nextInt();
			
			System.out.println();
			for (int i=0; i<matrix.length; i++) {
				for (int j=0; j<matrix[i].length; j++) {
					if (matrix[i][j] == N) {
						System.out.println(N + " in position (" + i + "," + j + "): ");
						if (j > 0) {
							System.out.println("Left: " + matrix[i][j-1]);
						}
						if (i > 0) {
							System.out.println("Above: " + matrix[i-1][j]);
						}
						if (j < matrix[i].length-1) {
							System.out.println("Right: " + matrix[i][j+1]);
						}
						if (i < matrix.length-1) {
							System.out.println("Below: " + matrix[i+1][j]);
						}
						System.out.println();
					}
				}
			}
		}
		catch (InputMismatchException error) {
			System.out.println("Error! Enter a number or a integer number.");
		}
		catch (NegativeArraySizeException error) {
			System.out.println("Error! Enter a positive number.");
		}
		
		sc.close();
	}
}
