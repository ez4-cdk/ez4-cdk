import com.softwareClass.SplashClass;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SplashClassTest {
    @Test
    public void testGenerateExercises(){
        try {
            SplashClass.main(new String[]{"Myapp.exe","-n","10000","-r","10"});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testCheckAnswer(){
        try {
            SplashClass.main(new String[]{"Myapp.exe","-e","Exercises.txt","-a","Answer.txt"});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
