package exercise.task_04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Napisz metodę wczytującą plik csv i zliczającą ilość zawartych w nim słów.
 * Następnie stwórz testy wczytywania pliku,
 * metody zliczania znaków oraz wyjątków przypadku podania błędnego pliku lub formatu.
 *
 */

public class FileLoader {

    private CsvReader csvReader;

    public FileLoader(CsvReader csvReader) {
        this.csvReader = csvReader;
    }

    public Long countWords(Path path) {
        return csvReader.readCvs(path)
                .stream().flatMap(l -> Stream.of(l.split(",")))
                .count();
    }


    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\exercise\\task_04\\words.csv");
        List<String> lines = Files.readAllLines(path);
        System.out.println(lines);
        System.out.println(lines.stream().flatMap(l -> Stream.of(l.split(","))).count());
    }


}
