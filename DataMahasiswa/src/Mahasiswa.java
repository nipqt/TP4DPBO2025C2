public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String jenisMusik;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String jenisMusik) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jenisMusik = jenisMusik;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setJenisMusik(String jenisMusik) { this.jenisMusik = jenisMusik; }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getJenisMusik() { return this.jenisMusik; }
}
