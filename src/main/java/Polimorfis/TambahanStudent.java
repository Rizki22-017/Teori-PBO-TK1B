/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfis;

/**
 *
 * @author rizky
 */
public class TambahanStudent {
    public static void main(String[] args) {
        // Membuat objek ComputerScienceStudent
        Contoh student = new Contoh("Rizki", "Padang", 20, "Java", 2);

        // Mengatur nilai-nilai lainnya
        student.setMathGrade(80);
        student.setEnglishGrade(80);
        student.setScienceGrade(89);

        // Menampilkan informasi siswa
        student.print("Additional Information");

        // Menampilkan rata-rata nilai
        System.out.println("Average Grade:      " + student.getAverage());

        // Menampilkan jumlah total siswa
        System.out.println("Student Count:      " + StudentRecord.getStudentCount());
}
}
