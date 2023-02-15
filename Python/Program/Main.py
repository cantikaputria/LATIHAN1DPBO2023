#Import File Class
from Mahasiswa import Mahasiswa

## DEKLARASI
dataUpi = []
cari = ""

## FUNGSI INSERT DATA
def insert():
    print(" ")
    nama = str(input(" > Nama : "))
    nim = str(input(" > NIM : "))
    prodi = str(input(" > Program Studi : "))
    fakultas = str(input(" > Fakultas : "))
    
    dataUpi.append(Mahasiswa(nama, nim, prodi, fakultas))
    
    print("Input data berhasil!")

#FUNGSI UPDATE DATA
def update():
    print("Masukkan NIM yang akann diupdate")
    cari = str(input())
    ketemu = 0

    for Mahasiswa in dataUpi:
        if Mahasiswa.get_nim() == cari:
            upnama = str(input(" > Nama : "))
            upnim = str(input(" > NIM : "))
            upprodi = str(input(" > Program Studi :"))
            upfakultas = str(input(" > Fakultas :"))

            Mahasiswa.set_nama(upnama)
            Mahasiswa.set_nim(upnim)
            Mahasiswa.set_prodi(upprodi)
            Mahasiswa.set_fakultas(upfakultas)

            ketemu = 1

    if ketemu == 0:
        print("--------------------------")
        print("Data tidak ditemukan")
        print("--------------------------")
    else:
        print("--------------------------")
        print("Update data berhasil")
        print("--------------------------")

#FUNGSI HAPUS DATA
def delete():
    print("Masukkan NIM yang akann dihapus")
    print("--------------------------")
    cari = str(input())
    ketemu = 0
    for Mahasiswa in dataUpi:
        if Mahasiswa.get_nim() == cari:
            dataUpi.remove(Mahasiswa)
            ketemu = 1
    if ketemu == 0:
        print("--------------------------")
        print("Data tidak ditemukan")
        print("--------------------------")
    else:
        print("--------------------------")
        print("Hapus data berhasil!")
        print("--------------------------")

#FUNGSI TAMPILKAN OUTPUT
def display():
    i = 0
    for Mahasiswa in dataUpi:
        print("--------------------------")
        print("No : ", str(i + 1) + ".") 
        print("Nama : ", Mahasiswa.get_nama())
        print("NIM : ", Mahasiswa.get_nim())
        print("Prodi : ", Mahasiswa.get_prodi())
        print("Fakultas : ", Mahasiswa.get_fakultas())
        print("--------------------------")
        i += 1


#OPENING
print("--------------------------")
print("      SELAMAT DATANG!     ")
print("--------------------------")
print(">>>>>>>>>let's go<<<<<<<<<")

query = 0

#JALAN SELAMA BUKAN QUERY EXIT
while query != 5:
    print("--------------------------")
    print("          MENU            ")
    print("--------------------------")
    print("[1] Insert Data")
    print("[2] Update Data")
    print("[3] Delete Data")
    print("[4] Display Data")
    print("[5] Exit")
    print(" ")

    #INPUT QUERY
    print("--------------------------")
    print("Masukkan Nomor Query!")
    query = int(input())

    #CEK QUERY
    if query == 1:
        insert()
    elif query == 2:
        update()
    elif query == 3:
        delete()
    elif query == 4:
        display()

#EXIT
print("--------------------------")
print("THANK YOU")
print("--------------------------")