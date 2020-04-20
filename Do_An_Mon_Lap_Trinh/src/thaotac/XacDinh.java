package thaotac;

public class XacDinh {
	public static boolean soNguyenTo(int number) {
		for (int i = 2; i <= number /2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean soNguocXuoi(int number) {
		int reverse = 0;
		int check = number;
		while (number != 0) {
			int d = number % 10;
			reverse = reverse * 10 + d;
			number /= 10;
		}
		if (check == reverse) {
			return true;
		}
		return false;
	}

	public static boolean soEmirp(int number) {
		int reverse = thaotac.ChuyenDoiSo.soDaoNguoc(number);
		for (int i = 2; i < reverse; i++) {
			if (reverse % i == 0) {
				return false;
			}
		}
		return true;
	}
}
