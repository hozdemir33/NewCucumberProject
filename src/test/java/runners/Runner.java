package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //we need two options  ==Path of the feature file FOLDER
        //  AND   ==NAME FOR THE stepDefinitions---path for both

        features = "C://Users//hozde//IdeaProjects//NewCucumberProject//src//test//resources//features",
        glue = "stepDefinitions",
        tags="@Admin_creation",
        dryRun=false

        // no browser will run, it will find the missing steps
        //if there is any missing step definitions / dry run can be true or false
        //Working in progress (wip) and /or can be used==false-browser true--no browser

)
public class Runner{
}
