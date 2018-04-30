package penjualan_alat2_komputer_kel11;

public class Penjualan_Laptop_kel11 {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Toko Kami");
        System.out.println("");
        System.out.println("Berikut Daftar Laptop yang tersedia : ");
        operasi_fungsi func = new operasi_fungsi();
        func.daftarlaptop ();
        in_out objek = new in_out();
        System.out.println("Bagaimana pelayanan kami terhadap Anda ?");
        operasi_fungsi one = new operasi_fungsi("Fiqri Abdilah","21120117130061");
        System.out.println(one.data());
        func.layanan(1-5);
        System.out.println("");
        func.nomorpengaduan();
    }
}