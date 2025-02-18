package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer bufferStack = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            bufferStack.countIn(super.countOut());

        int ret = bufferStack.countOut();

        while (!bufferStack.callCheck())
            countIn(bufferStack.countOut());

        return ret;
    }
}
