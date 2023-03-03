package cour_2_poo;

import java.util.Objects;

public class Point {
    private  int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(!(obj instanceof Point))
            return false;

        var point = (Point)obj;
        return this.x == point.x && this.y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }
}
