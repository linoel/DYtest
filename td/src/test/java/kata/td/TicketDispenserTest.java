package kata.td;

import org.junit.Test;
import sun.security.krb5.internal.Ticket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * mockito //mock工具
 * 接口提取
 *
 *
 * Created by benwu on 14-6-10.
 */
public class TicketDispenserTest {

    @Test
    public void a_new_ticket_should_have_the_turn_number_subsequent_to_the_previous_ticket() {
        // Arrange
        TicketDispenser ticketDispenser = new TicketDispenser();

        // Act
        TurnTicket previousTicket = ticketDispenser.getTurnTicket();
        TurnTicket newTicket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(1, newTicket.getTurnNumber() - previousTicket.getTurnNumber());
    }

    @Test
    public void a_new_ticket_should_have_the_turn_number_subsequent_to_the_previous_ticket_from_another_dispenser() {
        // Arrange 准备测试条件
        TicketDispenser dispenser = new TicketDispenser();
        TicketDispenser anotherDispenser = new TicketDispenser();

        // Act  调测试方法
        TurnTicket previousTicket = dispenser.getTurnTicket();
        TurnTicket newTicketFromAnotherDispenser = anotherDispenser.getTurnTicket();

        // Assert  看结果是否符合期望
        assertEquals(1, newTicketFromAnotherDispenser.getTurnNumber() - previousTicket.getTurnNumber());
    }


    @Test
    public void a_new_Test(){
        //arrange

        //act

        //assert
//        assertEquals(1);
    }

    // TODO-unit-test: make a unit test for class TicketDispenser
    public void testMock(){

    }


    // TODO-new-feature: the turn number sequence of the vip customers starts from 1001
    // TODO-new-feature: the turn number sequence of the regular customers starts from 2001
}
