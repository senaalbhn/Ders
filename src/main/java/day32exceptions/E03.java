package day32exceptions;

public class E03 {
    public static void main(String[] args) {
        try {
            printAge(-63);

        }catch (IllegalArgumentException e){
            printAge(-63565643);
        }


    }

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }
    }
}
