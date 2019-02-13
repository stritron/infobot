package ru.usefulcity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by yuri on 07.12.18.
 */
public class BotSettings {
    public static final String PATH_TO_PROPERTIES = "resources/botconfig.properties";
    public static String BOT_USERNAME;
    public static String BOT_TOKEN;

    static {
        try (FileInputStream fileInputStream = new FileInputStream(PATH_TO_PROPERTIES)) {
            Properties prop = new Properties();
            prop.load(fileInputStream);

            BOT_USERNAME = prop.getProperty("BOT_USERNAME");
            BOT_TOKEN = prop.getProperty("BOT_TOKEN");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
