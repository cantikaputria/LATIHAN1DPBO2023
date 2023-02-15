/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

//KELAS MAHASISWA
public class Mahasiswa
{
    //PRIVATE VARIABEL
    private String nama;
    private int nim;
    private String prodi;
    private String fakultas;

    //PUBLIC
    public Mahasiswa()
    {

    }

    public Mahasiswa(String nama, int nim, String prodi, String fakultas)
    {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    //SETTER DAN GETTER NAMA
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return this.nama;
    }

    //SETTER DAN GETTER NIM
    public void setNim(int nim)
    {
        this.nim = nim;
    }

    public int getNim()
    {
        return this.nim;
    }

    //SETTER DAN GETTER PRODI
    public void setProdi(String prodi)
    {
        this.prodi = prodi;
    }

    public String getProdi()
    {
        return this.prodi;
    }

    //SETTER DAN GETTER FAKULTAS
    public void setFakultas(String fakultas)
    {
        this.fakultas = fakultas;
    }

    public String getFakultas()
    {
        return this.fakultas;
    }
}