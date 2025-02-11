/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalku;

/**
 *
 * @author zeemon
 */
import java.util.Scanner;

public class Kalku {
public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di kalkulator sederhana!");
        System.out.println("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.println("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Tidak dapat membagi angka dengan 0.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}


  
    

