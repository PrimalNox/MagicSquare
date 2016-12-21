import java.io.*;
import java.lang.Math;
import java.util.*;

public class MagicDude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a1, a2, a3, a4;
		int b1, b2, b3, b4;
		int c1, c2, c3, c4;
		int d1, d2, d3, d4;

		System.out.println("Enter number A1");
		a1 = sc.nextInt();

		System.out.println("Enter number A2");
		a2 = sc.nextInt();

		System.out.println("Enter number A3");
		a3 = sc.nextInt();

		System.out.println("Enter number A4");
		a4 = sc.nextInt();

		System.out.println("Enter number B1");
		b1 = sc.nextInt();

		System.out.println("Enter number B2");
		b2 = sc.nextInt();

		System.out.println("Enter number B3");
		b3 = sc.nextInt();

		System.out.println("Enter number B4");
		b4 = sc.nextInt();

		System.out.println("Enter number C1");
		c1 = sc.nextInt();

		System.out.println("Enter number C2");
		c2 = sc.nextInt();

		System.out.println("Enter number C3");
		c3 = sc.nextInt();

		System.out.println("Enter number C4");
		c4 = sc.nextInt();

		System.out.println("Enter number D1");
		d1 = sc.nextInt();

		System.out.println("Enter number D2");
		d2 = sc.nextInt();

		System.out.println("Enter number D3");
		d3 = sc.nextInt();

		System.out.println("Enter number D4");
		d4 = sc.nextInt();

		int ms[][] = { { a1, a2, a3, a4 }, { b1, b2, b3, b4 }, { c1, c2, c3, c4 }, { d1, d2, d3, d4 } };

		int goalvalue = (ms[0][0] + ms[0][1] + ms[0][2] + ms[0][3]);

		int sumRow1 = (ms[0][0] + ms[0][1] + ms[0][2] + ms[0][3]);
		int sumRow2 = (ms[1][0] + ms[1][1] + ms[1][2] + ms[1][3]);
		int sumRow3 = (ms[2][0] + ms[2][1] + ms[2][2] + ms[2][3]);
		int sumRow4 = (ms[3][0] + ms[3][1] + ms[3][2] + ms[3][3]);
		int sumColumn1 = (ms[0][0] + ms[1][0] + ms[2][0] + ms[3][0]);
		int sumColumn2 = (ms[0][1] + ms[1][1] + ms[2][1] + ms[3][1]);
		int sumColumn3 = (ms[0][2] + ms[1][2] + ms[2][2] + ms[3][2]);
		int sumColumn4 = (ms[0][3] + ms[1][3] + ms[2][3] + ms[3][3]);
		int sumDiagonalRight = (ms[0][0] + ms[1][1] + ms[2][2] + ms[3][3]);
		int sumDiagonalLeft = (ms[0][3] + ms[1][2] + ms[2][1] + ms[3][0]);

		int final1[] = { sumRow1, sumRow2, sumRow3, sumRow4, sumColumn1, sumColumn2, sumColumn3, sumColumn4,
				sumDiagonalRight, sumDiagonalLeft };

		boolean magicSquare = true;

		for (int i = final1.length - 1; 0 < i; i--) {
			magicSquare = (final1[i] == final1[i - 1]);
		}

		if (magicSquare == true) {
			System.out.println("It is a magic square dude!");
		} else {
			System.out.println("It is not a magic square dude. Try again");
		}

	}

}
