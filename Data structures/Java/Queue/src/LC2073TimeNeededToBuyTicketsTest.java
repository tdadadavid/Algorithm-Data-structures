import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC2073TimeNeededToBuyTicketsTest {

    @Test
    void itShouldReturnTimeItTakeToBuyATicket(){
        LC2073_TimeNeededToBuyTickets test = new LC2073_TimeNeededToBuyTickets();

        assertEquals(6, test.timeRequiredToBuy2(new int[]{2,3,2}, 2));
        assertEquals(8, test.timeRequiredToBuy2(new int[]{5,1,1,1}, 0));
    }

}