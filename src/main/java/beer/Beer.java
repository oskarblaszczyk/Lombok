package beer;

import alcoholic.Alcoholic;
import beer.ingredients.Ingredients;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString (includeFieldNames = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode
@Builder
public class Beer {
    @ToString.Include
    @NonNull
    private final String brandName;
    @ToString.Include
    @NonNull
    private Double price;
    @NonNull
    @EqualsAndHashCode.Exclude
    private QualityOfBeerFoam qualityOfBeerFoam;
    @NonNull
    @EqualsAndHashCode.Exclude
    @Singular ("ingredientsList")
    private List<Ingredients> ingredientsList;
    @NonNull
    @EqualsAndHashCode.Exclude
    private Double alcoholContent;

    private List<Alcoholic> alcoholics = new ArrayList<>();

}
