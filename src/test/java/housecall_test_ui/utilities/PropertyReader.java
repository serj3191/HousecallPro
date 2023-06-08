package housecall_test_ui.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private static Properties properties = new Properties();
    static {
        String path = "app.properties";
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("problem with opening properties file");
        }
        try {
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("problem with loading from properties file");
        }

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
