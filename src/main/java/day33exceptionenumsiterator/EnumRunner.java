package day33exceptionenumsiterator;

public class EnumRunner {
    public static void main(String[] args) {
        Cities ankara= Cities.ANKARA;
        System.out.println(ankara);
        String adanaCityName= Cities.ADANA.getCityName();
        System.out.println(adanaCityName);
        int balikesirPostalcode= Cities.BALIKESİR.getPlateCode();
        System.out.println(balikesirPostalcode);

    }
}
