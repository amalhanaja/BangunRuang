package bangundatar.Controller;

import bangundatar.DaftarBangun.Balok;
import bangundatar.DaftarBangun.Bola;
import bangundatar.DaftarBangun.Kubus;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public Button hitungKubus;
    public Button hitungBalok;
    public Button hitungBola;
    public TextField inputS, inputL, inputP, inputR, inputT;
    public Label kubusV, kubusLP, kubusDB, kubusDR
            ,balokV,balokLP,balokDBF,balokDBS,balokDBT,balokDR
            ,bolaV, bolaLP, bolaDB, bolaDR;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hitungKubus.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Kubus kubus = new Kubus(Double.parseDouble(inputS.getText()));
                double LP = kubus.hitungLuasPermukaan(kubus.getSisi());
                System.out.println(LP);
                kubusLP.setText("Luas Permukaan\t:\t" + String.format("%.2f", LP));
                kubusV.setText("Volume\t\t\t:\t" + String.format("%.2f",kubus.hitungVolume(kubus.getSisi())));
                kubusDB.setText("Diagonal Sisi\t\t:\t" + String.format("%.2f",kubus.hitungDiagonalSisi(kubus.getSisi())));
                kubusDR.setText("Diagonal Ruang\t:\t" + String.format("%.2f",kubus.hitungDiagonalRuang(kubus.getSisi())));
            }
        });

        hitungBalok.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Balok balok = new Balok(Double.parseDouble(inputP.getText()), Double.parseDouble(inputL.getText()), Double.parseDouble(inputT.getText()));
                balokLP.setText("Luas Permukaan\t:\t" + String.format("%.2f", balok.hitungLuasPermukaan(balok.getPanjang(), balok.getLebar(), balok.getTinggi())));
                balokV.setText("Volume\t\t\t:\t" + String.format("%.2f",balok.hitungVolume(balok.getPanjang(), balok.getLebar(), balok.getTinggi())));
                balokDBF.setText("Diagonal Sisi Depan\t:\t" + String.format("%.2f",balok.hitungDiagonalBidangDepan(balok.getPanjang(), balok.getTinggi())));
                balokDBS.setText("Diagonal Sisi Kiri\t:\t" + String.format("%.2f",balok.hitungDiagonalBidangSamping(balok.getLebar(), balok.getTinggi())));
                balokDBT.setText("Diagonal Sisi Atas\t:\t" + String.format("%.2f",balok.hitungDiagonalBidangAtas(balok.getPanjang(), balok.getLebar())));
                balokDR.setText("Diagonal Ruang\t:\t" + String.format("%.2f",balok.hitungDiagonalRuang(balok.getPanjang(), balok.getLebar(), balok.getTinggi())));
            }
        });

        hitungBola.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Bola bola = new Bola(Double.parseDouble(inputR.getText()));
                bolaLP.setText("Luas Permukaan\t:\t" + String.format("%.2f", bola.hitungLuasPermukaan(bola.getJariJari())));
                bolaV.setText("Volume\t\t\t:\t" + String.format("%.2f",bola.hitungVolume(bola.getJariJari())));
                bolaDB.setText("Diagonal Sisi\t\t:\t" + String.format("%.2f",bola.hitungDiagonalSisi(bola.getJariJari())));
                bolaDR.setText("Diagonal Ruang\t:\t" + String.format("%.2f",bola.hitungDiagonalRuang(bola.getJariJari())));
            }
        });

    }
}