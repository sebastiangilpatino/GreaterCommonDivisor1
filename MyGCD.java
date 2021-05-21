
public class MyGCD {

	public static void main(String[] args) {
		System.out.println(gcd(24, 20));
	}

	public static int gcd(int m, int n) {
		int greaterCd = 1;

		for (int i = 2; i < 10; i++) {
			if (m % i == 0 && n % i == 0) {
				greaterCd = i;
			}
		}

		return greaterCd;

	}

}
