package dgb.cocktail.daegu_friends.store;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
public class StoreController {
    @Autowired
    StoreService storeService;

    @GetMapping("/store")
    public Store findStore(Store store){
        return storeService.findStore(store);
    }

}
