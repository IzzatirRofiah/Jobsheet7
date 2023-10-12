import java.util.Scanner;

public class Pelanggan16 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        String nama;
        char jawab;
        int jml = 0;

        do {
            System.out.print("Masukkan nama pelanggan : ");
            nama = input16.nextLine();
            jml++;
            System.out.print("Apakah anda imgin memasukkan nama pelanggan baru (Y/T)? ");
            jawab = input16.nextLine() .charAt(0);
        } while (jawab == 'y' || jawab == 'Y');
        System.out.println("Jumlah pelanggan yang anda masukkan = " + jml);
    }
}