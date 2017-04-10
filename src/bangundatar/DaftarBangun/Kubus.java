package bangundatar.DaftarBangun;

import bangundatar.Interface.HitungKubus;

/**
 * Created by doy on 4/10/17.
 */
public class Kubus implements HitungKubus{
    public double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuasPermukaan(double sisi) {
        return 6*Math.pow(sisi, 2);
    }

    @Override
    public double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

    @Override
    public double hitungDiagonalSisi(double sisi) {
        return sisi*Math.sqrt(2);
    }

    @Override
    public double hitungDiagonalRuang(double sisi) {
        return sisi*Math.sqrt(3);
    }
}
