package Tugas2;

import java.util.Scanner;

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    public double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Lebar: ");
        double lebar = scanner.nextDouble();

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        double luas = persegiPanjang.hitungLuas();
        double keliling = persegiPanjang.hitungKeliling();

        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);

        scanner.close();
    }
}
