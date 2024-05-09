package Tugas9;

public class Main {
    public static void main(String[] args) {
        DokterExtendsJabatan pg = new DokterExtendsJabatan("223040105", "07102003", "SPECIALIST", "100.000.000");
        System.out.println(pg.getKodeDokter() + " - " + pg.getIdJabatan() + " - " + pg.getJabatan() + " - " + pg.getGaji());
    }
}
