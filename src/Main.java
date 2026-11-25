import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO
 // Click Select Folder.
 // Open a Windows folder selection dialog.
 // Navigate through their directories.
 // Select a folder.
 // Retrieve the selected folder's path.
 // Display that path somewhere in your application.


void main() {

    SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Java File Organizer");

        frame.setSize(800,500); // Set the size of the frame
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String homePath = System.getProperty("user.home");
        JFileChooser j = new JFileChooser(homePath);

        JPanel panel = new JPanel();
        JButton button = new JButton("Select Folder");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j.showSaveDialog(null);
            }
        });

        frame.add(panel, BorderLayout.WEST);

        frame.setVisible(true);
    });

}
