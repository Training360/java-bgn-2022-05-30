package reflectiondemo;

import lombok.Data;

@Data
public class Mobile extends Device{

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
