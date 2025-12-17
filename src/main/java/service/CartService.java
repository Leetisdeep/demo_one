package service;

import model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // ТОЛЬКО ЭТА АННОТАЦИЯ. @Scope("session") ДОЛЖНА ОТСУТСТВОВАТЬ.
public class CartService {
    private final ShoppingCart cart;

    @Autowired
    public CartService(ShoppingCart cart) {
        this.cart = cart;
    }

    public void addItems(List<Integer> itemIds) {
        this.cart.getItemIds().addAll(itemIds);
    }

    public List<Integer> getItems() {
        return this.cart.getItemIds();
    }
}