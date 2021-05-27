package Memberinformation;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest2 {

    @Test
    void showProjectedIncome() throws FileNotFoundException {
        Member testMember = new Member();
        testMember.showProjectedIncome();
    }
}