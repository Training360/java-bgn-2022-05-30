package enums;

public enum Color {

    BLACK("\u001B[30m"), GREEN("\u001B[32m"), RED("\u001B[31m"), RESET("\u001B[0m");

    private String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
