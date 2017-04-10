package bangundatar.DaftarBangun;

import bangundatar.Interface.HitungBalok;

/**
 * Created by doy on 4/10/17.
 */
public class Balok implements HitungBalok {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2*(panjang * lebar) + 2*(panjang * tinggi) + 2 * (lebar * tinggi);
    }

    @Override
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungDiagonalBidangDepan(double panjang, double tinggi) {
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(tinggi, 2));
    }

    @Override
    public double hitungDiagonalBidangSamping(double lebar, double tinggi) {
        return Math.sqrt(Math.pow(lebar, 2) + Math.pow(tinggi, 2));
    }

    @Override
    public double hitungDiagonalBidangAtas(double panjang, double lebar) {
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }

    @Override
    public double hitungDiagonalRuang(double panjang, double lebar, double tinggi) {
        return Math.sqrt(hitungDiagonalBidangAtas(panjang, lebar) + tinggi);
    }
}