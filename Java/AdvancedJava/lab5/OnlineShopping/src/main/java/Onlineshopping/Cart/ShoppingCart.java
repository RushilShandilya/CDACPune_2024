package Onlineshopping.Cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Cart {
    List<CartItem> list = new ArrayList<>();
    @Override
    public void addItem(CartItem item) {
        list.add(item);
    }

    @Override
    public void removeItem(CartItem item) {
        list.remove(item);
    }

    public List<CartItem> returnItem(){
        return list;
    }
}
