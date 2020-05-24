package Torpedo.jatektabla;

import Torpedo.dataTabla.readFromJSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HajoTest {

    Hajo testhajo;

    @BeforeEach
    void setUp() {
        testhajo  = new Hajo(4, Math.random() < 0.5);
        readFromJSON.logger.info("BeforeEach sikeresen lefutott");
    }


    @Test
    void testtalalatV() {
        assertEquals(3,testhajo.talalatV());
        readFromJSON.logger.info("Sikeresen eltaláltuk a hajot.");
    }

    @Test
    void testEl() {
        testhajo.talalatV();
        testhajo.talalatV();
        testhajo.talalatV();
        testhajo.talalatV();
        assertEquals(false,testhajo.El());
        readFromJSON.logger.info("A hajo megsemmisult.");
    }

}