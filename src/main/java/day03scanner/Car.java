package day03scanner;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Car {

    // Class ==> Variable (Pasif Ozellikler) ==> Object
    //           Method (Aktif Ozellikler)

    //Variable'lar olusturalim
    public String model= "Corolla"; //pasif ozellikler Variable


    public int fiyat = 20000;

    //Method'lar olusturalim
    //Note: "Return type" "void" oldugunda method icinde "return" kelimesi kullanilmaz.
    public void hareket(){
        System.out.println("Corolla hizli hareket eder...");
    }
    //yeni bir data uretmediginden data type "void" olur

    public void dur(){
        System.out.println("Corolla guvenli bir sekilde durur...");
    }

}//Class bodysi
