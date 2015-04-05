import javax.swing.*;
import java.awt.*;

/**
 * Created by jaime on 05-04-2015.
 */
public class FlowLayoutExample extends JFrame {

      FlowLayoutExample() {

        setTitle("Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        for (int i = 1; i <= 6; i++) {

            contentPane.add(new JButton("Botón " + i));

         }

          /**
           * Causes this Window to be sized to fit the preferred size
           * and layouts of its subcomponents.
           */
                pack();


    }

}
