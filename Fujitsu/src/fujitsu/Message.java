/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fujitsu;


/**
 *
 * @author Agarimo
 */
public class Message {
    
    private int instructionType;
    private int productCode;
    private int quantity;
    private int uom;
    private int timeStamp;
    
    public Message(){
        
    }

    public Message(int instructionType, int productCode, int quantity, int uom, int timeStamp) {
        this.instructionType = instructionType;
        this.productCode = productCode;
        this.quantity = quantity;
        this.uom = uom;
        this.timeStamp = timeStamp;
    }
    
    public int getInstructionType() {
        return instructionType;
    }

    public void setInstructionType(int instructionType) {
        this.instructionType = instructionType;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUom() {
        return uom;
    }

    public void setUom(int uom) {
        this.uom = uom;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.instructionType;
        hash = 97 * hash + this.productCode;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (this.instructionType != other.instructionType) {
            return false;
        }
        if (this.productCode != other.productCode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Message{" + "instructionType=" + instructionType + ", productCode=" + productCode + ", quantity=" + quantity + ", uom=" + uom + ", timeStamp=" + timeStamp + '}';
    }
    
    
    
    
}
