package exercise.task_04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

class FileLoaderTest {

    @Test
    void countWords() {
        //given
        FileLoader fileLoader =
                new FileLoader(path -> Arrays.asList("Piotr, Kotynia, łódź", "Jonna, Kotynia, łódź"));

        //when
        Long result = fileLoader.countWords(null);

        //then
        Assertions.assertThat(result).isEqualTo(6);
    }

}