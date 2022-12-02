package dgb.cocktail.daegu_friends.store;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>
{
    Store findByTitle(String title);
    List<Store> findAll();
    //void save(User user);
}
