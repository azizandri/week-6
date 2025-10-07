package week06_132504;

public class Barang {
	private int Id;
	private double harga;
	private String nama;
	private int stok;
	
	public Barang(int Id, String nama, double harga) {
		this.Id = Id;
		this.nama = nama;
		this.harga = harga;
	}
	
	public int getid() {
		return Id;
	}
	public String getNama() {
		return nama;
	}
	public double getHarga() {
		return harga;
	}
	public int getStok() {
		return stok;
	}
	public void minusStok(int jumlah) {
		if (stok >= jumlah) {
			stok -= jumlah;
		}else {
			System.out.println("Stok tidak cukup");
		}
	}
}
