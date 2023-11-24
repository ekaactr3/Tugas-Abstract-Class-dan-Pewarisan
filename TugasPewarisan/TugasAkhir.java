package TugasPewarisan;

public class TugasAkhir extends IniTugas {
    public String penjadwalan;

    public TugasAkhir(String nama, String mataKuliah, String jurusan, String deskripsi, String penjadwalan) {
        super(nama, mataKuliah, jurusan, deskripsi);
        this.penjadwalan = penjadwalan;
    }

    @Override
    public void agenda(){
        System.out.println("Agenda Tugas Akhir");
        System.out.println("Jadwal ujian akhir yaitu " + penjadwalan);
    }

}
