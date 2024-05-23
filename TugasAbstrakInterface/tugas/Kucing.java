package TugasAbstrakInterface.tugas;

public class Kucing implements Peliharaan{
	String makanan;
	public Kucing(String makanan) {
		this.makanan=makanan;
	}

	@Override
	public void makan() {
		// TODO Auto-generated method stub
		System.out.println("Kucing makan " + makanan);
	}

	@Override
	public void kegiatan() {
		// TODO Auto-generated method stub
		System.out.println("Kucing sedang mengejar tikus");
	}

}
