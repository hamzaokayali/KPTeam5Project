package com.team5.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    static Properties properties;

    static {

        String path = "C:\\Users\\Yazilim\\git\\techproedsummer2020turkish2_2\\KPTeam5Project\\configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public static String getProperty(String key){
        //properties.getProperty("username");
        return properties.getProperty(key);
    }
}
