// src/controller/CaissierController.java
package controller;

import model.TicketModel;

import java.awt.print.*;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class CaissierController {

    public List<String> getAllMovies() throws SQLException {
        return TicketModel.fetchMovies();
    }

    /** Showtime lines for the “Heure” combo */
    public List<String> getShowtimesFor(String filmTitle) throws SQLException {
        return TicketModel.fetchShowtimes(filmTitle);
    }

    /** Seat‑type options */
    public List<String> getSeatTypes() {
        return Arrays.asList("Standard", "Premium");
    }

    /** Persist the ticket; return true if OK */
    public boolean bookTicket(int showtimeId,
                              String customerName,
                              String seat,
                              String seatType) {
        double price = seatType.equals("Premium") ? 15.0 : 10.0;
        try {
            TicketModel.insertTicket(showtimeId, customerName, seat, seatType, price);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // Build the text of the ticket 
    public String buildTicketText(String film,
                                  String showtimeInfo,
                                  String customer,
                                  String seatType,
                                  String seat,
                                  double price) {
        return String.join("\n",
            "================================",
            "         CINEMA TICKET          ",
            "================================",
            "Film: "       + film,
            "Showtime: "  + showtimeInfo,
            "Client: "    + customer,
            "Seat Type: " + seatType,
            "Seat Number: "+ seat,
            "Price: "     + price,
            "================================",
            "        Enjoy the movie!        ",
            "================================"
        );
    }

    /** Print a ticket text via Java2D */
    public void printTicket(String ticketText) throws PrinterException {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable((g, pf, page) -> {
            if (page > 0) return Printable.NO_SUCH_PAGE;
            int x = 100, y = 100;
            g.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
            for (String line : ticketText.split("\n")) {
                g.drawString(line, x, y);
                y += 15;
            }
            return Printable.PAGE_EXISTS;
        });
        if (job.printDialog()) {
            job.print();
        }
    }
}
