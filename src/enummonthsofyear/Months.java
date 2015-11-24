package enummonthsofyear;

public enum Months {

    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGEST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private final int days;

    private Months(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public Months next() {
        Months nextMonth = values()[(ordinal() + 1) % values().length];
        return nextMonth;
    }
}
