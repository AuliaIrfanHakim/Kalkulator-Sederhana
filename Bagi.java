public class Bagi {
    void operasi(double a, double b) {
        if (b == 0) {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
        } else {
            double hasil = a / b;
            System.out.println("Hasil pembagian: " + hasil);
        }
    }
}
