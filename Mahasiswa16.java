import java.util.Scanner;

public class Mahasiswa16 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        int jml = 1;
        String nama = "";
        String jenisKelamin = "";
        String output = "";
        
         while (jml <= 30){
            System.out.print("Masukkan nama mahasiswa: ");
            nama = input16.nextLine();
            jml++;
            System.out.print("Masukkan jenis kelaminmu : ");
            jenisKelamin = input16.nextLine();
            if (jenisKelamin.equalsIgnoreCase("P")) {  
            output += nama;
         }
        }  System.out.printf("Mahasiswa Perempuan : %s \t",output);
    }
}