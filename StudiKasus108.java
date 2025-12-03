import java.util.Scanner;

public class StudiKasus108 {
    // Fungsi rekursif
    static int totalNilaiRekursif(int n) {
        Scanner sc = new Scanner(System.in);

        if (n == 0) {
            return 0; // Base case: jika sisa nya 0, akan kembali 0
        } else {
            System.out.print("Masukkan angka ke-" + n + " : ");
            int angka = sc.nextInt();
            // rekursif untuk menjumlahkan angka nyaa
            return angka + totalNilaiRekursif(n - 1); 
        }
    }

    // Fungsi iteratif
    static int totalNilaiIteratif(int n) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        // Dibuat decrement untuk memulai dari angka terakhir sampai angka pertama
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            int angka = sc.nextInt();
            total += angka;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input jumlah angka
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        // Memanggil fungsi rekursif
        System.out.println("Bagian Fungsi Rekursif: ");
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalNilaiRekursif(n));

        // Memanggil fungsi iteratif
        System.out.println("Bagian Fungsi Iteratif: ");
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalNilaiIteratif(n));
    }
}