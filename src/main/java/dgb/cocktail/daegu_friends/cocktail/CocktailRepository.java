package dgb.cocktail.daegu_friends.cocktail;

import dgb.cocktail.daegu_friends.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CocktailRepository extends JpaRepository<Cocktail, Long>{
    List<Cocktail> findByTitle(String title);
    List<Cocktail> findAll();
}
