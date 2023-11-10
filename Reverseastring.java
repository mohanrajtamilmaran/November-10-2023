package test;

public class Reverseastring {

	public static void main(String[] args) {
		String str = "veeramanikandan";

		String reverse = "";

		String reverse2 = "";

		System.out.println("Original String:" + str);

		// Method 1

		char[] ch;

		ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			reverse += ch[i]; // n a d n a k i n a m a r e e v
		}

		System.out.println(reverse);

		// Method 2

		char ch1;

		for (int i = 0; i < str.length(); i++) {

			ch1 = str.charAt(i); // v e e r a m a n i k a n d a n

			reverse2 = ch1 + reverse2;

		}

		System.out.println(reverse2);

	}

}