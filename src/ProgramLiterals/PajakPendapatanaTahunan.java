package ProgramLiterals;

public class PajakPendapatanaTahunan {
    public static void main(String[] args) {
        // Pendapatan tahunan dalam bentuk desimal
        int pendapatanTahunanDecimal = 50000;

        // Pendapatan tahunan dalam bentuk heksadesimal
        int pendapatanTahunanHexadecimal = 0xC350;

        // Pendapatan tahunan dalam bentuk biner
        int pendapatanTahunanBinary = 0b1100001101010000;

        // Tarif pajak dalam bentuk desimal (persentase)
        double tarifPajakDecimal = 0.15; // 15%

        // Menghitung jumlah pajak
        double jumlahPajakDecimal = pendapatanTahunanDecimal * tarifPajakDecimal;
        double jumlahPajakHexadecimal = pendapatanTahunanHexadecimal * tarifPajakDecimal;
        double jumlahPajakBinary = pendapatanTahunanBinary * tarifPajakDecimal;

        // Menampilkan hasil perhitungan
        System.out.println("Pendapatan Tahunan (Desimal): $" + pendapatanTahunanDecimal);
        System.out.println("Pendapatan Tahunan (Heksadesimal): $" + pendapatanTahunanHexadecimal);
        System.out.println("Pendapatan Tahunan (Biner): $" + pendapatanTahunanBinary);

        System.out.println("Tarif Pajak (Desimal): " + (tarifPajakDecimal * 100) + "%");

        System.out.println("Jumlah Pajak (Desimal): $" + jumlahPajakDecimal);
        System.out.println("Jumlah Pajak (Heksadesimal): $" + jumlahPajakHexadecimal);
        System.out.println("Jumlah Pajak (Biner): $" + jumlahPajakBinary);
    }
    
}
