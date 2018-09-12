/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamic.programming;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DinamicProgramming {

    private static void judul(String identitas) {
        System.out.println("Identitas : "+identitas);
        System.out.println("\nHitung Fibonacci");
        System.out.println("1,1,2,3,5,8,13,21, ... dst.\n");
    }
    public static void main(String[] args) {
        String identitas = "Nurafiif Almas Azhari / X RPL 5 / 33";
        judul(identitas);
        int n = input();
       BigInteger hasil = fibo(n);
       Hasil(n, hasil);
    }
     private static int input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan ke- :");
       int n = input.nextInt();
       return n;
    }
     private static BigInteger fibo(int n){
         BigInteger[] hasil = new BigInteger[n];
         
         hasil [0] = BigInteger.ONE;
         hasil [1] = BigInteger.ONE;
         
         for (int i =2; i < n ; i++){
             hasil[i] = hasil [i - 1].add(hasil[i-2]);
         }
             return hasil[n-1];
    }
      private static void Hasil (int n, BigInteger hasil){
          System.out.println("Bilangan Fibonacci ke - "+n+" : "+hasil);
      }
}