package TugasAbstrakInterface.tugas;

public class PeliharaanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Kucing k= new Kucing("Ikan");
			Burung b= new Burung("jagung");
			k.makan();
			k.kegiatan();
			System.out.println("Untuk burung: ");
			b.makan();
			b.kegiatan();
	}

}
