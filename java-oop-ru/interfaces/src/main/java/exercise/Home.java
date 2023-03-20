package exercise;

// BEGIN
public interface Home {
    double getArea();

    int compareTo(Home another);

    default int compare(Home another) {
        return Double.compare(another.getArea(), getArea());
    }
}
// END
