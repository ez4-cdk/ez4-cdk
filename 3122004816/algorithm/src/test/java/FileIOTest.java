import com.softwareClass.util.FileIO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileIOTest {

    private Path tempFile;

    @BeforeEach
    void setUp() throws IOException {
        // 创建一个临时文件用于测试
        tempFile = Files.createTempFile("testfile", ".txt");
    }

    @AfterEach
    void tearDown() throws IOException {
        // 删除临时文件
        Files.deleteIfExists(tempFile);
    }

    @Test
    void testWriteOutput() throws IOException {
        String content = "Hello, world!";

        // 写入内容到临时文件
        FileIO.writeOutput(tempFile.toString(), content);

        // 读取文件内容
        String readContent = FileIO.readFile(tempFile.toString());

        assertTrue(readContent.contains(content), "文件内容应该包含写入的字符串");
    }

    @Test
    void testReadFile() throws IOException {
        String content = "This is a test file.";

        // 先写入内容
        FileIO.writeOutput(tempFile.toString(), content);

        // 读取文件内容
        String readContent = FileIO.readFile(tempFile.toString());

        assertEquals(content + System.lineSeparator(), readContent, "读取的内容应该与写入的内容相同");
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> {
            FileIO.readFile("non_existent_file.txt");
        }, "读取不存在的文件应该抛出 IOException");
    }

    @Test
    void testWriteToNewFile() throws IOException {
        String newFilePath = "new_test_file.txt";
        String content = "Writing to a new file.";

        // 写入内容到新文件
        FileIO.writeOutput(newFilePath, content);

        // 验证文件是否被创建并且内容正确
        String readContent = FileIO.readFile(newFilePath);
        assertEquals(content + System.lineSeparator(), readContent, "新文件内容应该与写入的内容相同");

        // 清理新创建的文件
        Files.deleteIfExists(Paths.get(newFilePath));
    }
}
