/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author rizky
 */
public class Latihan72 {
    //Gunakanlah BufferedReader dan JoptionPane, tanyakan kepada user untuk 10 nomor.
    //Kemudian gunakan array untuk menyimpan 10 nomor tersebut. Tampilkan kepada user, input terbesar yang telah diberikn user.
    public static void main(String[] args) throws IOException {
        int[] angka = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < angka.length; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1));
            angka[i] = Integer.parseInt(input);
        }

        int max = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];//max = (angka[i] > max)? angka[i]:max;
            }
        }
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang dimasukkan adalah: " + max);
    }
}
