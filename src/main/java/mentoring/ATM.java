package mentoring;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("UrasBanka hosgeldiniz. Lutfen yapacaginiz islemi secin\n Bakiye ogrenme icin => 1\n Para yatirma icin => 2\n" +
                " Para cekme icin =>3\n Cikis icin => 4");
        byte x= input.nextByte();
        int bakiye=1000;

        if (x==1) {
            System.out.println("Bakiyeniz : 1000TL");
        } else if (x==2) {
            System.out.println("Yatirmak istediginiz miktari giriniz");
            int yatirilanMiktar= input.nextInt();
            bakiye=yatirilanMiktar+bakiye;
            System.out.println("Yeni bakiyeniz: "+ bakiye);
        } else if (x==3) {
            System.out.println("Cekmek istediginiz miktari giriniz");
            int cekilenMiktar = input.nextInt();
            if (bakiye >= cekilenMiktar) {
                bakiye = bakiye - cekilenMiktar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            } else {
                System.out.println("Yetersiz bakiye!");}
        } else if (x==4) {
            System.out.println("Uras bank iyi gunler diler...");
        } else {
            System.out.println("Gecerli bir islem seciniz");
        }

        /*switch (x){
            case 1:
                System.out.println("Bakiyeniz : 1000TL");
                break;
            case 2:
                System.out.println("Yatirmak istediginiz miktari giriniz");
                int yatirilanMiktar= input.nextInt();
                bakiye=yatirilanMiktar+bakiye;
                System.out.println("Yeni bakiyeniz: "+ bakiye);
                break;
            case 3:
                System.out.println("Cekmek istediginiz miktari giriniz");
                int cekilenMiktar= input.nextInt();
                bakiye=bakiye-cekilenMiktar;
                System.out.println("Yeni bakiyeniz: "+ bakiye);
                break;
            case 4:
                System.out.println("UrasBank iyi gunler diler...");
                break;
            default:
                System.out.println("Gecerli bir islem seciniz");}
*/



    }
}
