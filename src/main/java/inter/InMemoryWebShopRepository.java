package inter;

import java.util.List;

public class InMemoryWebShopRepository implements WebShopRepository{

    @Override
    public void saveBasket(List<String> products) {
        System.out.println("inmemory " + products);
    }
}
