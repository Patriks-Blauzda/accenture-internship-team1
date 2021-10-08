package com.example.majaslapa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.nio.file.StandardOpenOption.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

@SpringBootApplication
public class    MajaslapaApplication {

    public static void main(String[] args) {
        update_properties();
        SpringApplication.run(MajaslapaApplication.class, args);

        System.out.println("Kad pirmo reizi programma palaista, atjaunojas datu avots, programmu jarestarte");
    }




    // Nosaka datubazes faila saglabasanas punktu (Majaslapa\db)
    public static void update_properties() {
        Path prop_path = Path.of(System.getProperty("user.dir")+"\\src\\main\\resources\\application.properties");

        String old_dest = read_file(prop_path);
        old_dest = old_dest.substring(22);
        if(old_dest.length() == 0) {
            old_dest = null;
        }

        String new_dest = "jdbc:h2:file:" + System.getProperty("user.dir") + "\\db\\demo";
        new_dest = new_dest.replace('\\', '/');

        update_file(prop_path, new_dest, old_dest);

    }


    // Sanem pedejo rindu no noteikta faila
    public static String read_file(Path file){
        String outputtext = null;

        try(InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {

            String line = null;
            while ((line = reader.readLine()) != null) {
                outputtext = line;
            }

        } catch (IOException x) {
            System.err.println(x);
        }

        return outputtext;
    }

    // Ievieto jauno rindu ieksa faila
    public static void update_file(Path file, String newtext, String oldtext){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file.toString()));
            StringBuilder inputBuffer = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            reader.close();
            String inputStr = inputBuffer.toString();

            if(oldtext == null){
                inputStr = inputStr.replace("spring.datasource.url=", "spring.datasource.url=" + newtext);
            } else {
                inputStr = inputStr.replace(oldtext, newtext);
            }

            FileOutputStream fileOut = new FileOutputStream(file.toString());
            fileOut.write(inputStr.getBytes());
            fileOut.close();

            System.out.println("Successfully updated database path");

        } catch(Exception x) {
            System.out.println(x);
        }
    }
}
