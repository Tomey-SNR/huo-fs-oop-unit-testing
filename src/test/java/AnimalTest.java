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

    @Test
    void testParrotConstructor() {
        Animal parrot = new Parrot("Parrot", 5, 80);

        assertEquals("Parrot", parrot.getName());
        assertEquals(5, parrot.getAge());
        assertEquals(80, parrot.getHealth());
    }

    @Test
    void testConstructor_NullName() {
        Animal lion = new Lion(null, 2, 90);

        assertEquals("Unnamed", lion.getName());
    }

    @Test
    void testConstructor_EmptyName() {
        Animal lion = new Lion("", 2, 90);

        assertEquals("Unnamed", lion.getName());
    }

    @Test
    void testConstructor_WhitespaceName() {
        Animal lion = new Lion("  ", 3, 90);

        assertEquals("Unnamed", lion.getName());
    }

    @Test
    void testConstructor_NegativeAge() {
        Animal lion = new Lion("Leo", -5, 80);

        assertEquals(0, lion.getAge());
    }

    @Test
    void testConstructor_NegativeHealth() {
        Animal lion = new Lion("Leo", 5, -20);

        assertEquals(0, lion.getHealth());
    }

    @Test
    void testConstructor_HealthAbove100() {
        Animal lion = new Lion("Leo", 5, 170);

        assertEquals(100, lion.getHealth());
    }
}
