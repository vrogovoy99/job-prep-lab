package org.cydeo;


import java.util.Arrays;

public class JobPrep1 {

    public static void main(String[] args) {

        System.out.println(" Anagram validation --------------------------");

        String[][] anagramTestCases = {
                {"abc", "cba", "TRUE"},
                {"abc", "cbaa", "FALSE"},
                {"anagram", "nagaram", "TRUE"}
        };

        Arrays.stream(anagramTestCases).map(anagramTestCase -> "Is " + anagramTestCase[0] +
                " anagram of " + anagramTestCase[1] +
                "? expected " + anagramTestCase[2] + " : " +
                StringService.anagramValidate(anagramTestCase[0], anagramTestCase[1])).forEach(System.out::println);


        System.out.println(" Palidtome validation --------------------------");
        String[][] palidtomeTestCases = {
                {"Do geese see God", "TRUE"},
                {"Do gees see God", "TRUE"},
                {"Do geea see God", "FALSE"},
                {"Do geesee see God", "TRUE"},
                {"Do geesea see God", "FALSE"},
                {"Was it a car or a cat I saw", "TRUE"},
                {"A brown fox jumping over", "FALSE"}
        };

        Arrays.stream(palidtomeTestCases).map(palidtomeTestCase -> "Is " + palidtomeTestCase[0] +
                " a palidtome? expected " + palidtomeTestCase[1] + " : " +
                StringService.palidtomeValidation(palidtomeTestCase[0])).forEach(System.out::println);



    }

}
