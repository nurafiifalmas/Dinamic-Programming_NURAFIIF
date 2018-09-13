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
public class MobilAngkut {
    public static void main(String[] args) {
        String nama = "Nurafiif Almas Azhari / X RPL 5 / 33";
        String barang = ("* Barang E(10.000/7kg)\n* Barang B(7.000/5kg)\n* Barang A(5.000/4kg)\n* Barang D(3.000/3kg)\n* Barang C(2.000/2kg) ");
        int JumlahBerat = 431;
        int  berat [] ={7,5,4,3,2};
        String jenis [] ={"E", "B", "A", "D", "C"};
        int  bayar [] ={10000,7000,5000,3000,2000};
        int keping, a, bayaran;
        System.out.println("================================================");
        System.out.println("Identitas : "+nama);
        System.out.println("================================================");
        System.out.println("Tarif jasa angkut barang :\n"+barang+"\n");
        System.out.println("Jumlah berat yang dibawa : "+JumlahBerat+" Kg"); 
        System.out.println("Jenis barang dan jumlah tiap barang yang harus dibawa untuk mendapatkan bayaran yang besar yaitu :");
        
        for(int i = 0; i < berat.length; i++){
            if(JumlahBerat >=berat[i]){
            keping = JumlahBerat / berat[i];
            JumlahBerat = JumlahBerat%berat[i];  
            a = keping * berat [i];
            bayaran = bayar[i] * keping;
            
            System.out.println(" > Jenis barang "+jenis[i]+" sebanyak "+keping+" barang, Total berat "+a+" Kg, Bayaran Rp"+bayaran);

            }
}
}
}
