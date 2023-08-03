package org.testPlug;

import org.plugSys.core.events.TimeGetEventHandler;

public class PluginTimeEventHandler implements TimeGetEventHandler {
    @Override
    public void getTime() {
        System.out.println("Look at your current time ^_^");
    }
}
