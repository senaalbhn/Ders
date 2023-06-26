package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
    /*
    1. Run buttonuna bastiktan sonra colnsole da alinan Exceptionlara "runtime Exception" denir
     AritmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException,
     StringIndexOutOfBoundsException... RunTimeException lara ornektir
     RunTime Exceptionlara Unhecked Exception'da denir
    2. Code yazarken kirmizi alt cizgi seklinde alinan Exceptionlar da vardir
     Bunlara da "Compile Time Exception" denir
     FileNotFountException, IOException, compile time exception lara ornektir
     Compile Time Exception lara Checked Exception da denir

    throw ile throws keyword leri arasindaki fark nedir?
    1. throw mrthod body si icinde , throws ise method parantezinden hemen sonra kullanilir
    2. throw method body si icinde istenilen yerde istenilen kadar kullanilir,
       throws ise method parantezinden hemen sonra sadece bir keze kullanilir
    3. throw dan sonra new keyword ve constructor kullanilarak obje olusturulur
       throws dan sonra sadece Exception class isimleri yazilir
    4. throw belli sartlar icin Exception firlatmada kullanilir
       throws ise bir methodun belli bir Exception u firlatabilecegini belirtmek icin kullanilir


     */
    public static void main(String[] args) throws IOException {


        FileInputStream fis= new FileInputStream("src/main/java/day32exceptions/File.txt");

        int k=0;
        while ((k=fis.read())!=-1){
            System.out.print((char)k);
        }







    }



}
