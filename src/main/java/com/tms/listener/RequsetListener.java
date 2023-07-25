package com.tms.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequsetListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("destroy");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request");
    }
}
