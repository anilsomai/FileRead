package com.fileread;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\anils\\git\\Fileread\\src\\com\\fileread\\test.txt");
        int i;
        while ((i = fr.read()) != -1) {
            char ch = (char)i;
            System.out.print(ch);
        }

        System.out.println();

        FileReader fr2 = new FileReader("C:\\Users\\anils\\git\\Fileread\\src\\com\\fileread\\test.txt");
        BufferedReader objReader = new BufferedReader(fr2);
        String str;
        while ((str = objReader.readLine()) != null) {
            System.out.println(str);
        }

    }
}
