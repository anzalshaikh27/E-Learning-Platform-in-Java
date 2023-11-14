/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author sanal
 */
public class TicketManager {
    
    private static TicketManager instance;

    private List<Ticket> tickets;
    private Set<Integer> usedRandomNumbers;

    // Private constructor to prevent instantiation
    private TicketManager() {
        this.tickets = new ArrayList<>();
        this.usedRandomNumbers = new HashSet<>();
    }
    
    // Public method to get the single instance
    public static TicketManager getInstance() {
        if (instance == null) {
            instance = new TicketManager();
        }
        return instance;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
        usedRandomNumbers.add(Integer.parseInt(ticket.getTicketId()));
    }

    private int generateUniqueRandomNumber() {
        Random random = new Random();
        int randomNumber;
        do {
            randomNumber = 100 + random.nextInt(900); // Generates a number between 100 and 999
        } while (usedRandomNumbers.contains(randomNumber));
        usedRandomNumbers.add(randomNumber);
        return randomNumber;
    }

    public List<Ticket> getAllTickets() {
        return new ArrayList<>(tickets);
    }

    public Ticket getTicketById(String ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId().equals(ticketId)) {
                return ticket;
            }
        }
        return null;
    }

    public boolean deleteTicket(Ticket ticket) {
        if (tickets.remove(ticket)) {
            usedRandomNumbers.remove(Integer.parseInt(ticket.getTicketId()));
            return true;
        }
        return false;
    }

    public Ticket getTicketByRandomNumber(int randomNumber) {
        for (Ticket ticket : tickets) {
            if (ticket.getRandomNumber() == randomNumber) {
                return ticket;
            }
        }
        return null;
    }

    public boolean isRandomNumberTaken(int randomNumber) {
        for (Ticket ticket : this.tickets) {
            if (ticket.getRandomNumber() == randomNumber) {
                return true;
            }
        }
        return false;
    }
}
