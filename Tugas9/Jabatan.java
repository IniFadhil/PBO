package Tugas9;

public class Jabatan {
	  protected String idjabatan;
	  protected String jabatan;
	  protected String gaji;
	  
	  public Jabatan(String idjabatan, String jabatan, String gaji) {
		  this.idjabatan = idjabatan;
		  this.jabatan = jabatan;
		  this.gaji = gaji;
	  }
	  
	  public String getIdJabatan() {
		  return idjabatan;
	  }
	  public String getJabatan() {
		  return jabatan;
	  }
	  
	  public String getGaji() {
		  return gaji;
	  }
	}