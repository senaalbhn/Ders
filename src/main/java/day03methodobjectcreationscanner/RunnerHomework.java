package day03methodobjectcreationscanner;

public class RunnerHomework {
    public static void main(String[] args) {

        HomeworkTeacher teacher = new HomeworkTeacher();

        System.out.println("teacher.name = " + teacher.name);
        System.out.println("teacher.age = " + teacher.age);
        System.out.println("teacher.branch = " + teacher.branch);
        System.out.println("teacher.experience = " + teacher.experience);

        teacher.teach();
        teacher.multiTask();


    }
}
