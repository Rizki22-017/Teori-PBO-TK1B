/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

import javax.swing.JOptionPane;

/**
 *
 * @author rizky
 */
public class Latihan62 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Masukan angka :");
        int angka = Integer.parseInt(input1);
        
        String kata  = " ";
         
        if(angka >= 1 && angka <= 10){
            switch (angka) {
               case 1: kata = "satu";
                   break;
               case 2: kata = "dua";
                   break;
               case 3: kata = "tiga";
                  break;
               case 4: kata = "empat";
                  break;
               case 5: kata = "lima";
                   break;
               case 6: kata = "enam";
                   break;
               case 7: kata = "tujuh";
                   break;
               case 8: kata = "delapan";
                   break;
               case 9: kata = "sembilan";
                   break;
               case 10: kata = "sepuluh";
                   break;
                 }
            
              JOptionPane.showMessageDialog(null, "angka = "+angka+ " dibaca "+kata+"\n");
                    
            }else{
                kata = "Invalid Number";
              JOptionPane.showMessageDialog(null, "Invalid Number");
             }
        
    }
}
