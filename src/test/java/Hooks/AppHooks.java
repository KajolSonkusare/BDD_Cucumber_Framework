package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class AppHooks
{

    @Before
    public void openBrowser() throws IOException
    {
        System.out.println("----open browser----");
        String browser= UtilityClass.getPFData("browserName");  //get browser name from property file
        DriverFactory.initializeBrowser(browser);                    //pass browser Name to initializeBrowser() method
    }

    @After
    public void closeBrowser()
    {
        System.out.println("----close browser------");
        DriverFactory.driver.quit();     //diffClassName.variableNameOrobjectName
    }
}





    //@Before(order = 1)
    // public void beforeHook1() {
    //    System.out.println("-----running before Hook with order=1------");
    //}

    //@Before(order = 2)
    //public void beforeHook2() {
    //  System.out.println("-----running before Hook with order=2-----");
    //}

    //@After(order=1)
    //public void afterHook1()
    //{
    //  System.out.println("---running after Hook with order=1------");
    //}

    //@After(order=2)
    //public void afterHook2()
    //{
    //  System.out.println("----running after Hook with order=2-----");
    //}
//}




    // @BeforeStep
    //public void beforestep()
    //{
    //  System.out.println("--before  step---");
    //}
    //@AfterStep
    //public void afterstep()
    //{
    //   System.out.println("--after step--");
    // }




