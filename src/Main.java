import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Clothes[] clothes = {
                new Atelier.TShirt(Sizes.XS, 500, "Черная"),
                new Atelier.TShirt(Sizes.L, 600, "Красная"),
                new Atelier.Tie(Sizes.M, 300, "Черный"),
                new Atelier.Tie(Sizes.XXS, 600, "Синий"),
                new Atelier.Trousers(Sizes.S, 1000, "Черные"),
                new Atelier.Trousers(Sizes.M, 2000, "Синие"),
                new Atelier.Skirt(Sizes.L, 700, "Черная"),
                new Atelier.Skirt(Sizes.L, 800, "Серая"),
        };

        Atelier studio = new Atelier();
        studio.dressAMan(clothes);
        studio.dressAWoman(clothes);

    }

}


