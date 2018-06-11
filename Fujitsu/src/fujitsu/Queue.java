/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fujitsu;

import java.util.PriorityQueue;

/**
 *
 * @author Agarimo
 */
public class Queue {

    PriorityQueue<Message> queue = new PriorityQueue(10, new MessageComparator());

    public int getLenght() {
        return queue.size();
    }

    public void add(Message message) throws InvalidMessageException {
        if (isValid(message)) {
            queue.add(message);
        }
    }

    public void remove(Message message) {
        queue.remove(message);
    }

    public Message get() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    private boolean isValid(Message message) throws InvalidMessageException {
        if (message.getInstructionType() <= 0 || message.getInstructionType() >= 100) {
            throw new InvalidMessageException("InstructionType not valid");
        } else if (message.getProductCode() <= 0) {
            throw new InvalidMessageException("ProductCode not valid");
        } else if (message.getQuantity() <= 0) {
            throw new InvalidMessageException("Quantity not valid");
        } else if (message.getUom() < 0 || message.getUom() >= 256) {
            throw new InvalidMessageException("UOM not valid");
        } else if (message.getTimeStamp() <= 0) {
            throw new InvalidMessageException("TimeStamp not valid");
        }
        return true;
    }
}
