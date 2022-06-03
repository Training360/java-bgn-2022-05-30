package init;

public class Init {

    int i = 5;

    {
        System.out.println("init");
    }

    static {
        System.out.println("init");
    }

    public Init() {
        System.out.println("konstruktor");
    }

    public static void main(String[] args) {
        new Init();
    }


}
