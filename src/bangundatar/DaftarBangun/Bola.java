package bangundatar.DaftarBangun;

import bangundatar.Interface.HitungBola;

/**
 * Created by doy on 4/10/17.
 */
public class Bola implements HitungBola{
    public double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume(double jariJari) {
        return (Math.pow(jariJari, 3) * Math.PI * 4)/3;
    }

    @Override
    public double hitungLuasPermukaan(double jariJari) {
        return 4*Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public double hitungDiagonalSisi(double jariJari) {
        return Math.PI*2*jariJari;
    }

    @Override
    public double hitungDiagonalRuang(double jariJari) {
        return 2*jariJari;
    }
}
