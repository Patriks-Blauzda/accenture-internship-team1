<?php>
    $Ievaditie_dati = $_POST['Ievaditie_dati'];


    //Database connection
    $conn = new mysqli('localhost','','','demo');
    if($conn->connection_error){
    die('Savienojums nobruka :'.$conn->connection_error);
    }else{
    $stmt = $conn->prepare('INSERT INTO Dati("Ievaditie_dati") VALUES("Parbaude")');
    $stmt->bind_param("s",$Ievaditie_dati);
    $stmt->execute();
    echo "Registracija sekmiga";
    $stmt->close();
    $conn->close();
    }
?>