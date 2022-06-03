package inheritance;

public class Contract {

    // Másik megoldás: protected, nem annyira preferált
    private String title;

    public String getTitle() {
        return title;
    }
    public Contract(String title) {
        this.title = title;
    }


    public String getInfo() {
        return title;
    }

    public Contract copy() {
        var contract = new Contract(title);
        return contract;
    }
}
