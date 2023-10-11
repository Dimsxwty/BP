/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.nomor.pkg2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SoalNomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Program Segitiga Angka Baris");
        System.out.print("Masukkan Angka = ");
        int angka = s.nextInt();
        for (int i = 0; i < angka; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("Barris" + i);
        }
    }
    
}
