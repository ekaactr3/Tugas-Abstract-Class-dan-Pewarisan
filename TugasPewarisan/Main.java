package TugasPewarisan;

public class Main {
    public static void main(String[] args) {
    IniTugas HarianTugas = new HarianTugas("Eka","OOP", "Sistem Informasi", "Mengerjakan OOP", "Kamis", "00.00");
    TugasPenting tugasPenting = new TugasPenting("Eka","Tugas Akhir","Sistem Informasi", "Membuat abstract class", "24 November 2023");
    TugasAkhir tugasAkhir = new TugasAkhir("Eka","OOP","Sistem Informasi", "Belajar Materi Bab 1-5", "25 Desember 2023");

    HarianTugas.informasi();
    HarianTugas.agenda();

    System.out.println();

    tugasPenting.informasi();
    tugasPenting.agenda();

    System.out.println();

    tugasAkhir.informasi();
    tugasAkhir.agenda();

    System.out.println();

    
    }
    
}
