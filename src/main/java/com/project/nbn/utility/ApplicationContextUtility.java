package com.project.nbn.utility;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.stereotype.Component;


/* get Bean from spring container*/
@Component
public class ApplicationContextUtility implements ApplicationContextAware, LoadTimeWeaverAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {

    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }
}
