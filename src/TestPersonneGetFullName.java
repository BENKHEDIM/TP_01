import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPersonneGetFullName {

    @Test
    public void ShouldReturnFirstNameFollowedByLastNameSeparatedByASpace() {
        Personne p = new Personne("Abdesslem", "Benkhedim", 22);
        String result = p.getFullName();
        Assertions.assertEquals("Abdesslem Benkhedim", result);
    }

}
