package FileHandler;

import Memberinformation.Member;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void isUserAlreadyInFile() throws FileNotFoundException {
        //Arrange
        FileManager fm = new FileManager();
        Member m1 = new Member("Bob",18);

        //Act
        Boolean name = fm.isUserAlreadyInFile(m1);

        //Assert
        assertEquals(true,name);
    }
}