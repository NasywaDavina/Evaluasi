/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluasi;

import java.util.Scanner;

/**
 *
 * @author Nasywa Davina
 */
public class keywordThrow {
      public static void main(String[] args){
        //Membuat Instance Scanner Untuk Input Data
        Scanner input = new Scanner(System.in);
        int bebek;
        System.out.println("Nasywa Tolong Bawakan 2 telur");
        try{
            System.out.print("Jumlah telur Yang Ingin Dibawa: ");
            bebek = input.nextInt(); //Mendapatkan Input Dari User
            if(bebek > 2){
                //Jika Bebek Yang Kita Bawa lebih dari 2, maka akan terjad error
                throw new Exception("Terjadi Kesalahan  Nih!");
            }else{
                System.out.println("eror");
            }
        }catch(Exception e){
            //Menampilkan Pesan Kesalahan
            e.printStackTrace();
}
      }
}
