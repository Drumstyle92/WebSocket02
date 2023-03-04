package it.develhope.WebSocket02.entities;

/**
 * @author Drumstyle92
 * DTO class that contains structure for client messages
 */
public class ClientMessageDTO {

    /**
     * Client name variable
     */
    private String clientName;

    /**
     * Variable of the type of alert requested
     */
    private String clientAlert;

    /**
     *
     Client message content variable
     */
    private String clientMsg;

    /**
     * @param clientName  the client name
     * @param clientAlert the client alert
     * @param clientMsg   the client msg
     * Parameterized constructor
     */
    public ClientMessageDTO(String clientName, String clientAlert, String clientMsg) {
        this.clientName = clientName;
        this.clientAlert = clientAlert;
        this.clientMsg = clientMsg;
    }

    /**
     * @return the client name
     * Method for encapsulation
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the client name
     * Method for encapsulation
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the client alert
     * Method for encapsulation
     */
    public String getClientAlert() {
        return clientAlert;
    }

    /**
     * @param clientAlert the client alert
     * Method for encapsulation
     */
    public void setClientAlert(String clientAlert) {
        this.clientAlert = clientAlert;
    }

    /**
     * @return the client msg
     * Method for encapsulation
     */
    public String getClientMsg() {
        return clientMsg;
    }

    /**
     * @param clientMsg the client msg
     * Method for encapsulation
     */
    public void setClientMsg(String clientMsg) {
        this.clientMsg = clientMsg;
    }

}
