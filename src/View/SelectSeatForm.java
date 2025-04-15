package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectSeatForm extends JFrame {
    private JButton[][] seats;
    private CaissierForm parentForm; // Reference to the parent form

    // Modified constructor to accept parent form
    public SelectSeatForm(CaissierForm parent) {
        this.parentForm = parent;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Seat Selection");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 5));
        seats = new JButton[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seats[i][j] = new JButton("Seat " + (i + 1) + "-" + (j + 1));
                seats[i][j].addActionListener(new SeatClickListener(i, j));
                panel.add(seats[i][j]);
            }
        }

        add(panel);
    }

    private class SeatClickListener implements ActionListener {
        private int row, col;

        public SeatClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedSeat = "Seat " + (row + 1) + "-" + (col + 1);
            
            // Send the selected seat back to parent form
            if (parentForm != null) {
                parentForm.setSelectedSeat(selectedSeat);
            }
            
            // Close the seat selection form
            dispose();
        }
    }
}