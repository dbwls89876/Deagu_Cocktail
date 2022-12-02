package dgb.cocktail.daegu_friends.cocktail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class CocktailController {
    @Autowired
    CocktailService cocktailService;

    @GetMapping("/cocktail")
    public List<Cocktail> findCocktailList(Cocktail cocktail){
        return cocktailService.findCocktail(cocktail);
    }
}
