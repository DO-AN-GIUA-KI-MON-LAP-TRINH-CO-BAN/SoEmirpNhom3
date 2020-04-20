package thaotac;

public class XacDinhSoDau {
	public static boolean soDauChanLe(int number) {
		int firstNumber = 0;
		int check = number;

		do {
			if (check / 10 == 0) {
				firstNumber = number;
				break;
			}
			check /= 10;
		} while (check != 0);

		if (firstNumber % 2 == 0) {
			return false;
		}
		return true;
	}
}
