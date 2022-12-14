package ui;

import timer.Timer;
import timer.TimerImpl;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class SpellTimerUI {
    private static final String FILENAME = "C:\\Users\\adobe\\Documents\\GitHub\\SpellTimer\\drawable\\";
    private static HashMap<String, Integer> spellCoolDown = new HashMap<>();
    private static GridLayout layout = new GridLayout(6, 3);
    private static String[] optionsToChoose = {"Flash", "Ignite", "Teleport", "Exhaust", "Heal", "Cleanse", "Ghost", "Smite", "Barrier"};
    private static JComboBox[] spellList = new JComboBox[10];
    public static JButton[] spellButton = new JButton[10];
    private static Timer[] cooldown = new TimerImpl[10];


    public static void main(String args[]) {
        JFrame frame = new JFrame("Spell Timer GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 650);
        frame.setLayout(layout);

        spellCoolDown.put(optionsToChoose[0], 300);
        spellCoolDown.put(optionsToChoose[1], 180);
        spellCoolDown.put(optionsToChoose[2], 360);
        spellCoolDown.put(optionsToChoose[3], 210);
        spellCoolDown.put(optionsToChoose[4], 240);
        spellCoolDown.put(optionsToChoose[5], 210);
        spellCoolDown.put(optionsToChoose[6], 210);
        spellCoolDown.put(optionsToChoose[7], 90);
        spellCoolDown.put(optionsToChoose[8], 180);

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
        for (int i = 0; i < spellButton.length; i++) {
            spellButton[i] = new JButton();
        }

        frame.setVisible(true);


        bDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < spellList.length; i++) {
                    String selectedFruit = (String) spellList[i].getItemAt(spellList[i].getSelectedIndex());
                    frame.remove(spellList[i]);

                    Icon icon = new ImageIcon(FILENAME + selectedFruit.toLowerCase(Locale.ROOT) + ".png");
                    spellButton[i].setText(selectedFruit);
                    spellButton[i].setIcon(icon);
                    cooldown[i] = new TimerImpl(spellCoolDown.get(selectedFruit),i);
                    frame.add(spellButton[i]);


                }
                frame.setVisible(false);
                frame.setVisible(true);
            }
        });

        bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < spellList.length; i++) {
                    frame.remove(spellButton[i]);
                    cooldown[i].resetTimer();
                    frame.add(spellList[i]);
                }
                frame.setVisible(false);
                frame.setVisible(true);
            }
        });

        spellButton[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[0].timer();
            }
        });
        spellButton[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[1].timer();
            }
        });
        spellButton[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[2].timer();
            }
        });
        spellButton[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[3].timer();
            }
        });
        spellButton[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[4].timer();
            }
        });
        spellButton[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[5].timer();
            }
        });
        spellButton[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[6].timer();
            }
        });
        spellButton[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[7].timer();
            }
        });
        spellButton[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[8].timer();
            }
        });
        spellButton[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cooldown[9].timer();
            }
        });

    }

}
