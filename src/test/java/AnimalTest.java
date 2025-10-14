import com.codecool.animal.Animal;
import com.codecool.animal.Lion;
import com.codecool.animal.Parrot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    void testConstructor_SetsNameAgeAndHealthCorrectly() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Leo", 2, 90);

        // Assert
        assertEquals("Leo", lion.getName());
        assertEquals(2, lion.getAge());
        assertEquals(90, lion.getHealth());
    }


}
