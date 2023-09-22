import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    /**
    This function checks for the correct answer from the obj cal add()
     */
    @Test
    void addEqualsTen(){
        var cal = new Calc();
        assertEquals(10, cal.add(5,5));
    }
    /**
     This function checks for the correct answer from the obj cal sub()
     */
    @Test
    void subEqualsSix(){
        var cal = new Calc();
        assertEquals(50, cal.sub(100,50));
    }
    /**
     This function checks for the correct answer from the obj cal multi()
     */
    @Test
    void multiEqualsSixty(){
        var cal = new Calc();
        assertEquals(60, cal.multi(10,6));
    }
    /**
     This function checks for the correct answer from the obj cal div()
     */
    @Test
    void divEqualsFive(){
        var cal = new Calc();
        assertEquals(5, cal.div(10,2));
    }

}