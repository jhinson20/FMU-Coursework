import java.util.Scanner;
//Jordan Hinson CS-190-2 Lab 11
public class JordanHinson_Lab11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] alphabetCode = new char[13][26];
		alphabetCode = spacedArray(alphabetCode);
		alphabetCode = letterMixing(alphabetCode);
		System.out.print("Enter a message: ");
		String message = input.nextLine();
		System.out.print("Enter a keyword: ");
		String keyword = input.nextLine();
		System.out.println(encode(message, keyword, alphabetCode));
	}
	private static void printArray(char[][] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println("");
			for (int j = 0; j < x[0].length; j++) {
				System.out.print(x[i][j] + " ");
			}
		}
	}
	private static char[][] spacedArray(char[][] x) {
		char letterPoint = 'N';
		for (int i = 0; i < x.length; i++) {
			if (i != 0) {
				letterPoint = (char)x[i - 1][0];
				letterPoint++;
			}
		for (int j = 0; j < x[0].length; j++) {
			if (i != 0 && j == (12 - (i - 1)))
				j += (i *2);
			x[i][j] = letterPoint++;
			if (letterPoint > 'Z')
				letterPoint = 'A';
			}
		}
		return x;
	}
	private static char[][] letterMixing(char[][] x) {
		for (int i = 1; i < x.length; i++) {
			int tempN = 1;
			for (int n = 12; n >= (12 - (i - 1)); n--) {
				x[i][n] = x[i - tempN][0];
				tempN++;
			}
		}
		for (int i = 1; i < x.length; i++) {
			int tempP = 1;
				for (int p = 13; p <= (13 + (i - 1)); p++) {
					x[i][p] = x[i - tempP][25];
					tempP++;
				}
		}
		return x;
	}
	private static String encode(String m, String k, char[][] x) {
		m = m.toUpperCase();
		k = k.toUpperCase();
		int j = 0;
		String o = "";
		for (int i = 0; i < m.length(); i++) {
			if (j == k.length())
				j = 0;
			if (m.charAt(i) == ' ')
				o += ' ';
			else {
				o += x[(int)((k.charAt(j) - 65)/2)][((int)m.charAt(i) - 65)];
				j++;
			}
		}
		return o;
	}
}