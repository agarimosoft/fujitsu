/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fujitsu;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Agarimo
 */
public class MessageComparatorTest {

    Queue queue;

    @Before
    public void setUp() throws InvalidMessageException {
        queue = new Queue();
        queue.add(new Message(1, 1, 1, 0, 1));
        queue.add(new Message(10, 2, 2, 10, 2));
        queue.add(new Message(20, 3, 3, 50, 3));
        queue.add(new Message(30, 4, 4, 100, 4));
        queue.add(new Message(50, 5, 5, 150, 5));
        queue.add(new Message(91, 6, 6, 200, 6));
        queue.add(new Message(99, 7, 7, 254, 7));
    }

    @After
    public void tearDown() {

    }

    @Test
    public void getLenght() {
        int exp = 7;
        int result = queue.getLenght();

        assertEquals(exp, result);

    }

    @Test
    public void createOrder() {
        Message msg = new Message(2, 1, 1, 0, 8);
        try {
            queue.add(msg);
        } catch (InvalidMessageException ex) {
            Logger.getLogger(MessageComparatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        assertEquals(8, queue.getLenght());

    }

    @Test
    public void removeOrder() {
        Message msg = new Message(50, 5, 5, 150, 5);

        queue.remove(msg);
        assertEquals(6, queue.getLenght());
    }

    @Test
    public void retrieveOrder() {
        Message exp = new Message(1, 1, 1, 0, 1);
        Message msg = queue.get();

        assertEquals(exp, msg);
    }

    @Test
    public void isEmpty() {
        assertEquals(false, queue.isEmpty());

        while (!queue.isEmpty()) {
            queue.get();
        }

        assertEquals(true, queue.isEmpty());
    }

    @Test
    public void invalidOrder() {
        try {
            queue.add(new Message(1, 1, 1, 0, 1));
            fail();

        } catch (InvalidMessageException ex) {
            System.out.println(ex.getMessage());
            assertEquals(ex.getClass(), InvalidMessageException.class);
        }

        assertEquals(7, queue.getLenght());
    }
}
