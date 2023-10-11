/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("For Bilangan Ganjil Yaa");
        System.out.print("Masukkan Bilangan = ");
        int n = s.nextInt();
        System.out.println("Deret Angka Ganjil Yaitu");
        //        int counter = 1;
        for (int i = 1; i <= n; i += 2){
            System.out.println(i +"");
        }
    }
    
}
