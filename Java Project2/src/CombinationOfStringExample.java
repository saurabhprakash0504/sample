
public class CombinationOfStringExample {

	public static void main(String[] args) {
		String a = "abc";
		int len = a.length();
		Double pw = Math.pow(2, len);
		for (int i = 1; i < 8; i++) {
			int j = 1;
			int index = 0;
			while (j < pw) {
				if ((j & i) == j) {
					System.out.print(a.charAt(index));
				}
				j = j << 1;
				index = index + 1;

			}
			System.out.println();
		}

	}
}
