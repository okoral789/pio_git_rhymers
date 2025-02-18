package edu.kis.vh.nursery;

public class defaultCountingOutCounter {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void addNumber(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean isEmpty() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peek() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
