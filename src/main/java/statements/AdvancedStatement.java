package statements;

public class AdvancedStatement {

    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            if (i % 2 == 0) {
                break;
            }
            i--;
        }

        i = 0;
        do {
            System.out.println(i);
            i ++;
        } while (i < 10);
    }
}
