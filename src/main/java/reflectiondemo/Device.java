package reflectiondemo;

import lombok.Data;

@Data
public abstract class Device {

    protected String name;

    protected String type;

    protected String price;
}
