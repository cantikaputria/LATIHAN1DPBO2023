//LIBABRY
#include <iostream>
#include <string>

//STANDAR NAMESPACE
using namespace std;

//DEKLARASI KELAS
class Mahasiswa
{ 
    //ATRIBUT PRIVAT
    private:
        string nama;
        int nim;
        string prodi;
        string fakultas;

    //ATRIBUT PUBLIK
    public:

        //KONSTRUKTOR
        Mahasiswa()
        {

        }

        Mahasiswa(string nama, int nim, string prodi, string fakultas)
        {
            this->nama = nama;
            this->nim = nim;
            this->prodi = prodi;
            this->fakultas = fakultas;
        }

        //GETTER DAN SETTER
        string get_nama()
        {
            return this->nama;
        }

        void set_nama(string nama)
        {
            this->nama = nama;
        }

        int get_nim()
        {
            return this->nim;
        }

        void set_nim(int nim)
        {
            this->nim = nim;
        }

        string get_prodi()
        {
            return this->prodi;
        }

        void set_prodi(string prodi)
        {
            this->prodi = prodi;
        }

        string get_fakultas()
        {
            return this->fakultas;
        }

        void set_fakultas(string fakultas)
        {
            this->fakultas = fakultas;
        }

        //DESTRUKTOR
        ~Mahasiswa()
        {

        }
};