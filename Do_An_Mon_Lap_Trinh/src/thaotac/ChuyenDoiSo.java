package thaotac;

public class ChuyenDoiSo {
	public static int soDaoNguoc(int number) {
		int reverse = 0;

		while (number != 0) {
			int d = number % 10;
			reverse = reverse * 10 + d;
			number /= 10;
		}
		return reverse;
	}
}
