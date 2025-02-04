import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Abstract Class
abstract class GUIComponent {
    // Abstract method to create the GUI component
    public abstract void create();
}

// Interface for addition operation
interface AdditionOperation {
    // Abstract method to perform addition
    double add(double num1, double num2);
}

// Concrete Class that extends an abstract class and implements an interface
public class AdditionGUI extends GUIComponent implements AdditionOperation {
    public static void main(String[] args) {
        // Create an instance of AdditionGUI and call the create method
        AdditionGUI gui = new AdditionGUI();
        gui.create();
    }

    @Override
    public void create() {
        // Create the frame
        JFrame frame = new JFrame("Addition GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Create text fields for input
        JTextField textField1 = new JTextField();
        textField1.setBounds(50, 30, 200, 30);
        frame.add(textField1);

        JTextField textField2 = new JTextField();
        textField2.setBounds(50, 70, 200, 30);
        frame.add(textField2);

        // Create a button to perform the addition
        JButton addButton = new JButton("Add");
        addButton.setBounds(100, 110, 100, 30);
        frame.add(addButton);

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 150, 200, 30);
        frame.add(resultLabel);

        // Add action listener to the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers from the text fields
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());

                    // Perform the addition
                    double result = add(num1, num2);

                    // Display the result
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    @Override
    public double add(double num1, double num2) {
        // Return the sum of the two numbers
        return num1 + num2;
    }
}
