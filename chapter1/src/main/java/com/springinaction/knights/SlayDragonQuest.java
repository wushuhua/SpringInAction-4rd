package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by zh on 2017-02-08.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("Embarking on quest to slay the dragon!");
    }
}
