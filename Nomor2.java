import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Daftar Buku Buku
        String[] judulBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] hargaBuku = {350000, 450000, 500000, 95000};

        System.out.println("Daftar Buku");
        for (int i = 0; i < judulBuku.length; i++) {
            System.out.println(judulBuku[i] + " " + hargaBuku);
        }

        ArrayList<Integer> hargaBelanja = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean inputKembali = true;
        while (inputKembali){
            System.out.print("Masukkan Pilihan Buku [1/2/3/4]:");
            int Pilihan = scanner.nextInt();
            hargaBelanja.add(hargaBuku[Pilihan - 1]);
            System.out.println("Input Lagi (Y/N)?: ");
            String selanjutnya = scanner.next();
            if (selanjutnya.equalsIgnoreCase(N)){
                inputKembali = false;
            }
        }

        int totalHarga = hitungTotalHarga(hargaBelanja);
        int voucherBelanja = hitungVoucherBelanja(totalHarga);

        System.out.println("Total voucher belanja = " + voucherBelanja);
        System.out.println("Total Pembayaran = " + (totalHarga - voucherBelanja));

        public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
            int totalHarga = 0;
            for (int harga : hargaBelanja) {
                totalHarga += harga;
            }
            return totalHarga;
        }
    
        // Prosedur untuk menghitung voucher belanja
        public static int hitungVoucherBelanja(int totalHarga) {
            if (totalHarga < 200000) {
                return 0;
            } else if (totalHarga >= 200000 && totalHarga <= 500000) {
                return 50000;
            } else if (totalHarga > 500000 && totalHarga <= 750000) {
                return 100000;
            } else if (totalHarga > 750000 && totalHarga <= 1000000) {
                return 150000;
            } else {
                return 200000;
            }
        }
    }
}

        /* Pekerjaan anda mulai dari sini */

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 



