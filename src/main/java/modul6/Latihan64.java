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

public class Latihan64 {
     public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
       try{
            System.out.println("[1] do while");
            System.out.println("[2] for");
            System.out.println("[3] while");
            System.out.print("Masukan pilihan looping : ");
            
            int pilihan  = Integer.parseInt(reader.readLine());
            
               System.out.print("Masukan angka : ");
            int angka = Integer.parseInt(reader.readLine());
           
            System.out.print("Masukan Pangkat : ");
            int pangkat = Integer.parseInt(reader.readLine());
           
            int hasil = angka; 
            int i = 0;
            
            switch (pilihan) {
                case 1:
                     if(pangkat == 0){
                         hasil = 1;
                       }else{
                    do {
                         hasil = hasil * angka;
                         i++;
                        } while (i < pangkat-1);
                     }
                     System.out.println(angka+" pangkat "+ pangkat+" = " +hasil);
                    break;
                case 2:
                        
                       if(pangkat == 0){
                         hasil = 1;
                       }else{
                            
                          for(i=0;i<pangkat-1;i++){
                           hasil = hasil * angka;

                          }
                      }

                     System.out.println(angka+" pangkat "+ pangkat+" = " +hasil);
                    break;
                case 3:
                    if(pangkat == 0){
                         hasil = 1;
                       }else{
                           while(i <pangkat-1){
                           hasil = hasil * angka;
                            i++;
                        };
                     }
                     System.out.println(angka+" pangkat "+ pangkat+" = " +hasil);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
       
       }catch(IOException e){
           System.out.println("Terjadi kesalahan");
       }
    }
}
