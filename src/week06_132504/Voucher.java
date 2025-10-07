package week06_132504;

public class Voucher extends Barang {
	private double pajak;
	public static int total;
	
	public Voucher(int id, String nama, double harga, int stok, double pajak) {
		super (id, nama, stok);
	}
	public double getPajak() {
		return pajak;
	}
	public double gethargaJual() {
		return getHarga () + pajak;
	}
}
