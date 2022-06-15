public abstract class Clothes {
        Sizes size;
        int price;
        String color;

        public Clothes(Sizes size, int price, String color){
                this.size = size;
                this.price = price;
                this.color = color;
        }

        public int getPrice() {
                return price;
        }

        public String getColor() {
                return color;
        }

        public Sizes getSize() {
                return size;
        }
}
