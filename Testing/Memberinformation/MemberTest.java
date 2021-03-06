package Memberinformation;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

class MemberTest {//@Christian
    Membership testMembership = new Senior("senior", 1600);
    Member testMember = new Member("Bob", 59);
    Member testMember2 = new Member("Rob", 61);

    MemberTest() throws FileNotFoundException {
    }

    @Test
    void getMembershipFee() throws FileNotFoundException { //@Christian
        //ARRANGE
        testMember.setActivity(testMembership);
        testMember2.setActivity(testMembership);

        //ACT
        double actual = testMember.getMembershipFee();
        double expectedNoDiscount = 1600;

        double actual2 = testMember2.getMembershipFee();
        double expectedDiscount = 1200;

        //ASSERT
        assertEquals(expectedNoDiscount, actual);
        assertEquals(expectedDiscount, actual2);
    }

    @Test
    void showProtectedIncomeTest() throws FileNotFoundException {
        testMember.showProjectedIncome();
    }
}