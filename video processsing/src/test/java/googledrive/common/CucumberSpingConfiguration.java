package googledrive.common;


import googledrive.VideoProcesssingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoProcesssingApplication.class })
public class CucumberSpingConfiguration {
    
}
