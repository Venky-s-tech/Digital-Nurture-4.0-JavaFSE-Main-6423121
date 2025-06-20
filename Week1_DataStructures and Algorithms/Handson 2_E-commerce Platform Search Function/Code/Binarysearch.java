package EcommerceSearch;

import java.util.*;
public class Binarysearch {

    public static Product binarySearch(Product[] products, int Id) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == Id) {
                return products[mid];
            } else if (products[mid].productId < Id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] productList = {
            new Product(100,"CricketBat","Sports"),
            new Product(200,"Jersey", "Clothing"),
            new Product(300,"Laptop", "Electronics"),
            new Product(400,"Shoes", "Footwear"),
        };

        
        Arrays.sort(productList, Comparator.comparingInt(p -> p.productId));
        int searchId = 200;
        Product result = binarySearch(productList, searchId);

        System.out.println("Binary Search Result:"+result);
   
    }
}
