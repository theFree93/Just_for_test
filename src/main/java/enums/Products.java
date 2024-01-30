package enums;

public enum Products {
    SALAD(3.2),
    POTATOES(1.4),
    SPARKLING_WATER(2.3);

    private final double cost;

    Products(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }
}

