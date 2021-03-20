package exercise.task_04;

import java.nio.file.Path;
import java.util.List;

public interface CsvReader {

    List<String> readCvs(Path path);

}
