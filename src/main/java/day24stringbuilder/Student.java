package day24stringbuilder;

public class Student {

        /*
        Access Modifier
        1) public
        2) protected
        3) default (Access modifier i default yapmak icin basina access modifier yazmamaliyiz)
        4) privite

        Note: Access modifier lari genisten dara dogru siralayiniz
        public> protected > default > private

        Note: public ==> olanlar her class dan kullanilabilir
        protected ==> olanlar baska package lardan kullanilamaz
                      ama baska package da child class icinden kullanilabilir
        default ==> olanlar baka package den kullanilamazlar
        private ==> olanlar sadece olusturulduklari class icinde kullanilabilirler

        Note: protected ile defaultun farkini soyleyiniz
              protected olanlar baska package tan kullanilamaz
              ancak baska package de chil class icinden kullanilabilir
              default olanlar baska package den kullanilamazlar
         */

        public String stdName= "Ali Can";

        protected String stdAdres= "Istanbul";

        String stdEmail= "alican@gmail.com";

        private String ssnId= "123456789";














}
