package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{

    //This method is use to get Test data from Property file
    //need to provide key Name as a input\
    //sAuthor Name: @Sanjay
    public static String getPFData(String key) throws IOException {
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");

        //Open property file
        Properties ProObj=new Properties();
        ProObj.load(file);

        String value= ProObj.getProperty(key);
        return value;


    }
}
