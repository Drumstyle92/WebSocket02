package it.develhope.WebSocket02.entities;

/**
 * @author Drumstyle92
 * DTO class containing useful data to give a structure to the message
 */
public class MessageDTO {

    /**
     * Message sender variable
     */
    private String sender;

    /**
     * Message type variable
     */
    private String type;

    /**
     * Message content variable
     */
    private String message;

    /**
     * @param sender  the sender
     * @param type    the type
     * @param message the message
     * Parameterized constructor
     */
    public MessageDTO(String sender, String type, String message) {
        this.sender = sender;
        this.type = type;
        this.message = message;
    }


    /**
     * @return the sender
     * Method for encapsulation
     */
    public String getSender() {
        return sender;
    }

    /**
     * @param sender the sender
     * Method for encapsulation
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return the type
     * Method for encapsulation
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type
     * Method for encapsulation
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the message
     * Method for encapsulation
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message
     * Method for encapsulation
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
