import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 * @Author  :bob
 * @Date    :Created in 13:04 2020/10/27
 * @Description:
 *
 */
public class RentalTest {
    Movie movie = new Movie("好", 2);
    Rental rentalTest = new Rental(movie,1);

    @Test
    public void getDaysRented() {
        assertEquals(1,rentalTest.getDaysRented());
    }

    @Test
    public void getMovie() {
    }
}