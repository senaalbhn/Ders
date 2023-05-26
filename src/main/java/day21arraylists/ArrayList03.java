package day21arraylists;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Kisa yoldan bir list nasil olusturulur
        //List.of() methodu degistirilemez bir list olusturmak icin kullanilir
        //Degisiklik yapmaya yonelik methodlari desteklemez

        List<Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials);
        /*initials.add('b');
        initials.remove(initials.indexOf('k'));
        initials.set(0,'u');*/

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun indexsini verir
        System.out.println(initials.indexOf('k'));

        //lastIndexOf(aranan karakter) methodu aranan karakterin son gorunumunun indexsini verir
        System.out.println(initials.lastIndexOf('k'));

    }
}
