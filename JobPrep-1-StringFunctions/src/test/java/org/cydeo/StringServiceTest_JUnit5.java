package org.cydeo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringServiceTest_JUnit5 {

    @BeforeAll
    static void startTest(){
        System.out.println("Let's the testing begin ----------------");
    }
    @AfterAll
    static void endTest(){
        System.out.println("Let's the test end ----------------------");
    }

    @Test
    void palidtomeValidation() {
        assertEquals(true, StringService.palidtomeValidation("Do geese see God"));
        System.out.println("Done with palidtomeValidation test");
    }

    @ParameterizedTest
    @CsvSource({ "'abc', 'cba', true",
            "'abc', 'cbaa', false",
            "'anagram', 'nagaram', true"})
    void anagramValidate(String s1, String s2, boolean result) {
        assertEquals(result, StringService.anagramValidate(s1,s2));
        System.out.println("Done with anagramValidate test of " + s1);
    }
}