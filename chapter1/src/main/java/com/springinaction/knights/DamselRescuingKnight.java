package com.springinaction.knights;

/**
 * Created by zh on 2017-02-08.
 */
public class DamselRescuingKnight implements Knight {

    private DamselRescuingQuest quest;

    public DamselRescuingKnight() {
        this.quest = new DamselRescuingQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
