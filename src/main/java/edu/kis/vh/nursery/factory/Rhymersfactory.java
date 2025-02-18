package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutCounter;

public interface Rhymersfactory {

    public defaultCountingOutCounter GetStandardRhymer();

    public defaultCountingOutCounter GetFalseRhymer();

    public defaultCountingOutCounter GetFIFORhymer();

    public defaultCountingOutCounter GetHanoiRhymer();

}
