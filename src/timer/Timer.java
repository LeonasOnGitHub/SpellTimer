package timer;

public interface Timer {
    /**
     * count down until the spell is up again
     *
     */
    void timer();

    /**
     * resets the timer to 0
     */
    void resetTimer();
}
