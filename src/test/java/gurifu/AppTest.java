package gurifu;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.Is;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void generateFizzBuzzStrTest() {
        String result = App.generateFizzBuzzString(20);
        assertThat(result, Is.is("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz"));
    }

}
