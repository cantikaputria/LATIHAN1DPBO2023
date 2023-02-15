
<?php
    //IMPORT FILE
    require ('Mhs.php');

    //BUAT ARRAY
    $arrayMhs = array();

    //CREATE DATA HARD CODE
    $mhs1 = new mhs('Cantika Putri Arbiliansyah', '2103727', 'Ilmu Komputer', 'FPMIPA', 'images\images1.png');
    array_push($arrayMhs, $mhs1);

    $mhs2 = new mhs('Aryo Bagas Pamungkas', '2003727', 'Civil Engineering', 'FPIPS', 'images\images2.png');
    array_push($arrayMhs, $mhs2);

    $mhs3 = new mhs('Indah Resti Fauzi', '2108893', 'Computer Science', 'FPMIPA', 'images\images3.png');
    array_push($arrayMhs, $mhs3);
    
    //TAMPILAN
    echo "<h2><b><center>Data Mahasiswa</center></b></h2>";
    echo '<hr>';
    echo '<hr>';

    //OUTPUT
    for ($i = 0; $i < 3; $i++) 
    {
        echo "<p>" . "Nama : " . $arrayMhs[$i]->getNama() . "</p>";
        echo "<p>" . "NIM : " . $arrayMhs[$i]->getNim() . "</p>";
        echo "<p>" . "Program Studi : " . $arrayMhs[$i]->getProdi() . "</p>";
        echo "<p>" . "Fakultas : " . $arrayMhs[$i]->getFakultas() . "</p>";
        echo "<img src='" . $arrayMhs[$i]->getPict(). "'style='width: 150px'>";
        echo '<hr>';
    }
?>