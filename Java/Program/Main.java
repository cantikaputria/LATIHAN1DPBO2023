/* 
    Saya Cantika Putri Arbiliansyah dengan NIM 2103727 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

//LIBRARY
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //INSTASIASI 
        ArrayList<Mahasiswa> list = new ArrayList<>();

        //DEKLARASI VARIABEL
        int i = 0, n = 0, query = 0, ketemu = 0;
        int nim = 0, upNim = 0;
        int cari = 0;
        String nama, prodi, fakultas;
        String upNama, upProdi, upFakultas;

        Scanner sc = new Scanner(System.in);

        //OPENING
        System.out.println("--------------------------");
        System.out.println("      SELAMAT DATANG!     ");
        System.out.println("--------------------------");
        System.out.println(">>>>>>>>>let's go<<<<<<<<<");

        do
        {
            //TAMPILKAN MENU
            System.out.println("--------------------------");
            System.out.println("          MENU            ");
            System.out.println("--------------------------");
            System.out.println("[1] Insert Data");
            System.out.println("[2] Update Data");
            System.out.println("[3] Delete Data");
            System.out.println("[4] Display Data");
            System.out.println("[5] Exit");
            System.out.println(" ");

            //INPUT QUERY
            System.out.println("Masukkan nomor query!");

            //PENGECEKAN TIPE QUERY
            try
            {
                query = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("The query is not an integer!");
            }

            //PENGECEKAN RENTANG QUERY
            if(query == 0 && query > 5)
            {
                System.out.println("Query tidak sesuai!");
            }

            //PENGECEKAN QUERY
            switch(query)
            {
                //QUERY INSERT DATA
                case 1:
                    System.out.println("--------------------------");
                    System.out.println("Masukkan data Mahasiswa!");
                    System.out.println("--------------------------");

                    //INPUT DATA
                    System.out.println("> Nama : ");
                    nama = sc.next(); 

                    System.out.println("> NIM : ");
                    nim = sc.nextInt();

                    System.out.println("> Program Studi : ");          
                    prodi = sc.next();
                
                    System.out.println("> Fakultas : ");
                    fakultas = sc.next();

                    //MASUKKAN KE LIST
                    list.add(new Mahasiswa(nama, nim, prodi, fakultas));

                    //PESAN KONFIRMASI
                    System.out.println("--------------------------");
                    System.out.println("   DATA BERHASIL DIINPUT  ");
                    System.out.println("--------------------------");
                    System.out.println(" ");
                break;

                //QUERY UPDATE DATA
                case 2:
                    System.out.println("--------------------------");
                    System.out.println("Masukkan NIM Mahasiswa yang ingin diupdate!");
                    System.out.println("--------------------------");
                    ketemu = 0; //penanda

                    //INPUT NIM YANG DICARI
                    try
                    {
                        cari = sc.nextInt();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Ups, the input is'nt integer!");
                    }

                    //SEARCHING NIM YANG DIINPUT DI LIST
                    for (i = 0; i <list.size(); i++)
                    {
                        //JIKA KETEMU
                        if(list.get(i).getNim() == cari)
                        {
                            //MINTA USER UPDATE DATA
                            System.out.print("> Update Nama : ");
                            upNama = sc.next();
                        
                            System.out.print("> Update NIM : ");
                            upNim = sc.nextInt();
                        
                            System.out.print("> Update Program Studi : ");
                            upProdi = sc.next();

                            System.out.print("> Update Fakultas : ");
                            upFakultas = sc.next();
                            
                            //UPDATE LIST
                            list.set(i, new Mahasiswa(upNama, upNim, upProdi, upFakultas));
                            ketemu = 1;         //penanda
                        }
                    }

                    //PENGECEKAN
                    if(ketemu == 0)
                    {
                        System.out.println("--------------------------");
                        System.out.println("      DATA TIDAK COCOK    ");
                        System.out.println("--------------------------");
                        System.out.println(" ");
                    }
                    else
                    {
                        System.out.println("--------------------------");
                        System.out.println("   DATA BERHASIL DIUPDATE ");
                        System.out.println("--------------------------");
                        System.out.println(" ");
                    }
                break;

                //QUERY DELETE DATA
                case 3:
                    System.out.println("--------------------------");
                    System.out.println("Masukkan NIM Mahasiswa yang ingin dihapus!");
                    System.out.println("--------------------------");
                    ketemu = 0;  //masih sama, sebagai penanda

                    //INPUT NIM YANG DICARI
                    try
                    {
                        cari = sc.nextInt();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Ups, the input is'nt integer!");
                    }

                    //SEARCHING NIM
                    for (i = 0; i <list.size(); i++)
                    {
                        //JIKA KETEMU, HAPUS
                        if(list.get(i).getNim() == cari) 
                        {
                            list.remove(i);
                            ketemu = 1;
                        }
                    }


                    //PENGECEKAN
                    if(ketemu == 0)
                    {
                        System.out.println("--------------------------");
                        System.out.println("      DATA TIDAK COCOK    ");
                        System.out.println("--------------------------");
                        System.out.println(" ");
                    }
                    else
                    {
                        System.out.println("--------------------------");
                        System.out.println("   DATA BERHASIL DIHAPUS  ");
                        System.out.println("--------------------------");
                        System.out.println(" ");
                    }
                break;

                //QUERY TAMPILKAN DATA
                case 4:
                    //JIKA LIST KOSONG
                    if (list.size() == 0)
                    {
                        System.out.println("--------------------------");
                        System.out.println("        DATA KOSONG!      ");
                        System.out.println("--------------------------");
                        System.out.println(" ");
                    }

                    //MENAMPILKAN DATA
                    for(i = 0; i < list.size(); i++)
                    {
                        System.out.println("");
                        System.out.println("--------------------------");
                        System.out.println("       DATA MAHASISWA     ");
                        System.out.println("--------------------------");
                        System.out.println("No : " + Integer.toString(i + 1));
                        System.out.println("Nama : " + list.get(i).getNama());
                        System.out.println("NIM : " + list.get(i).getNim());
                        System.out.println("Program Studi : " + list.get(i).getProdi());
                        System.out.println("Fakultas : " + list.get(i).getFakultas());
                        System.out.println("--------------------------");
                    }
                break;
            }
        }
        while(query != 5); //TERUS JALAN SELAMA QUERYNYA BUKAN 5
        
        //PESAN PENUTUP
        System.out.println("--------------------------");
        System.out.println("        TERIMA KASIH      ");
        System.out.println("--------------------------");

        sc.close();
    }
}