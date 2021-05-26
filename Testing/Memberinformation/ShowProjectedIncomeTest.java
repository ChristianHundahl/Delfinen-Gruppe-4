package Memberinformation;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ShowProjectedIncomeTest {

    @Test
    void showProjectedIncome() {

        //ARRANGE
        File testFile = new File("resources/Members.csv");

        //ACT
        showProjectedIncome();
        //ASSERT
    }
}