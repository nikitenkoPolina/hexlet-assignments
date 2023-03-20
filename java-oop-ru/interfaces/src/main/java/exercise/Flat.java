package exercise;

// BEGIN
class Flat implements Home {

    private final double area;
    private final double balconyArea;
    private final int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    @Override
    public double getArea() {
        return area + getBalconyArea();
    }

    @Override
    public int compareTo(Home another) {
        return compare(another);
    }

    public int getFloor() {
        return floor;
    }

    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + this.getFloor() + " этаже";
    }
}
// END
