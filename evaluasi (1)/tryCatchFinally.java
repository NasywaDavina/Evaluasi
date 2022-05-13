/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluasi;

/**
 *
 * @author Nasywa Davina
 */
public class tryCatchFinally {
    public static void main(String[] args) {
       int bagi = 1;
       int sesuatu = 0 ;
 
       try {
           // mulai pembagian
           long bilangan1 = 50 ;
           System.out.println("Step 1: " + bilangan1/bagi);
 
           long bilangan2 = 700;
           bagi = bagi - 1 + sesuatu ;
           System.out.println("Step 2: " + bilangan2/bagi);
 
           long bilangan3 = 40;
           bagi = bagi - 1 + sesuatu ;
           System.out.println("Step 3: " + bilangan3/bagi);
 
       }
       catch(Exception e)
       {
           String error_message = e.getMessage();
           System.out.println("Error!! " + error_message);
 
        }
       finally {
           System.out.println("Bagi bilangan selesai");
       }
 
    }
}
