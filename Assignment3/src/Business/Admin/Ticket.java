    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Business.Admin;

    /**
     *
     * @author sanal
     */
    public class Ticket {

        private String message;
        private String ticketId;
        private String name;
        private int randomNumber; // Added to store the 3-digit random number
        private boolean resolved;
        private String comment;

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public Ticket(String name, String message, String ticketId) {
            this.name = name;
            this.message = message;
            this.ticketId = ticketId;
        }

        public String getMessage() {
            return message;
        }

        public String getTicketId() {
            return ticketId;
        }

        public String getName() {
            return name;
        }

    public void setMessage(String message) {
        this.message = message;
    }

        public void setName(String name) {
            this.name = name;
        }

        // Getter for the random number
        public int getRandomNumber() {
            return randomNumber;
        }

        // Setter for the random number
        public void setRandomNumber(int randomNumber) {
            this.randomNumber = randomNumber;
        }
        
        public boolean isResolved() {
            return resolved;
        }

        public void setResolved(boolean resolved) {
            this.resolved = resolved;
        }

        @Override
        public String toString() {
            return "Ticket ID: " + ticketId + "\n" + "Message: " + message + "\n" + "Random Number: " + randomNumber;
        }

    }
