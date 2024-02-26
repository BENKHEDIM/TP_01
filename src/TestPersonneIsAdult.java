import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestPersonneIsAdult {

    @Test
    public void isAdultShouldEturnTrueIfAgeSupOrEquTo18() {
        Personne p = new Personne("Abdesslem", "Benkhedim", 22);
        boolean result = p.isAdult();
        Assertions.assertTrue(result);
    }

    @Test
    public void isAdultShouldEturnTrueIfAgeInfTo18() {
        Personne p = new Personne("Dhia", "Benamar", 5);
        boolean result = p.isAdult();
        Assertions.assertFalse(result);
    }

}
