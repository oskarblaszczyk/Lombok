import alcoholic.Alcoholic;
import beer.Beer;
import beer.QualityOfBeerFoam;
import beer.ingredients.Hops;
import beer.ingredients.Ingredients;
import beer.ingredients.Water;
import beer.ingredients.Yeast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Ingredients> ingredientsList = new ArrayList<>();

        Alcoholic alcoholic2 = Alcoholic.builder()
                .name("Joachim")
                .surname("Nowak")
                .build();
        System.out.println(alcoholic2);

        Hops h1 = new Hops();
        Water w1 = new Water();
        Yeast y1 = new Yeast();

        ingredientsList.add(h1);
        ingredientsList.add(w1);

        Beer b1 = Beer.builder()
                .brandName("Tyskie")
                .price(4.0)
                .qualityOfBeerFoam(QualityOfBeerFoam.GOOD)
                .ingredientsList(ingredientsList)
                .alcoholContent(5.0)
                .build();
        Beer b2 = Beer.builder()
                .brandName("Tyskie")
                .price(4.0)
                .qualityOfBeerFoam(QualityOfBeerFoam.BAD)
                .ingredientsList(Arrays.asList(h1, w1, y1))
                .alcoholContent(2.0)
                .build();
        Alcoholic a1 = Alcoholic.builder()
                .name("Jan")
                .surname("Kowalski")
                .build();
        Alcoholic a5 = Alcoholic.builder()
                .name("As")
                .surname("Bra")
                .beers(Arrays.asList(b1, b2))
                .build();


        Beer b3 = new Beer("Tyskie", 4.00, QualityOfBeerFoam.GOOD, ingredientsList, 5.0);
        Beer b4 = new Beer("Tyskie", 4.00, QualityOfBeerFoam.BAD, ingredientsList, 4.0);
        Alcoholic a2 = new Alcoholic("Jan", "Nowak");

        System.out.println("asd: " + a5);
        System.out.println(a5.getBeers());
        System.out.println(a1);
        System.out.println(a1.getBeers() +" hahaha");
        System.out.println(b3);
        System.out.println(a2);
        System.out.println(b3.equals(b4));
        System.out.println(b1);
    }
}
