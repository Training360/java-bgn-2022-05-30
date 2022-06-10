package demo;

public class Mobile extends Device {

    @Override
    public String getName() {
        return "Mobile";
    }

    public static void main(String[] args) {
        Device x = new Mobile();
        System.out.println(x.getName());
    }
}
