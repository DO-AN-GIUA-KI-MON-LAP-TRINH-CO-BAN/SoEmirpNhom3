package doan.main;

public class SoEmirp {

	public static void main(String[] args) {
		System.out.println(">> CHUONG TRINH XAC DINH SO EMIRP <<");
		System.out.println();

		int number = thaotac.NhapXuat.nhapSo();
		thaotac.NhapXuat.xuatSo(number);

		boolean ketQua = true;
		if (thaotac.XacDinhSoDau.soDauChanLe(number) == false) {
			ketQua = false;
		} else if (number < 13) {
			ketQua = false;
		} else if (thaotac.XacDinh.soNguyenTo(number) == false) {
			ketQua = false;
		} else if (thaotac.XacDinh.soNguocXuoi(number) == true) {
			ketQua = false;
		} else if (thaotac.XacDinh.soEmirp(number) == true) {
			ketQua = true;
		} else {
			ketQua = false;
		}

		thaotac.NhapXuat.soEmirp(ketQua, number);
	}
}
