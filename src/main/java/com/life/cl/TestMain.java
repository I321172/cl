package com.life.cl;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;

@Log4j2
public class TestMain {
    public static void main(String args[]) {
        log.info("Test is the test main for Start-Class");
        testLoadedClass();
    }

    public static void testLoadedClass() {
        log.info("This is the method from commons-io, it can be run only when the jar is loaded by external file ");
        try {
            Class<?> fileUtils = Class.forName("org.apache.commons.io.FileUtils");
            Arrays.stream(fileUtils.getDeclaredMethods()).map(method -> method.getName()).forEach(log::info);

        } catch (Throwable t) {
            t.printStackTrace();
        }
        try {
            Class<?>cl=Thread.currentThread().getContextClassLoader().loadClass("org.apache.commons.io.FileUtils");
            Arrays.stream(cl.getDeclaredMethods()).map(method -> method.getName()).forEach(log::info);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
