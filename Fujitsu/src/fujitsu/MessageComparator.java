/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fujitsu;

import java.util.Comparator;

/**
 *
 * @author Agarimo
 */
public class MessageComparator implements Comparator<Message> {

    @Override
    public int compare(Message o1, Message o2) {
        if (o1.getInstructionType() < o2.getInstructionType()) {
            return -1;
        } else if (o1.getInstructionType() > o2.getInstructionType()) {
            return 1;
        }
        return 0;
    }

}
