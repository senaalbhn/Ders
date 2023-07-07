package day36lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lambda02 {
    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text i console yazdiran codu yazdiriniz

        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //Example 2: Verilen text file icindeki text i buyuk harfelere ceviren code yazin

        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);








    }
}
