public class CheckIt {
    public static String checkAge(int age){
        return (age>=18)?"Adult":"Minor";
    }
    public static void main(String[] args){
        System.out.println(checkAge(20));
    }
}
