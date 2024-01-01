import java.util.Scanner;

class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aplikasi Kalkulator Sederhana");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int pilihan = scanner.nextInt();

        if (pilihan < 1 || pilihan > 4) {
            System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
            return;
        }

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        switch (pilihan) {
            case 1:
                Tambah tambah = new Tambah();
                tambah.operasi(bilangan1, bilangan2);
                break;
            case 2:
                Kurang kurang = new Kurang();
                kurang.operasi(bilangan1, bilangan2);
                break;
            case 3:
                Kali kali = new Kali();
                kali.operasi(bilangan1, bilangan2);
                break;
            case 4:
                Bagi bagi = new Bagi();
                bagi.operasi(bilangan1, bilangan2);
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }
    }
}