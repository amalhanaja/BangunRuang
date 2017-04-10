package bangundatar.Interface;

/**
 * Created by doy on 4/10/17.
 */
public interface HitungBalok {
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi);
    public double hitungVolume(double panjang, double lebar, double tinggi);
    public double hitungDiagonalBidangDepan(double panjang, double tinggi);
    public double hitungDiagonalBidangSamping(double lebar, double tinggi);
    public double hitungDiagonalBidangAtas(double panjang, double lebar);
    public double hitungDiagonalRuang(double panjang, double lebar, double tinggi);
}
