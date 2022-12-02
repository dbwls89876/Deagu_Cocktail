package dgb.cocktail.daegu_friends.store;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;

    public Store findStore(Store store){
        return storeRepository.findByTitle(store.getTitle());
    }

}
