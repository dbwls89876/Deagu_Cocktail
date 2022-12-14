package dgb.cocktail.daegu_friends.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
//@Table(name="store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String storeInfo;
    private double lat;
    private double lon;
    private String image;

    public Store(){}

    @Builder
    public Store(String title, String storeInfo){
        this.title = title;
        this.storeInfo = storeInfo;
    }
}
