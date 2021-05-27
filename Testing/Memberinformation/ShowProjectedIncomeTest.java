package Memberinformation;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ShowProjectedIncomeTest {

    @Test
    void showProjectedIncome() throws FileNotFoundException {
        //ARRANGE
        Member testMember = new Member();

        //ACT
        testMember.showProjectedIncome();

        //ASSERT
    }
}