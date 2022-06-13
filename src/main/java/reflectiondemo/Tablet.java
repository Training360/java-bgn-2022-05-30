package reflectiondemo;

import lombok.Data;

@Data
public class Tablet extends Device {

    @Override
    public String toString() {
        return "Tablet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
