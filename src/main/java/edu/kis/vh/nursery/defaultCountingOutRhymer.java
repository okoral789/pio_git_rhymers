package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] values = new int[12];

    public int totalCount = -1;

    public void countIn(int in) {
        if (!isFull())
            values[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == -1;
    }

    public boolean isFull() {
        return totalCount == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return values[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return values[totalCount--];
    }

}
