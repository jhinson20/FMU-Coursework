import java.util.Random;
//Jordan Hinson CS-190-2 Lab 3

public class JordanHinson_Lab3{
	public static void main(String[] args) {
		
		Random rnd = new Random(); 
		char a = (char)('A' + rnd.nextInt(26));
		char b = (char)('A' + rnd.nextInt(26));
		char c = (char)('A' + rnd.nextInt(26));
		char d = (char)('A' + rnd.nextInt(26));
		char e = (char)('A' + rnd.nextInt(26));
			String group1 = ("" + a + b + c + d + e);
		char f = (char)('A' + rnd.nextInt(26));
		char g = (char)('A' + rnd.nextInt(26));
		char h = (char)('A' + rnd.nextInt(26));
		char i = (char)('A' + rnd.nextInt(26));
		char j = (char)('A' + rnd.nextInt(26));
			String group2 = ("" + f + g + h + i + j);
		char k = (char)('A' + rnd.nextInt(26));
		char l = (char)('A' + rnd.nextInt(26));
		char m = (char)('A' + rnd.nextInt(26));
		char n = (char)('A' + rnd.nextInt(26));
		char o = (char)('A' + rnd.nextInt(26));
			String group3 = ("" + k + l + m + n + o);
		char p = (char)('A' + rnd.nextInt(26));
		char q = (char)('A' + rnd.nextInt(26));
		char r = (char)('A' + rnd.nextInt(26));
		char s = (char)('A' + rnd.nextInt(26));
		char t = (char)('A' + rnd.nextInt(26));
			String group4 = ("" + p + q + r + s + t);
		char u = (char)('A' + rnd.nextInt(26));
		char v = (char)('A' + rnd.nextInt(26));
		char w = (char)('A' + rnd.nextInt(26));
		char x = (char)('A' + rnd.nextInt(26));
		char y = (char)('A' + rnd.nextInt(26));
			String group5 = ("" + u + v + w + x + y);

		
		System.out.println("Random Access Code:" );
		System.out.println(group1 + "-" + group2 + "-" + group3 + "-" + group4 + "-" + group5);
	}
}