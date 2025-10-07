package week06_132504;

class Handphone extends Barang {
	private String warna;
	public static int total = 0;
	
	public Handphone(int Id, String nama, double harga, String warna, int stok) {
		super(Id, nama, harga);
		this.warna = warna;
		total++;
	}
	public String getWarna() {
		return warna;
	}
	
}
