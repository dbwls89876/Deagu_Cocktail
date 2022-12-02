package dgb.cocktail.daegu_friends.cocktail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
//@Table(name="store")
public class Cocktail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String cocktailName;
    private String desc;
    private String image;

    public Cocktail(){}

    @Builder
    public Cocktail(String title, String cocktailName){
        this.title = title;
        this.cocktailName = cocktailName;
    }
}
