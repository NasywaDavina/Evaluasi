/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluasi;

/**
 *
 * @author Nasywa Davina
 */
class AgeInvalid extends Exception{
    AgeInvalid(String s){
        super(s);
    }
}
public class testThrow {
    static void validate(int umur)throws AgeInvalid{
        if(umur<30)
            throw new AgeInvalid ("not valid");
            else
            System.out.println("welcome");
    }
    public static void main (String args[]){
        try{
            validate(15);
        }
        catch(Exception i){
            System.out.println("Exception aktif" + i);
        }
        System.out.println("out ");
}
}
