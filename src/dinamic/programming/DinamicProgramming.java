/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamic.programming;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DinamicProgramming {

    private static void judul(String identitas) {
        System.out.println("Identitas : "+identitas);
        System.out.println("\nHitung Fibonacci");
        System.out.println("1,1,2,3,5,8,13,21, ... dst.");
    }
    public static void main(String[] args) {
        String identitas = "Nurafiif Almas Azhari / X RPL 5 / 33";
        judul(identitas);
        int n = input();
       
    }
     private static int input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bilangan ke- :");
       int n = input.nextInt();
       return n;
    }
    
    }
