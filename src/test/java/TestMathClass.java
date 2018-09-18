package test;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import main.MathClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class TestMathClass {
    private MathClass m_class;

    @Before
    public void Setup() {
        m_class = new MathClass();
    }

    @Test
    @Parameters({
            "3, Fizz",
            "6, Fizz",
            "9, Fizz",
            "12,Fizz"})
    public void CollectionMultipleOf3(int numb, String result) throws Exception {
        String actual = m_class.CheckNumber(numb);
        assertEquals(result, actual);
    }

    @Test
    @Parameters({
            "5, Buzz",
            "10, Buzz",
            "20, Buzz",
            "25, Buzz"})
    public void CollectionMultipleOf5(int numb, String result) throws Exception {
        String actual = m_class.CheckNumber(numb);
        assertEquals(result, actual);
    }

    @Test
    @Parameters({
            "15, FizzBuzz",
            "30, FizzBuzz"})
    public void CollectionMultipleOf3And5(int numb, String result) throws Exception {
        String actual = m_class.CheckNumber(numb);
        assertEquals(result, actual);
    }
}