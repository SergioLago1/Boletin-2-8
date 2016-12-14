/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg8;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin28 {

    
    public static void main(String[] args) {
     float grados, kelvin, farenheit;
     Scanner obx=new Scanner(System.in);
     System.out.println("Introducir grados :");
     grados=obx.nextFloat();
     kelvin=(grados+273);
     farenheit=32+1.8f*grados;
     System.out.println("Grados kelvin :"+kelvin);
     System.out.println("Grados Farenheit :"+farenheit);
     
    }
    
}
