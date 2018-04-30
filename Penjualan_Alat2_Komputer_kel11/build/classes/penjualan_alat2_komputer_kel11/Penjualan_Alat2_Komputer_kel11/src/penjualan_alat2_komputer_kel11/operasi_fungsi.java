package penjualan_alat2_komputer_kel11;

import java.util.Scanner;

public class operasi_fungsi {
        String namapegawai;
        int pnilai;
        String id;
        String nomorhape;
        String menu;
        
        public operasi_fungsi(){
            System.out.println("");
        }
        public operasi_fungsi(String namapegawai, String id){
            this.namapegawai = namapegawai;
            this.id=id;
        }
        public String data(){
            return "Nama Pegawai : "+ namapegawai+"\nID Pegawai : "+id;
        }
        public void nomorpengaduan(){
            System.out.println("Apabila ada keluhan, anda dapat menghubungi nomor :");
            System.out.println("089988776655");
        }
        public void daftarlaptop(){
        System.out.println("==============================================================================================================================="); 
        System.out.println("                                                    Toko Laptop Abdilah                                                        "); 
        System.out.println("===============================================================================================================================");             
        System.out.println("                                                 Laptop yang tersedia                                                    "); 
        System.out.println("===============================================================================================================================");  
        System.out.println("1. Acer 4732Z       14 inchi/Intel Pentium 2.1 GHz/RAM 1 GB/VGA Intel GMA 64MB/ HDD 160 GB                              1,2  Jt");  
        System.out.println("2. ASUS X540Y       15,6 inchi/AMD E1-7010 1.5 GHz/RAM 2 GB/VGA AMD Radeon R2/ HDD 500 GB                               3,2  Jt"); 
        System.out.println("3. Lenovo G41-35    14 inchi/AMD A8-7410 2.5 GHz/RAM 4 GB/VGA AMD Radeon R5 2GB/ HDD 500 GB                             3,8  Jt");
        System.out.println("4. Acer E5-475G     14 inchi/Intel Core i5 7200U 2.5GHz/RAM 4 GB/VGA NVIDIA GeForce GT940MX 2GB/ HDD 1 TB               6,8  Jt");
        System.out.println("5. ASUS X550VX      15,6 inchi/ Intel Core i7 7700HQ/RAM 8GB/VGA NVIDIA GeForce GTX 950M 2GB/ HDD 1 TB                  10   Jt");
        System.out.println("6. ASUS ROG GL552VX 17,3 inchi/ Intel Core i7 7700HQ/RAM 4GB/VGA NVIDIA GeForce GTX 950M 2GB/ HDD 1 TB                  12,5 Jt");
        System.out.println("7. Acer Prd. G9-793 17,3 inchi/ Intel Core i7 7700HQ/RAM 32GB/VGA NVIDIA GeForce GTX 1070 8GB/ HDD 1 TB + SSD 256 GB    38   Jt");
        System.out.println("8. ASUS ROG GX800VH 18,4 inchi/ Intel Core i7 7820HK/RAM 64GB/VGA NVIDIA GeForce GTX 1080 SLI 16 GB/ SSD 512 GB x 4     95   Jt");
        System.out.println("===============================================================================================================================");
    }
        public void layanan(int layanan){
            
            Scanner lae = new Scanner (System.in);
            System.out.println("Kualitas Layanan : ");
            System.out.println("1. Sangat Buruk");
            System.out.println("2. Kurang");
            System.out.println("3. Cukup");
            System.out.println("4. Baik");
            System.out.println("5. Sangat Baik");
            System.out.print("pilihan anda : ");
            try{
            pnilai = lae.nextInt();
            if (pnilai>2 && pnilai<=5){
                System.out.println("Terima kasih atas tanggapan yang Anda berikan.");
            }else if (pnilai ==1||pnilai ==2){
                System.out.println("Maaf membuat Anda tidak nyaman, kami akan memperbaiki kualitas pelayanan. ");
            }
            else{System.out.println("Masukkan salah");
            }
            } catch(Exception ioe) {
                System.out.println("Masukkan salah");
            }
            

        }
}