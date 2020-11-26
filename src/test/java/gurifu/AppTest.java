package gurifu;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.Is;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void generateFizzBuzzStrTest(){
        String result=App.generateFizzBuzzStr(20);
        assertThat(result, Is.is("Fizz,Buzz,Fizz,Fizz,Buzz,Fizz,FizzBuzz,Fizz,Buzz"));
    }

}
