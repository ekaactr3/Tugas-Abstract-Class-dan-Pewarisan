package TugasPewarisan;

public class HarianTugas extends IniTugas {
    public String hari;
    public String jam;

    public HarianTugas(String nama, String mataKuliah, String jurusan, String deskripsi, String hari, String jam) {
        super(nama, mataKuliah, jurusan, deskripsi);
        this.hari = hari;
        this.jam = jam;

    }

    @Override
    public void agenda() {
        System.out.println("Agenda Tugas Harian");
        System.out.println("Pengumpulan tugas pada hari " + hari );
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Pengumpulan tugas pada jam " + jam);
    }

    
}
