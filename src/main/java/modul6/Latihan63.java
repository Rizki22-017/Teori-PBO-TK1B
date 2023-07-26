/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author rizky
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan63 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("[1] do while");
        System.out.println("[2] for");
        System.out.println("[3] while");
        System.out.println("Masukan pilihan looping : ");

        try {
            int pilihan = Integer.parseInt(reader.readLine());

            int i = 0;

            switch (pilihan) {
                case 1:
                    do {
                        System.out.println("Muhammad Ghaza Fadillah");
                        i++;
                    } while (i < 100);
                    break;
                case 2:
                    for (int j = 0; j < 100; j++) {
                        System.out.println("Muhammad Ghaza Fadillah");
                    }
                    break;
                case 3:
                    while (i < 100) {
                        System.out.println("Muhammad Ghaza Fadillah");
                        i++;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Input yang dimasukkan tidak valid.");
            e.printStackTrace();
        }

    }
}
