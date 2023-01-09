package testPage742;

import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;
 
public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties properties  = new Properties();
//        InputStream is = new FileInputStream(new File(PropertiesExample.class.getResource("database.properties").getPath()));
        URL path = new PropertiesExample().getClass().getResource("database.properties");
//        path = URLDecoder.decode(path, "utf-8"); // 경로에 한글이 있는 경우 한글을 복원
//        properties.load(path);
//        is.close();
        
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password"); 
        
        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}

