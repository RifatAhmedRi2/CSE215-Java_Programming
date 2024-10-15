import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketService {

    public TicketService() {
    }

    public ArrayList<Ticket> getAll() {
    	ArrayList<Ticket> tickets = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("Ticket.txt"))) {
            while (scanner.hasNextLine()) {
                String ticketLine = scanner.nextLine();

                String ticketInfo[] = ticketLine.split(", ");

                Ticket ticket = new Ticket(ticketInfo[0], Integer.parseInt(ticketInfo[1]),
                        Integer.parseInt(ticketInfo[2]), ticketInfo[3]);

                tickets.add(ticket);
            }
        } catch (FileNotFoundException ex) {
        	System.out.println("File not Found");
        }
        return tickets;
    }

    public void create(Ticket ticket) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("Ticket.txt", true))) {
            pw.println(ticket.getTicketType() + ", " + ticket.getPrice() + ", " + ticket.getTicketAmount() + ", " + ticket.getMatchDate());
        } catch (FileNotFoundException ex) {
        	System.out.println("File not Found");
        }
    }

    public boolean update(String ticketType, Ticket updatedTicket) {
    	ArrayList<Ticket> ticketList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream("Ticket.txt"))) {
            while (scanner.hasNextLine()) {
                String ticketLine = scanner.nextLine();

                String ticketInfo[] = ticketLine.split(", ");

                Ticket ticket = new Ticket(ticketInfo[0], Integer.parseInt(ticketInfo[1]),
                        Integer.parseInt(ticketInfo[2]), ticketInfo[3]);

                ticketList.add(ticket);
            }
        } catch (FileNotFoundException ex) {
        	System.out.println("File not Found");
        }

        int ticketIndexToUpdate = -1;

        for (int i = 0; i < ticketList.size(); i++) {
        	Ticket ticket = ticketList.get(i);

            if (ticket.getTicketType().equalsIgnoreCase(ticketType)) {
                ticketIndexToUpdate = i;
            }
        }

        if (ticketIndexToUpdate == -1) {
            return false;
        }

        ticketList.set(ticketIndexToUpdate, updatedTicket);

        try {
            Files.delete(Paths.get("Ticket.txt"));
        } catch (IOException ex) {
        	System.out.println(ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("Ticket.txt"))) {
            ticketList.forEach(ticket -> {
            	pw.println(ticket.getTicketType() + ", " + ticket.getPrice() + ", " + ticket.getTicketAmount() + ", " + ticket.getMatchDate());
            });
        } catch (FileNotFoundException ex) {
        	System.out.println("File not Found");
        }

        return true;
    }

    public void reduceTicketAmountByTicketType(String ticketType, int reduceNumber) {
    	ArrayList<Ticket> ticketList = getAll();

        for (int i = 0; i < ticketList.size(); i++) {

        	Ticket ticket = ticketList.get(i);

        	if (ticket.getTicketType().equalsIgnoreCase(ticketType)) {
                ticket.setTicketAmount(Math.max(0, ticket.getTicketAmount() - reduceNumber));
                ticketList.set(i, ticket);
            }
        }

        try {
            Files.delete(Paths.get("Ticket.txt"));
        } catch (IOException ex) {
        	System.out.println(ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("Ticket.txt"))) {
            ticketList.forEach(ticket -> {
            	pw.println(ticket.getTicketType() + ", " + ticket.getPrice() + ", " + ticket.getTicketAmount() + ", " + ticket.getMatchDate());
            });
        } catch (FileNotFoundException ex) {
        	System.out.println("File not Found");
        }
    }
    
    /*
    public void addTicketAmountByTicketType(String ticketType, int addNumber) {
        ArrayList<Ticket> ticketList = getAll();

        for (int i = 0; i < ticketList.size(); i++) {

        	Ticket ticket = ticketList.get(i);

        	if (ticket.getTicketType().equalsIgnoreCase(ticketType)) {
                ticket.setTicketAmount(Math.max(0, ticket.getTicketAmount() + addNumber));
                ticketList.set(i, ticket);
            }
        }

        try {
            Files.delete(Paths.get("Ticket.txt"));
        } catch (IOException ex) {
        	System.out.println(ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("Ticket.txt"))) {
            ticketList.forEach(ticket -> {
            	pw.println(ticket.getTicketType() + ", " + ticket.getPrice() + ", " + ticket.getTicketAmount() + ", " + ticket.getMatchDate());
            });
        } catch (FileNotFoundException ex) {
        	System.out.println("File not Found");
        }
    }
    */
    
    public String showAmount(String ticketType, int amount) {
    	ArrayList<Ticket> ticketList = getAll();
        int sum = 0;
        
        for (int i = 0; i < ticketList.size(); i++) {

        	Ticket ticket = ticketList.get(i);

        	if (ticket.getTicketType().equalsIgnoreCase(ticketType)) {
                sum = amount * ticket.getPrice();
            }
        }
        return String.valueOf(sum);
    }
}
