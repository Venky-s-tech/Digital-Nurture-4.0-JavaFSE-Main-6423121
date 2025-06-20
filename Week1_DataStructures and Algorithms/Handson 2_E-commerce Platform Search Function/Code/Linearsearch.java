package EcommerceSearch;

public class Linearsearch {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] productList = { new Product(100,"CricketBat", "Sports"),
                                  new Product(200,"Jersey", "Clothing"),
                                  new Product(300,"Laptop", "Electronics"),
                                  new Product(400,"Shoes", "Footwear"),
                                          };

        int searchId = 200;
        Product result = linearSearch(productList, searchId);

        System.out.println("Linear search result:"+result);
       
    }
}
