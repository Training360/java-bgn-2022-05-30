package demo;

public class Statements {

    public static void main(String[] args) {
        int i = 2;
        int x = 1;
        String s = "alma";
        switch (i) {
            case 1:
                x = 1;
            case 2:
                x = 2;
            case 3:
                x = 3;
        }
        System.out.println(x);

    }
}
