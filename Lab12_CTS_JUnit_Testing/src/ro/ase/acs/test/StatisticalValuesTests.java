package ro.ase.acs.test;

import org.junit.Test;
import static org.junit.Assert.*;

import ro.ase.acs.exceptions.StatisticalException;
import ro.ase.acs.models.StatisticalValues;

import java.util.ArrayList;
import java.util.List;

public class StatisticalValuesTests {

    @Test
    public void testMinimum(){
        List<Long> values = new ArrayList<Long>();
        values.add(1L);
        values.add(2L);
        values.add(3L);

        StatisticalValues statisticalValues = new StatisticalValues();
        statisticalValues.setValues(values);
        long result = statisticalValues.getMinimum();
        assertEquals("Incorect Minimum", 1, result);
    }

    @Test
    public void testGetAverrageForThreeValues(){
        List<Long> values = new ArrayList<Long>();
        values.add(1L);
        values.add(2L);
        values.add(3L);

        StatisticalValues statisticalValues = new StatisticalValues();
        statisticalValues.setValues(values);

        double result = 0;
        try {
            result = statisticalValues.getAverrage();
        } catch(StatisticalException e){
            fail(e.getMessage());
        }
        // nu se pot compara in mod clasic doua valori double
        // consider ca daca dif e < 0.01 le consider egale
        assertEquals("Incorect averrage", 2, result, 0.01);
    }


    // daca fac cu expected nu mai e nevoie de try/catch
    @Test(expected = StatisticalException.class)
    public void testGetAverrageForEmptyList() throws StatisticalException{
        List<Long> values = new ArrayList<>();

        StatisticalValues statisticalValues = new StatisticalValues();
        statisticalValues.setValues(values);

        statisticalValues.getAverrage();
    }

    @Test(expected = StatisticalException.class)
    public void testGetAverageForNullList() throws StatisticalException{
        List<Long> values = null;
        StatisticalValues statisticalValues = new StatisticalValues();
        statisticalValues.setValues(values);

        statisticalValues.getAverrage();

    }

    @Test
    public void testGetAverrageSingleValue() throws StatisticalException{
        List<Long> values = new ArrayList<>();
        values.add(1L);

        StatisticalValues statisticalValues = new StatisticalValues();
        statisticalValues.setValues(values);

        double result = 0;
        result = statisticalValues.getAverrage();

        assertEquals("Incorect averrage", 1, result, 0.01);
    }

    @Test(expected = StatisticalException.class)
    public void testGetAverrageForNullElement() throws StatisticalException{
        List<Long> values = new ArrayList<>();
        values.add(null);
        StatisticalValues statisticalValues = new StatisticalValues();
        statisticalValues.setValues(values);
        statisticalValues.getAverrage();
    }

    @Test
    public void testGetAverrageFloatForValue() throws StatisticalException {
        List<Long> values = new ArrayList<>();
        values.add(2L);
        values.add(2L);
        values.add(3L);

        StatisticalValues statisticalValues = new StatisticalValues();
        statisticalValues.setValues(values);
        double result = statisticalValues.getAverrage();
        assertEquals("Incorect averrage", 2.33, result, 0.01);

    }
}
