/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgdo.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("do-while bilangan ganjil");
        System.out.print("Masukkan Bilangan = ");
        int n = s.nextInt();
        System.out.println("deret dari bilangan ganjil adalah = ");
        int counter = 1;
        do {
            System.out.println(counter +" ");
            counter += 2;
        } while (n >= counter);
        
    }
    
}
