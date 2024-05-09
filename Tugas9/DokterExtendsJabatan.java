package Tugas9;

public class DokterExtendsJabatan extends Jabatan {
    private String kodedokter;

    public DokterExtendsJabatan(String kodedokter, String idjabatan, String jabatan, String gaji) {
        super(idjabatan, jabatan, gaji);
        setKodeDokter(kodedokter);
    }

    public String getKodeDokter() {
        return kodedokter;
    }

    public void setKodeDokter(String kodedokter) {
        this.kodedokter = kodedokter;
    }
}
