package timer;

import ui.SpellTimerUI;

public class TimerImpl implements Timer, Runnable {

    private int time;
    private int button;

    public TimerImpl(int coolDownInSec, int button) {
        this.time = coolDownInSec;
        this.button = button;
    }
    @Override
    public void run() {
        String text = SpellTimerUI.spellButton[this.button].getText();
        System.out.println(time);
        while (time > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            this.time--;
            SpellTimerUI.spellButton[this.button].setText(String.valueOf(this.time));
        }
        SpellTimerUI.spellButton[this.button].setText(text);
    }

    @Override
    public void timer() {
        Thread countdown = new Thread(new TimerImpl(this.time,this.button));
        countdown.start();


    }
}
