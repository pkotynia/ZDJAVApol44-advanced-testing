package exercise.task_03;

import java.util.*;

public class AnimalRepository {

    private Map<Long, Animal> animals = new HashMap<>();

    void add(Animal animal) {
        animals.put(animal.getId(), animal);
    }

    Optional<Animal> get(Long id){
        return Optional.ofNullable(animals.get(id));
    }


}
