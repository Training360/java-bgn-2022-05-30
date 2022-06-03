package inter;

public class WebShopApplication {

    public static void main(String[] args) {
//        WebShopRepository repo = new DatabaseWebShopRepository();
        WebShopRepository repo = new InMemoryWebShopRepository();

        WebShopService service = new WebShopService(repo);
        service.putToBasket(13);
    }
}
