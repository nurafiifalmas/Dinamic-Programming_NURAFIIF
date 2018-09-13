/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamic.programming;

/**
 *
 * @author user
 */
public class PecahanUang {
    
    public static void main(String[] args) {
        String nama = "Nurafiif Almas Azhari / X RPL 5 / 33";
        String Pecahan = ("\n > Rp5000\n > Rp2000\n > Rp1000\n > Rp500\n > Rp100");
        int U = 421300;
        int pecahan [] ={5000, 2000, 1000, 500, 100};
        int keping;
        System.out.println("================================================");
        System.out.println("Identitas : "+nama);
        System.out.println("================================================");
        System.out.println("Jenis pecahan uang : "+Pecahan+"\n");
        System.out.println("Uang yang dibawa sebesar Rp"+U);
        System.out.println("Jumlah kombinasi pecahan yang perlu dibawa yaitu :");
        for(int i = 0; i < pecahan.length; i++)
            if(U >=pecahan[i]){
            keping = U / pecahan[i];
            U = U%pecahan[i];
            System.out.println(" * Pecahan Rp"+pecahan [i]+" sebanyak "+keping+" keping");
    }
}
}