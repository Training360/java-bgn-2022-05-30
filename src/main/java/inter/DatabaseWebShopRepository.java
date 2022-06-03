package inter;

import java.util.List;

public class DatabaseWebShopRepository implements WebShopRepository {

    @Override
    public void saveBasket(List<String> products) {
        // insert into products
        System.out.println("database" + products);
    }
}
