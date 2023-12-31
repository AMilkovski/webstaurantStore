package webstaurantStore.baseURL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import webstaurantStore.Utilities.ConfigurationReader;
import webstaurantStore.Utilities.Driver;

public abstract class HomepageUrl {

    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get(ConfigurationReader.getProperty("baseURL"));



    }

    @AfterClass
    public void teardown(){
        Driver.getDriver().close();
    }


}
