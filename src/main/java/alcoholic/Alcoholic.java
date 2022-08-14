package alcoholic;

import beer.Beer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@Builder
public class Alcoholic {
    @NonNull
    @ToString.Include
    private String name;
    @NonNull
    @ToString.Include
    private String surname;

    private List<Beer> beers = new ArrayList<>();

    public void addBeer(Beer beer) {
        beers.add(beer);
        beer.getAlcoholics().add(this);
    }


}
