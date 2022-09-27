import com.sparta.alena.FilmClassifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Test {

    @Test
    @DisplayName(("Given the age of 5 the program should return U, PG & 12 films are available"))
    public void givenTheAgeOf5ReturnsU_PG_12(){
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications(5));
    }

    @ParameterizedTest
    @DisplayName(("Given the age smaller than 12 the program should return U, PG & 12 films are available"))
    @ValueSource(ints = {3, 5, 11})
    public void givenTheAgeSmallerThan_12_Return_U_PG_12(int age){
        var expectedClassification = "U, PG & 12 films are available.";
        var message = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals(expectedClassification, message);
    }

    @Test
    @DisplayName(("Given the age of 12 the program should return U, PG, 12 & 15 films are available."))
    public void GivenTheAgeOf12_returnU_PG_12_15_filmsAreAvailable(){
        Assertions.assertEquals( "U, PG, 12 & 15 films are available.", FilmClassifications.availableClassifications(12));
    }

    @ParameterizedTest
    @DisplayName(("Given the age between 12 and 14 the program should return  U, PG, 12 & 15 films are available."))
    @ValueSource(ints={12, 14})
    public void GivenTheAgeBetween_12_and_14_TheProgramReturns_U_PG_12_15_filmsAvailability(int age){
        var expectedClassification = "U, PG, 12 & 15 films are available.";
        var message = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals(expectedClassification, message);
    }

    @Test
    @DisplayName(("Given the age 15 the program should return All films are available."))
    public void GivenTheAge_15_theProgramReturnsAllFilmsAreAvailable(){
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(15));
    }

    @ParameterizedTest
    @DisplayName(("Given the age bigger than 15 the program should return All films are available."))
    @ValueSource(ints = {15, 18, 90})
    public void GivenTheAgeBiggerThan_15_theProgramReturnsAllFilmsAreAvailable(int age){
        var expectedClassification = "All films are available.";
        var message = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals(expectedClassification, message);
    }
}
