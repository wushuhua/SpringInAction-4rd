package com.springinaction.knights;

import org.springframework.beans.factory.DisposableBean;

import java.io.PrintStream;

/**
 * Created by zh on 2017-02-08.
 */
public class SlayDragonQuest implements Quest, DisposableBean {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("Embarking on quest to slay the dragon!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
        if(printStream != null) printStream.close();
    }
}
