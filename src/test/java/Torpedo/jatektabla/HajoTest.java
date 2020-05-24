package Torpedo.jatektabla;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HajoTest {

    Hajo testhajo;

    @BeforeEach
    void setUp() {
        testhajo  = new Hajo(4, Math.random() < 0.5);
        System.out.println("I work");
    }


    @Test
    void testtalalatV() {
        assertEquals(3,testhajo.talalatV());
        System.out.println("I work too");
    }
}