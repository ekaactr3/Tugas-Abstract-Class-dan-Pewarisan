package TugasPewarisan;

public abstract class IniTugas {
    public String nama;
    public String mataKuliah;
    public String jurusan;
    public String deskripsi;

    public IniTugas(String nama, String mataKuliah, String jurusan, String deskripsi) {
        this.nama = nama;
        this.mataKuliah = mataKuliah;
        this.jurusan = jurusan;
        this.deskripsi = deskripsi;
    }

    public String Nama() {
        return nama;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getJurusan(){
        return jurusan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public abstract void agenda();


    public void informasi() {
        System.out.println("Informasi Tugas: ");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Deskripsi: " + deskripsi);
    }
    


    
}
