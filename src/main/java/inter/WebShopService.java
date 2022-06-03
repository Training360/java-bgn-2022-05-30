package inter;

import java.util.List;

public class WebShopService {

    private WebShopRepository webShopRepository;

    public WebShopService(WebShopRepository webShopRepository) {
        this.webShopRepository = webShopRepository;
    }

    public void putToBasket(long id) {
        // Bonyolult üzleti logika

        webShopRepository.saveBasket(List.of("Alma", "Korte"));
    }
}
