package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpellTimerUI {
    private static GridLayout layout = new GridLayout(6, 3);
    private static String[] optionsToChoose = {"Flash", "Ignite", "Teleport", "Exhaust", "Heal", "Cleanse", "Ghost"};

    public static void main(String args[]) {
        JFrame frame = new JFrame("Spell Timer GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(layout);

        JComboBox<String> CBtopSum1 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBtopSum2 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBjngSum1 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBjngSum2 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBmidSum1 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBmidSum2 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBadcSum1 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBadcSum2 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBsupSum1 = new JComboBox<>(optionsToChoose);
        JComboBox<String> CBsupSum2 = new JComboBox<>(optionsToChoose);

        frame.add(CBtopSum1);
        frame.add(CBtopSum2);
        frame.add(CBjngSum1);
        frame.add(CBjngSum2);
        frame.add(CBmidSum1);
        frame.add(CBmidSum2);
        frame.add(CBadcSum1);
        frame.add(CBadcSum2);
        frame.add(CBsupSum1);
        frame.add(CBsupSum2);


        JButton bDone = new JButton();
        bDone.setText("Done");
        frame.add(bDone);

        frame.setVisible(true);


        bDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFruit = CBadcSum1.getItemAt(CBadcSum1.getSelectedIndex());
                frame.remove(CBadcSum1);
                JButton b = new JButton(selectedFruit);
                frame.add(b, 1);
                frame.setVisible(true);
            }
        });


    }
}
