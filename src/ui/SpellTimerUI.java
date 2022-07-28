package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpellTimerUI {
    private static GridLayout layout = new GridLayout(6, 3);
    private static String[] optionsToChoose = {"Flash", "Ignite", "Teleport", "Exhaust", "Heal", "Cleanse", "Ghost"};
    private static JComboBox[] spellList = new JComboBox[10];
    private static JButton[] spellButton = new JButton[10];


    public static void main(String args[]) {
        JFrame frame = new JFrame("Spell Timer GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(layout);

        JButton bDone = new JButton();
        bDone.setText("Done");
        frame.add(bDone);
        JButton bReset = new JButton();
        bReset.setText("Reset");
        frame.add(bReset);

        for (int i = 0; i < spellList.length; i++) {
            spellList[i] = new JComboBox(optionsToChoose);
            frame.add(spellList[i]);
        }
        frame.setVisible(true);


        bDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < spellList.length; i++) {
                    String selectedFruit = (String) spellList[i].getItemAt(spellList[i].getSelectedIndex());
                    frame.remove(spellList[i]);

                    spellButton[i] = new JButton();
                    spellButton[i].setText(selectedFruit);
                    frame.add(spellButton[i]);
                }

                frame.setVisible(true);
            }
        });

        bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < spellList.length; i++) {
                    frame.remove(spellButton[i]);
                    frame.add(spellList[i]);
                }
                frame.setVisible(false);
                frame.setVisible(true);
            }
        });



    }
}
