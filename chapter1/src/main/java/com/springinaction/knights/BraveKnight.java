package com.springinaction.knights;

/**
 * Created by zh on 2017-02-08.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) { //构造器注入。。。
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
