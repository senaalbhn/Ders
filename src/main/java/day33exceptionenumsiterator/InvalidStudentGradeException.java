package day33exceptionenumsiterator;

public class InvalidStudentGradeException extends Exception {

    public InvalidStudentGradeException (String message){
        super(message);
    }

    /*
    1. Custom Exception Class olusturmak icin Exception Class a extend etmeliyiz
    Exception Class a extend ederek olusturdugumuz Custom  Exception "Compile Time Exception" olur
    Eger Runtime Exception uretmek istersek RuntimeException Class a extend etmeliyiz
    2. Custom Exception Class olustururken constructor olusturmaliyiz
        Bu constructor parent taki constructor u cagirmalidir ve mesaj verecek veya vermeyecek sekilde olusturulabilir
    3. Custom Exception Class olusturdugumuzda ismin sonunda Exception kelimesini kullanmaliyiz
     */





}
