import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MutateDNAStingsTest {

    @Test
    void mutate(){
        var test = new MutateDNAStings();
        assertEquals("A", test.mutateDNAPairs("A"));
        assertEquals("", test.mutateDNAPairs(""));
        assertEquals("AGA", test.mutateDNAPairs("AA"));
        assertEquals("AGAGGGGG", test.mutateDNAPairs("AAGGG"));
        assertEquals("GGGGG", test.mutateDNAPairs("GGG"));
    }

}