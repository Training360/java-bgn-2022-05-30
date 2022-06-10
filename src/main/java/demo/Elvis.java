package demo;

public class Elvis implements CanSing, Singer{

    @Override
    public String sing() {
        System.out.println("Elvis.sing");
        return null;
    }
}
