/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarrayb;

import java.util.Scanner;

/**
 *
 * @author Dian
 */
public class TugasarrayB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat object "input" Scanner
        Scanner input = new Scanner (System.in);
        int jumlahderet = 0;
        
        System.out.print("Masukkan jumlah deret : ");
        // nextInt digunakan untuk membaca baris angka yang diinputkan oleh user
        jumlahderet = input.nextInt();
        
        int[] deretarray = new int [jumlahderet];
        for (int i=0; i<jumlahderet; i++){
            //math.random()*10 digunakan untuk menampilkan angka secara acak batas hingga angka 10
            deretarray[i] = (int) (Math.random()*9);
        }
        
        for(int j=0; j<jumlahderet; j++){
         System.out.print(deretarray[j]+"\t");
    }
}
    
}


