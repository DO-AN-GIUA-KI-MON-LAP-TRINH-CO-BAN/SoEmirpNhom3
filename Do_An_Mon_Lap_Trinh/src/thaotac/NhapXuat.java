package thaotac;

import java.util.Scanner;

public class NhapXuat {
	static Scanner scan = new Scanner(System.in);

	public static int nhapSo() {
		int number = 0;
		do {
			System.out.print(">> Vui long nhap so: ");
			number = scan.nextInt();
		} while (number < 0);
		return number;
	}

	public static void xuatSo(int number) {
		System.out.println(">> So vua nhap la: " + number);
	}

	public static void soEmirp(boolean ketQua, int number) {
		if (ketQua) {
			System.out.println(number + " La so Emirp.");
			System.out.println();
		} else {
			System.out.println(number + " Khong phai la so Emirp.");
			System.out.println();
		}
	}
	
	public static void chiSoEmirp (boolean ketQua, int i) {
		if (ketQua == true) {
			System.out.print(i + "; ");
		}
	}
}
