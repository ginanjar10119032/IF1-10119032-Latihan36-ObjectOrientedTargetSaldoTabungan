package if1.pkg10119032.latihan36.objectorientedtargetsaldotabungan;
import java.text.NumberFormat;
import java.util.Locale;  

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * program target saldo tabungan menggunakan konsep pendekatan berbasis objek
 */
public class IF110119032Latihan36ObjectOrientedTargetSaldoTabungan {

    public int saldoAwal, lama;
    public double bungaPerBulan;
    
    public void hitungSaldo(){
        saldoAwal = 3500000;
        bungaPerBulan = 0.08;
        lama = 8;
        for (int i = 1; i <= lama; i++){
            saldoAwal = (int) (saldoAwal + (saldoAwal * bungaPerBulan));
            NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id","ID"));
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + numberFormat.format(saldoAwal));            
    }
}
           
    public static void main(String[] args) {
        
        IF110119032Latihan36ObjectOrientedTargetSaldoTabungan tabungan = 
                new IF110119032Latihan36ObjectOrientedTargetSaldoTabungan();
        
        tabungan.hitungSaldo();
    }
    
}