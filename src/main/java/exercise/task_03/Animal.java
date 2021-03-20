package exercise.task_03;

/**
 * W bazie danych przechowywany jest obiekt Animal, który posiada:
 *
 * id,
 * type,
 * name.
 *
 * Z wykorzystaniem biblioteki Mockito przetestuj następujące działania
 * (zaimplementuj klasy Animal, AnimalService, AnimalRepository)
 *
 * a.Pobieranie obiektu Animal po Id oraz Type
 * b.Tworzenie nowego obiektu Animal.
 *
 * Rzucenie wyjątku,jeśli w bazie nie zostanie znaleziony Animal o podanym Id
 */

public class Animal {

    private Long Id;
    private String type;
    private String name;

    public Animal(Long id, String type, String name) {
        Id = id;
        this.type = type;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Id=" + Id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (Id != null ? !Id.equals(animal.Id) : animal.Id != null) return false;
        if (type != null ? !type.equals(animal.type) : animal.type != null) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
