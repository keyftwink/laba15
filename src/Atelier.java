interface MensClothing{

    void dressAMan();

}

interface WomensClothing{

    void dressAWoman();

}

public class Atelier {

    public void dressAMan(Clothes[] clothes) {
        System.out.println("\nМужская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof MensClothing) {
                System.out.println(clothe);
            }
        }
    }

    public void dressAWoman(Clothes[] clothes) {
        System.out.println("\nЖенская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomensClothing) {
                System.out.println(clothe);
            }
        }
    }


    static class TShirt extends Clothes implements MensClothing, WomensClothing {

        public TShirt(Sizes size, int price, String color) {
            super(size, price, color);
        }

        @Override
        public void dressAMan() {
        }

        @Override
        public void dressAWoman() {
        }

        public String toString() {
            return "Футболка:" + "размер: " + getSize() + ", цена: " + getPrice() + " рублей" + ", цвет: " + getColor();
        }

    }

    static class Trousers extends Clothes implements MensClothing, WomensClothing {

        public Trousers(Sizes size, int price, String color) {
            super(size, price, color);
        }

        @Override
        public void dressAMan() {
        }

        @Override
        public void dressAWoman() {
        }

        public String toString() {
            return "Штаны:" + "размер: " + getSize() + ", цена: " + getPrice() + " рублей" + ", цвет: " + getColor();
        }

    }

    static class Skirt extends Clothes implements WomensClothing {

        public Skirt(Sizes size, int price, String color) {
            super(size, price, color);
        }
        @Override
        public void dressAWoman() {
        }

        public String toString() {
            return "Юбка:" + "размер: " + getSize() + ", цена: " + getPrice() + " рублей" + ", цвет: " + getColor();
        }
    }

    static class Tie extends Clothes implements MensClothing {

        public Tie(Sizes size, int price, String color) {
            super(size, price, color);
        }

        @Override
        public void dressAMan() {
        }

        public String toString() {
            return "Галстук:" + "размер: " + getSize() + ", цена: " + getPrice() + " рублей" + ", цвет: " + getColor();
        }

    }
}
