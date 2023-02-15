<?php

//KELAS
class Mhs
{
    //ATRIBUT PRIVAT
    private $nama = '';
    private $nim = '';
    private $prodi = '';
    private $fakultas = '';
    private $pict = '';

    //KONSTRUKTOR
    public function __construct($nama = '', $nim = '', $prodi = '', $fakultas = '', $pict = '')
    {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
        $this->pict = $pict;
    }

    //SETTER GETTER NAMA
    public function setNama($nama)
    {
        $this->nama = $nama;
    }
    public function getNama()
    {
        return $this->nama;
    }

    //SETTER GETTER NIM
    public function setNim($nim){
        $this->nim = $nim;
    }
    public function getNim(){
        return $this->nim;
    }

    //SETTER GETTER PRODI
    public function setProdi($prodi){
        $this->prodi = $prodi;
    }
    public function getProdi(){
        return $this->prodi;
    }

    //SETTER GETTER FAKULTAS
    public function setFakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }
    public function getFakultas()
    {
        return $this->fakultas;
    }

    //SETTER GETTER PICT
    public function setPict($pict)
    {
        $this->pict = $pict;
    }
    public function getPict()
    {
        return $this->pict;
    }
}

?>