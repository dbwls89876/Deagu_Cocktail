package dgb.cocktail.daegu_friends.cocktail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class CocktailController {
    @Autowired
    CocktailService cocktailService;

    @GetMapping("/cocktail")
    public Cocktail fineCocktail(Cocktail cocktail){
        return cocktailService.findCocktail(cocktail);
    }
}
