package javaa;
import java.util.Scanner;
public class Javaa {
    
    static void nama() {
    System.out.println("Fawwaz Alifio Farsa");}
    
    static void kelas() {
    System.out.println("X RPL 3 / 17");}

    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in); 
        int tugas1, tugas2, tugas3, nilaiPKN, rataPKN;
        boolean keluar = true;
        String ulang;
        
        nama();
        kelas();
        
        System.out.println(" ");
        System.out.println("Nilai Rapor PKN");
        
        System.out.println("Masukkan nilai tugas 1 anda :");
        tugas1 = scan.nextInt();
        
        System.out.println("Masukkan nilai tugas 2 anda :");
        tugas2 = scan.nextInt();
        
        System.out.println("Masukkan nilai tugas 3 anda :");
        tugas3 = scan.nextInt();
        
        nilaiPKN = (tugas1 + tugas2 + tugas3);
        rataPKN = (nilaiPKN / 3);
        System.out.println("Nilai rapor PKN anda = " + rataPKN);
        
        if (rataPKN >= 85) {
        System.out.println("Grade anda adalah A");}
        
        if (rataPKN >= 75 && rataPKN <= 85) {
        System.out.println("Grade anda adalah B");}
        
        if (rataPKN >= 70 && rataPKN <= 75) {
        System.out.println("Grade anda adalah C");}
        
        if (rataPKN < 50){
        System.out.println("Mohon Maaf, anda tidak naik kelas");}
        
        else if(rataPKN >= 50){
        System.out.println("Anda naik kelas");    
        }
        
        System.out.println(" ");
        
            while( keluar ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab Ya atau Tidak ");

            ulang = scan.nextLine();
           
            if (ulang.equalsIgnoreCase("ya") ){
                keluar = false;
            }
        
    }
    
    }
}
