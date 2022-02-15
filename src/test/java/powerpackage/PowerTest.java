package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOneEqualsOne() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneEqualsTwo() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoEqualsFour() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoEqualsNine() {
        assert powerfinder.OF(3, 2) == 3*3;
    }
}
