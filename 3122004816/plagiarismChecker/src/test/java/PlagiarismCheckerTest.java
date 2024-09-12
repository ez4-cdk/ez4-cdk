
import com.softwareClass.plagiarismChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlagiarismCheckerTest {

    private String origFilePath;
    private String plagiarismFilePath;
    private String outputFilePath;

    @BeforeEach
    public void setUp() throws Exception {
        origFilePath = "C:\\Users\\11298\\Desktop\\3122004816\\plagiarismChecker\\src\\test\\java\\res\\test\\origin\\orig.txt";
        plagiarismFilePath = "C:\\Users\\11298\\Desktop\\3122004816\\plagiarismChecker\\src\\test\\java\\res\\test\\example\\orig_0.8_dis_15.txt";
        outputFilePath = "C:\\Users\\11298\\Desktop\\3122004816\\plagiarismChecker\\src\\test\\java\\res\\test\\answer\\answer.txt";
    }

    @Test
    public void testCheckPlagiarism() throws Exception {
        // 调用 checkPlagiarism 方法
        plagiarismChecker.main(new String[]{origFilePath, plagiarismFilePath, outputFilePath});

        // 读取输出文件内容
        String content = Files.readString(Paths.get(outputFilePath));

        assertEquals(0.90,Double.parseDouble(content),0.10);
    }
}
