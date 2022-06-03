package meetingroom;

// value object
// immutable
public class Dimension {

    private int length;

    private int width;

    public Dimension(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Dimension elongate(int difference) {
        return new Dimension(length + difference, width);
    }
}
