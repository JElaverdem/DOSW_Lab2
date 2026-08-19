public enum Currency {
    USD(1),
    EUR(2),
    JPY(3),
    COP(4);

    private final int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}