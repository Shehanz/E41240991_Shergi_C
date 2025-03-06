/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M5.Pewarisan;

public class Demo {
    public static void main(String[] args) {
        A superOB = new A();
        B subOB = new B();
        
        System.out.println("SuperClass");
        superOB.x = 10;
        superOB.y = 20;
        superOB.TampilkanNilaiXY();
        
        System.out.println("SubClass");
        subOB.x = 5;
        subOB.y = 4;
        subOB.TampilkanNilaiXY();
        
        subOB.z = 50;
        subOB.TampilkanJumlah();
    }
}
