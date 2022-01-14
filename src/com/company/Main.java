package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int bajt = 0;

        try (FileInputStream fis = new FileInputStream("C:\\new\\plik.txt")) {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.println((char) bajt);
            } while (bajt != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error by attempt to read the file");
            e.printStackTrace();
        }

        try (FileWriter newfis = new FileWriter("C:\\new\\newplik1.txt")) {
                int nw = bajt;
                if ((char)bajt == ' ') bajt = '-';
                while (nw != 1) {
                    newfis.write(nw);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Error by attempt to read the file");
                e.printStackTrace();
            }
        }
    }
