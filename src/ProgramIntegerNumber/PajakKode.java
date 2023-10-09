package ProgramIntegerNumber;

public class PajakKode {
    public static void main(String[] args) {
        // Kode pajak untuk jenis transaksi tertentu
        byte kodePajak1 = 50; // Misalnya, 1 mewakili pajak penghasilan
        short kodePajak2 = 1050;
        int kodePajak3 = 10501050;
        long kodePajak4 = 1050105010;
        
        // Simpan nilai pajak dalam persentase
        byte persentasePajak1 = 50; // 10% pajak penghasilan
        short persentasePajak2 = 1000;
        int persentasePajak3 = 10000000;
        long persentasePajak4 = 1000000000;
        
        // Menampilkan kode pajak
        System.out.println("Kode Pajak 1: " + kodePajak1);
        System.out.println("Kode Pajak 2: " + kodePajak2);
        System.out.println("Kode Pajak 3: " + kodePajak3);
        System.out.println("Kode Pajak 4: " + kodePajak4);
        
        // Menampilkan persentase pajak
        System.out.println("Persentase Pajak 1: " + persentasePajak1 + "%");
        System.out.println("Persentase Pajak 2: " + persentasePajak2 + "%");
        System.out.println("Persentase Pajak 3: " + persentasePajak3 + "%");
        System.out.println("Persentase Pajak 4: " + persentasePajak4 + "%");
    }
}
