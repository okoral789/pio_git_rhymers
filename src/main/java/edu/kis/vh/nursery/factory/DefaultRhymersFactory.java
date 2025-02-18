package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutCounter;
import edu.kis.vh.nursery.FIFOCounter;
import edu.kis.vh.nursery.HanoiCounter;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultCountingOutCounter GetStandardRhymer() {
        return new defaultCountingOutCounter();
    }

    @Override
    public defaultCountingOutCounter GetFalseRhymer() {
        return new defaultCountingOutCounter();
    }

    @Override
    public defaultCountingOutCounter GetFIFORhymer() {
        return new FIFOCounter();
    }

    @Override
    public defaultCountingOutCounter GetHanoiRhymer() {
        return new HanoiCounter();
    }

}
