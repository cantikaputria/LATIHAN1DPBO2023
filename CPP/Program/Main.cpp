/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

//LIBRARY
#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

using namespace std;

int main()
{
    //INSTANSIASI KONSTRUKTOR 1
    Mahasiswa data;
    list<Mahasiswa> upi;

    int i = 0, n = 0, query = 0, ketemu = 0;
    int nim = 0, upNim = 0;
    int cari = 0;
    string nama, prodi, fakultas;
    string upNama, upProdi, upFakultas;

    cout << "--------------------------" << '\n';
    cout << "      SELAMAT DATANG!     " << '\n';
    cout << "--------------------------" << '\n';
    cout << ">>>>>>>>>let's go<<<<<<<<<" << '\n';

    do
    {
        cout << "--------------------------" << '\n';
        cout << "          MENU            " << '\n';
        cout << "--------------------------" << '\n';
        cout << "[1] Insert Data" << '\n';
        cout << "[2] Update Data" << '\n';
        cout << "[3] Delete Data" << '\n';
        cout << "[4] Display Data" << '\n';
        cout << "[5] Exit" << '\n';
        cout << '\n';    

        cout << "Masukkan nomor query!" << '\n';
        cin >> query;

        if(query == 0 && query > 5)
        {
            cout << ("Query tidak sesuai!") << '\n';
        }

        switch(query)
        {
            case 1:
                cout << "--------------------------" << '\n';
                cout << "Masukkan data Mahasiswa!" << '\n';
                cout << "--------------------------" << '\n';

                cout << "> Nama : ";
                cin >> nama;

                cout << "> NIM : ";
                cin >> nim;

                cout << "> Program Studi : ";
                cin >> prodi;

                cout << "> Fakultas : ";
                cin >> fakultas;

                data.set_nama(nama);
                data.set_nim(nim);
                data.set_prodi(prodi);
                data.set_fakultas(fakultas);

                upi.push_back(data);

                cout << "--------------------------" << '\n';
                cout << "   DATA BERHASIL DIINPUT  " << '\n';
                cout << "--------------------------" << '\n' << '\n';
            break;

            case 2:
                cout << "--------------------------" << '\n';
                cout << "Masukkan NIM Mahasiswa yang ingin diupdate!" << '\n';
                cout << "--------------------------" << '\n';
                cin >> cari;

                ketemu = 0;

                for (list<Mahasiswa>::iterator it = upi.begin(); it != upi.end(); it ++) 
                {
                    if(it->get_nim() == cari) 
                    {
                        cout << "> Update Nama : ";
                        cin >> upNama;                      

                        cout << "> Update NIM : ";
                        cin >> upNim;                       

                        cout << "> Update Program Studi : ";
                        cin >> upProdi;
                        
                        cout << "> Update Fakultas : ";
                        cin >> upFakultas;
                        

                        it->set_nama(upNama);
                        it->set_nim(upNim);
                        it->set_prodi(upProdi);
                        it->set_fakultas(upFakultas);

                        ketemu = 1;
                    }
                }
   
                if(ketemu == 0)
                {
                    cout << "--------------------------" << '\n';
                    cout << "      DATA TIDAK COCOK    " << '\n';
                    cout << "--------------------------" << '\n';
                    cout << '\n';
                }
                else
                {
                    cout << "--------------------------" << '\n';
                    cout << "   DATA BERHASIL DIUPDATE " << '\n';
                    cout << "--------------------------" << '\n';
                    cout << '\n';
                }
            break;

            case 3:
                cout << "--------------------------" << '\n';
                cout << "Masukkan NIM Mahasiswa yang ingin dihapus!" << '\n';
                cout << "--------------------------" << '\n';
                cin >> cari;

                ketemu = 0;

                for (list<Mahasiswa>::iterator it = upi.begin(); it != upi.end(); it ++) 
                {
                    if(it->get_nim() == cari)
                    {
                        upi.erase(it);
                        it = upi.end();
                        ketemu = 1;
                    }
                }

                if(ketemu == 0)
                {
                    cout << "--------------------------" << '\n';
                    cout << "      DATA TIDAK COCOK    " << '\n';
                    cout << "--------------------------" << '\n';
                    cout << '\n';
                }
                else
                {
                    cout << "--------------------------" << '\n';
                    cout << "   DATA BERHASIL DIHAPUS  " << '\n';
                    cout << "--------------------------" << '\n';
                    cout << '\n';
                }
            break;

            case 4:

            if (upi.size() == 0) 
            {
                cout << "--------------------------" << '\n';
                cout << "         DATA KOSONG      " << '\n';
                cout << "--------------------------" << '\n';
                cout << '\n';
            }

            for (list<Mahasiswa>::iterator it = upi.begin(); it != upi.end(); it++)
            {
                cout << "--------------------------" << '\n';
                cout << "       DATA MAHASISWA     " << '\n';
                cout << "--------------------------" << '\n';
                cout << "No : " << (i + 1) << '\n';
                cout << "Nama : " << it->get_nama() << '\n';
                cout << "NIM : " << it->get_nim() << '\n';
                cout << "Program Studi : " << it->get_prodi() << '\n';
                cout << "Fakultas : " << it->get_fakultas() << '\n';
                cout << "--------------------------" << '\n' << '\n';
                
                i++;
            }
            break;
        }
    } while (query != 5);
    
    cout << "--------------------------" << '\n';
    cout << "        TERIMA KASIH      " << '\n';
    cout << "--------------------------" << '\n';
    
    return 0;
}