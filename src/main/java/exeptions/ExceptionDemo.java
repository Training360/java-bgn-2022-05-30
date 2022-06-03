package exeptions;

public class ExceptionDemo {

    private String name;

    public static void main(String[] args) {
        String input = "xyz";
//        int number = Integer.parseInt(input);
//        System.out.println(number); // 1

        new ExceptionDemo().getName().toUpperCase().substring(1, 10);

        String s1 = new ExceptionDemo().getName();
        String s2 = s1.toUpperCase();

    }

    public String getName() {
        return name;
    }
}
