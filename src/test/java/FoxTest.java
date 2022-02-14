import com.sun.xml.internal.ws.api.message.Packet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FoxTest extends TestBase {

    @Parameters({"link1"})
    @Test
    public void foxTest(String url){

       WebDriver d=  TestBase.setDriver();
        d.get(url);


       LogEntries logs= d.manage().logs().get(LogType.BROWSER);

       for (LogEntry log:logs){
           System.out.println(log);
       }


    }

    @Parameters({"link1"})
    @Test
    public void foxTest1(String url){

        WebDriver d=  TestBase.setDriver();
        d.get(url);


        LogEntries logs= d.manage().logs().get(LogType.BROWSER);

        for (LogEntry log:logs){
            System.out.println(log);
        }


    }
}
