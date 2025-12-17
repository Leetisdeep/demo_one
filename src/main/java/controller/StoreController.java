package controller; 

import service.CartService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/order") 
public class StoreController {

    private final CartService cartService;

    public StoreController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String addItems(@RequestParam("id") List<Integer> itemIds) {
        cartService.addItems(itemIds);
        return "Items added: " + itemIds;
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}