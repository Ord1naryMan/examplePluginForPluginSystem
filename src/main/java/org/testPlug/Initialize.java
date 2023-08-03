package org.testPlug;

import org.plugSys.core.events.TimeGetEvent;

public class Initialize {

    public static final String pluginName = "timePlugin";
    public static void init() {
        TimeGetEvent.register(new PluginTimeEventHandler());
    }
}