package exercise.task_03;

public class AnimalService {

    private AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public Animal getAnimalById(Long id) {
        return repository.get(id).
                orElseThrow(() -> new IllegalArgumentException("Animal not found"));
    }

    public void saveAnimal(Animal animal) {
        repository.add(animal);
    }

}
