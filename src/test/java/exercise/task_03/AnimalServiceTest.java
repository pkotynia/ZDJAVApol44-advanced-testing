package exercise.task_03;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class AnimalServiceTest {

    @Mock
    private AnimalRepository repositoryMock;

    @Test
    void shouldReturnExistingAnimal() {
        //given
        AnimalService service = new AnimalService(repositoryMock);
        Animal dog = new Animal(1L, "Dog", "Piżmak");
        Mockito.when(repositoryMock.get(1L)).thenReturn(Optional.of(dog));

        //when
        Animal result = service.getAnimalById(1L);

        //then
        Animal dog1 = new Animal(1L, "Dog", "Piżmak");
        Assertions.assertThat(result).isEqualTo(dog1);
    }

    @Test
    void shouldSaveAnimal() {
        //given
        AnimalService service = new AnimalService(repositoryMock);
        Animal dog = new Animal(1L, "Dog", "Piżmak");

        //when
        service.saveAnimal(dog);

        //then
        Mockito.verify(repositoryMock).add(dog);
    }
}