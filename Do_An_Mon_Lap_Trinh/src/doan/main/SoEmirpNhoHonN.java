package doan.main;

public class SoEmirpNhoHonN {

	public static void main(String[] args) {
		System.out.println(">> CHUONG TRINH XAC DINH SO EMIRP NHO HON <<");
		System.out.println();

		int number = thaotac.NhapXuat.nhapSo();
		thaotac.NhapXuat.xuatSo(number);

		boolean ketQua = true;

		System.out.println("Cac so Emirp be hon " + number + " la: ");
		for (int i = 1; i <= number; i++) {
			if (thaotac.XacDinhSoDau.soDauChanLe(i) == false) {
				ketQua = false;
			} else if (number < 13) {
				ketQua = false;
			} else if (thaotac.XacDinh.soNguyenTo(i) == false) {
				ketQua = false;
			} else if (thaotac.XacDinh.soNguocXuoi(i) == true) {
				ketQua = false;
			} else if (thaotac.XacDinh.soEmirp(i) == true) {
				ketQua = true;
			} else {
				ketQua = false;
			}
			if (number > 13) {
			thaotac.NhapXuat.chiSoEmirp(ketQua, i);
			}
		}
		
		if (number <= 13) {
			system.out.println("Khong co so Emirp be hon " + number);
		}
	}

}
