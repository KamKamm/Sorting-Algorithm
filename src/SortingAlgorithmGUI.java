import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SortingAlgorithmGUI extends JFrame {
    private JButton sortButton;
    private JTextArea inputArea;
    private JTextArea outputArea;

    public SortingAlgorithmGUI() {
        // Initialize the GUI components
        sortButton = new JButton("Sort");
        inputArea = new JTextArea(10, 20);
        outputArea = new JTextArea(10, 20);
        outputArea.setEditable(false);

        // Set the layout
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(new JScrollPane(inputArea));
        topPanel.add(sortButton);
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Register the ActionListener for the sortButton
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputArea.getText();

                try {
                    String sortedOutput = SortingAlgorithm.sortArray(input);
                    outputArea.setText(sortedOutput);
                } catch (Exception ex) {
                    // Handle the exception (e.g., display an error message)
                    JOptionPane.showMessageDialog(SortingAlgorithmGUI.this,
                            "Error occurred during sorting: " + ex.getMessage(),
                            "Sorting Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set JFrame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sorting Algorithm");
        pack();
        setLocationRelativeTo(null); // Center the window on the screen
    }
}
