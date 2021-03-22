import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows extends JFrame {
    public void MyWindow(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(50,50);
        setLayout(new GridLayout(2,1));

        JPanel panel = new JPanel();
        JButton button = new JButton("Licz");
        JTextField field = new JTextField(10);
        JLabel label = new JLabel("0");

        panel.add(button);
        panel.add(field);
        panel.add(label);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculations obj = new Calculations();

                label.setText(obj.euklides(Integer.parseInt(field.getText())));
            }
        });

        Container container = getContentPane();
        container.add(panel);

        setVisible(true);
    }

}
