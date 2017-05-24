package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zh on 2017-02-08.
 */
public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("knight.xml");
        context.close();
//        Knight knight = context.getBean(Knight.class);
//        knight.embarkOnQuest();
//        context.close();
    }
}
