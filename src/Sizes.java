public enum Sizes {
    XXS(32){
        @Override
        public String getDescription(Sizes sizes){
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    Sizes(int euroSize) {
    }

    public String getDescription(Sizes size){
        return "Взрослый размер";

    }
}
