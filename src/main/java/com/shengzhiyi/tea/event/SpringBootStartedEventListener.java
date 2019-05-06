package com.shengzhiyi.tea.event;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringBootStartedEventListener implements ApplicationListener<ApplicationStartingEvent>{
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartedEvent) {
        System.out.println("tea application starting .....");
    }

}
