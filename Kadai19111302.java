import java.util.Scanner;
public class Kadai19111302 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("入力");
		String s = scan.nextLine();
		System.out.println("変換後");
		
		for(int i=0;i<s.length();i++) {
			char[]c = new char[s.length()];
			c[i] = s.charAt(i);
			if(Character.isUpperCase(c[i])) {
				c[i] += 32;
			}else {
				c[i] -= 32;
			}
			System.out.print(c[i]);
		}

	}

}
