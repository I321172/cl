package com.life.cl.loader;

import java.io.IOException;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class CLoaders {
    private static List<URLClassLoader> loaders = new ArrayList<>();

    private CLoaders() {

    }

    public static void add(URLClassLoader cl) {
        loaders.add(cl);
    }

    public static void close(String name) {
    }

    private static void close(URLClassLoader classLoader) {
        try {
            classLoader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
