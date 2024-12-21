package Onlineshopping.Cart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CartItem {
    String categoryId;
    String productId;
    String productPrice;
}
