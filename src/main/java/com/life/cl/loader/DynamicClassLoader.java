package com.life.cl.loader;

import java.net.URL;
import java.net.URLClassLoader;

public class DynamicClassLoader extends URLClassLoader {

    public DynamicClassLoader(URL url) {
        this(new URL[]{url});
        CLoaders.add(this);
    }

    public DynamicClassLoader(URL[] urls) {
        super(urls);
    }
}
