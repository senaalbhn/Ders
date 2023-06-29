package day33exceptionenumsiterator;

public class ExceptionRunner  {
    /*
    Garbage Collector memory i temiz tutmak icin surekli memoty i tarar ve silinmesi gerekenleri siler
    Garbage Collector silmeden once silecegi datalari finalize eder ve sonra siler
     */
    public static void main(String[] args) throws InvalidStudentGradeException {

        getStudentsGrade(89);
       // getStudentsGrade(-45);//InvalidStudentGradeException

        getTheNumberOfStudents(50);
        getTheNumberOfStudents(-50);
    }
    public static void getStudentsGrade(int grade) throws InvalidStudentGradeException {
        if (grade<0 || grade>100){
            throw new InvalidStudentGradeException("Student's grade cannot be less than zero or greater than 100");
        }else{
            System.out.println(grade);
        }
    }

    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            throw new InvalidNumberException("Student numbers cannot be negative");
        }else {
            System.out.println(numOfStudents);
        }
    }




}
