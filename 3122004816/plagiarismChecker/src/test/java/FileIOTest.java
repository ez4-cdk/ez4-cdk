import com.softwareClass.util.fileIO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileIOTest {

    private String testFilePath;

    @BeforeEach
    public void setUp() {
        // 设置测试文件路径
        testFilePath = "C:\\Users\\11298\\Desktop\\3122004816\\plagiarismChecker\\src\\test\\java\\res\\test\\answer\\testFile.txt";
    }

    @AfterEach
    public void tearDown() throws IOException {
        // 删除测试文件以保持环境干净
        Files.deleteIfExists(Paths.get(testFilePath));
    }

    @Test
    public void testReadFile_existingFile() throws IOException {
        // 创建一个测试文件并写入内容
        String content = "Hello, World!";
        Files.writeString(Paths.get(testFilePath), content);

        // 调用 readFile 方法
        String result = fileIO.readFile(testFilePath);

        // 验证结果是否匹配
        assertEquals(content, result);
    }

    @Test
    public void testReadFile_nonExistingFile() {
        // 测试读取一个不存在的文件
        String nonExistingFilePath = "non_existing_file.txt";

        // 验证抛出 IOException
        assertThrows(IOException.class, () -> fileIO.readFile(nonExistingFilePath));
    }

    @Test
    public void testWriteOutput_createsNewFile() throws IOException {
        // 要写入的内容
        double valueToWrite = 123.45678;

        // 调用 writeOutput 方法
        fileIO.writeOutput(testFilePath, valueToWrite);

        // 验证文件被创建且内容正确
        String content = Files.readString(Paths.get(testFilePath));
        assertEquals("123.46", content); // 保留两位小数
    }

    @Test
    public void testWriteOutput_overwritesExistingFile() throws IOException {
        // 首次写入
        fileIO.writeOutput(testFilePath, 123.45678);

        // 再次写入不同的内容
        fileIO.writeOutput(testFilePath, 987.65432);

        // 验证文件内容已被覆盖
        String content = Files.readString(Paths.get(testFilePath));
        assertEquals("987.65", content); // 确保保留了两位小数
    }

}

