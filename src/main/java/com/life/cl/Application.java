package com.life.cl;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.loader.PropertiesLauncher;

@Log4j2
public class Application {
    public static void main(String args[]) throws Exception {
       log.info("Test");
       PropertiesLauncher.main(null);
    }
}
