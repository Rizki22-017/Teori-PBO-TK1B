/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author rizky
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan71 {
    ///Buatlah sebuah String array yang akan menginisialisasi 7 hari dalam seminggu.
    ///Gunakan while-loop, kemudia print semua nilai dari array (Gunakan juga untuk do-while dan for-loop)Using a while loop
    
   public static void main(String[] args) {
        
            String days[] = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            try {
                System.out.println("[1] for");
                System.out.println("[2] do while");
                System.out.println("[3] while loop");
                System.out.print("masukan pilihan : ");
               int pilihan = Integer.parseInt(reader.readLine());
                 
                 int i = 0;
                switch (pilihan) {
                    case 1:
                            for( i = 0 ;i <days.length;i++){
                                System.out.println("Hari "+ days[i]);
                            }
                        break;
                    case 2:
                           while (i<days.length) {                            
                               System.out.println("Hari "+days[i]);
                               i++;
                           }
                          break;
                    case 3 :
                         do{
                              System.out.println("Hari "+days[i]);
                              i++;
                         }while(i<days.length);
                    default : System.out.println("Angka tidak ada");    
                }
                
            } 
            catch (IOException e) {
                System.out.println("Program anda salah ");
            }
            
    }   
}
