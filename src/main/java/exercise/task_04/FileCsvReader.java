package exercise.task_04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class FileCsvReader implements CsvReader {

    @Override
    public List<String> readCvs(Path path) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
