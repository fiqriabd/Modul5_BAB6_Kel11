package penjualan_alat2_komputer_kel11;

import java.util.Scanner;
public class in_out {
    
public
    String Laptop=""; 
        int p1=1200000, p2=3200000, p3=3800000, p4=6800000, p5=10000000, p6=12500000, p7=39000000, p8=95000000; //harga Laptop Gaming
        int Qty=0, QtyP=0; //Banyak Item 
        int TP=0; //Total Item      
        int TotalLaptop=0; 
        
        String Laptop1="Acer 4732Z       14 inchi/Intel Pentium 2.1 GHz/RAM 1 GB/VGA Intel GMA 64MB/ HDD 160 GB",                    
               Laptop2="ASUS X540Y       15,6 inchi/AMD E1-7010 1.5 GHz/RAM 2 GB/VGA AMD Radeon R2/ HDD 500 GB",
               Laptop3="Lenovo G41-35    14 inchi/AMD A8-7410 2.5 GHz/RAM 4 GB/VGA AMD Radeon R5 2GB/ HDD 500 GB",
               Laptop4="Acer E5-475G     14 inchi/Intel Core i5 7200U 2.5GHz/RAM 4 GB/VGA NVIDIA GeForce GT940MX 2GB/ HDD 1 TB",
               Laptop5="ASUS X550VX      15,6 inchi/ Intel Core i7 7700HQ/RAM 8GB/VGA NVIDIA GeForce GTX 950M 2GB/ HDD 1 TB",
               Laptop6="ASUS ROG GL552VX 17,3 inchi/ Intel Core i7 7700HQ/RAM 4GB/VGA NVIDIA GeForce GTX 950M 2GB/ HDD 1 TB",
               Laptop7="Acer Prd. G9-793 17,3 inchi/ Intel Core i7 7700HQ/RAM 32GB/VGA NVIDIA GeForce GTX 1070 8GB/ HDD 1 TB + SSD 256 GB",
               Laptop8="ASUS ROG GX800VH 18,4 inchi/ Intel Core i7 7820HK/RAM 64GB/VGA NVIDIA GeForce GTX 1080 SLI 16 GB/ SSD 512 GB x 4 "; //Input Data / Pilihan
public in_out(){
        Scanner input=new Scanner(System.in); //Display awal
         
        System.out.print("Pilih Laptop Nomor : "); 
        Laptop=input.next();      
            switch (Laptop){  
                case "1" :
                    System.out.print("Berapa banyak : ");   
                    try{
                    Qty=input.nextInt();   
                    TP=p1*Qty;    
                    }    
                    catch(Exception ioe) {
                    System.out.println("Masukkan salah");
                    }
                    System.out.println("\nLaptop1 "+Laptop1+" Rp."+p1);    
                    break; 
                case "2" :
                    System.out.print("Berapa banyak : ");
                    try{
                        Qty=input.nextInt();   
                        TP=p2*Qty;
                    }    
                    catch(Exception ioe) {
                     System.out.println("Masukkan salah");
                    }
                    System.out.println("\nLaptop2 "+Laptop2+" Rp."+p2);   
                    break; 
                case "3" :
                    System.out.print("Berapa banyak : ");
                    try{
                        Qty=input.nextInt();    
                        TP=p3*Qty;
                    }    
                    catch(Exception ioe){
                    System.out.println("MASUKKAN ANGKA 1-8");
                    }
                    System.out.println("\nLaptop3 "+Laptop3+" Rp."+p3);  
                    break;
                case "4" :
                    System.out.print("Berapa banyak : ");
                    try{
                        Qty=input.nextInt();    
                        TP=p4*Qty;
                    }
                    catch(Exception ioe){
                    System.out.println("MASUKKAN ANGKA 1-8");
                    }
                    System.out.println("\nLaptop4 "+Laptop4+" Rp."+p4);  
                    break;
                case "5" :
                    System.out.print("Berapa banyak : ");
                    try{
                        Qty=input.nextInt();    
                        TP=p5*Qty;
                    }
                    catch(Exception ioe){
                    System.out.println("Masukkan salah");
                    }
                    System.out.println("\nLaptop5 "+Laptop5+" Rp."+p5);  
                    break;
                case "6" :
                    System.out.print("Berapa banyak : ");
                    try{
                        Qty=input.nextInt();    
                        TP=p6*Qty;
                    }
                    catch(Exception ioe){
                    System.out.println("Masukkan salah");
                    }
                    System.out.println("\nLaptop6 "+Laptop6+" Rp."+p6);  
                    break;
                case "7" :
                    System.out.print("Berapa banyak : ");
                    try{
                        Qty=input.nextInt();    
                        TP=p7*Qty;
                    }
                    catch(Exception ioe){
                    System.out.println("Masukkan salah");
                    }
                    System.out.println("\nLaptop7 "+Laptop7+" Rp."+p7);  
                    break;
                case "8" :
                    System.out.print("Berapa banyak : ");
                    try{
                        Qty=input.nextInt();    
                        TP=p8*Qty;
                    }
                    catch(Exception ioe){
                    System.out.println("Masukkan salah");
                    }
                    System.out.println("\nLaptop8 "+Laptop8+" Rp."+p8);  
                    break;

                default :
                    System.out.println("Tidak Ada Laptop");    
                    break;    
            }   
                System.out.println("Total Pembelian Laptop = Rp."+TP);    
                    
        int Total=TP;             
            System.out.println("                                                   Total Belanja Anda                                                      "); 
            System.out.println("==============================================================================================================================="); 
            System.out.println("Laptop yang Anda beli                                                                                            = Rp."+TP);  
            System.out.println("===============================================================================================================================");  
            System.out.println("Tagihan                                                                                                          = Rp."+Total);
            System.out.print  ("Tunai                                                                                                            = Rp.");  
            int Cash=input.nextInt(), kembali=(Cash-Total);  
            if (Cash<=Total){
            System.out.println("Uang Anda Kurang                                                                                                 = Rp."+(Cash-Total));
            }else if(Cash>=Total){
            
            System.out.println("===============================================================================================================================");   
            System.out.println("Kembalian Anda                                                                                                   = Rp."+kembali);
            System.out.println("===============================================================================================================================");  
            System.out.println("                                            TERIMA KASIH ATAS KUNJUNGAN ANDA ^^                                                ");
           
            System.out.println("==============================================================================================================================="); 
        }
    }        
}