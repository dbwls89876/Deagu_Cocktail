package dgb.cocktail.daegu_friends.cocktail;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CocktailService {
    private final CocktailRepository cocktailRepository;

    public Cocktail findCocktail(Cocktail cocktail){
        return cocktailRepository.findByTitle(cocktail.getTitle());
    }

}
