package TugasPewarisan;

public class TugasPenting extends IniTugas {
    public String tenggatPengumpulan;

    public TugasPenting(String nama, String mataKuliah, String jurusan, String deskripsi, String tenggatPengumpulan) {
        super(nama, mataKuliah, jurusan, deskripsi);
        this.tenggatPengumpulan = tenggatPengumpulan;

    }


    @Override
    public void agenda (){
        System.out.println("Agenda Tugas Penting");
        System.out.println("Jadwal Tugas Penting dengan tenggat pada " + tenggatPengumpulan);
        }
    

    public void agenda(String waktu) {
        System.out.println("Jadwal Tugas Penting dengan tenggat pada " + tenggatPengumpulan + ", waktu " + waktu);
        }


    
}
