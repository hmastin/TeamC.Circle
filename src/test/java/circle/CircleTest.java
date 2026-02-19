package circle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {

    private static final double EPS = 1e-12;

    @Test
    void rEquals2_computationsAreCorrect() {
        Circle c = new Circle(2.0);
        assertEquals(4.0, c.calculateDiameter(), EPS);
        assertEquals(4.0 * Math.PI, c.calculateCircumference(), EPS);
        assertEquals(4.0 * Math.PI, c.calculateArea(), EPS);
    }

    @Test
    void rEquals0_fallsBackTo1() {
        Circle c = new Circle(0.0);
        assertEquals(1.0, c.getRadius(), EPS);
    }

    @Test
    void rNegative_fallsBackTo1() {
        Circle c = new Circle(-1.0);
        assertEquals(1.0, c.getRadius(), EPS);
    }

    @Test
    void rMinPositiveDouble_isAccepted() {
        Circle c = new Circle(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, c.getRadius(), 0.0);
    }

    @Test
    void rAtRadiusMax_isAccepted() {
        Circle c = new Circle(Circle.RADIUS_MAX);
        assertEquals(Circle.RADIUS_MAX, c.getRadius(), 0.0);
    }

    @Test
    void rJustAboveRadiusMax_fallsBackTo1() {
        double justAbove = Math.nextUp(Circle.RADIUS_MAX);
        Circle c = new Circle(justAbove);
        assertEquals(1.0, c.getRadius(), EPS);
    }

    @Test
    void rPositiveInfinity_fallsBackTo1() {
        Circle c = new Circle(Double.POSITIVE_INFINITY);
        assertEquals(1.0, c.getRadius(), EPS);
    }

    @Test
    void rNaN_propagatesNaN() {
        Circle c = new Circle(Double.NaN);
        assertTrue(Double.isNaN(c.getRadius()));
        assertTrue(Double.isNaN(c.calculateArea()));
        assertTrue(Double.isNaN(c.calculateCircumference()));
        assertTrue(Double.isNaN(c.calculateDiameter()));
    }
}