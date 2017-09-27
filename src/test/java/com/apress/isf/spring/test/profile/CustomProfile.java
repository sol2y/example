
package com.apress.isf.spring.test.profile;

public class CustomProfile implements ProfileValueSource {

    public String get(String key) {
        if (key.equals("environment"))
            return "dev";
        else if (key.equals("os.name"))
            return "Unix";
        return null;
    }

}