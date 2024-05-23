package TugasAbstrakInterface.tugas;

public class Burung implements Peliharaan{
	String makanan;
	
	public Burung(String makanan) {
		this.makanan = makanan;
	}

	@Override
	public void makan() {
		// TODO Auto-generated method stub
		System.out.println("Burung sedang makan " + makanan) ;
		
	}

	@Override
	public void kegiatan() {
		// TODO Auto-generated method stub
		System.out.println("Setelah makan, Burung bersiul senang");
	}
	

}
