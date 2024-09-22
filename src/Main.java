import Interfaces.Menu;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);
            }
        });
    }
}
