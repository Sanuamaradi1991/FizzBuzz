package com.example.test.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FizzBuzzApplicationTests {

       @Test
       public void testFizzBuzz() {
    	   assertEquals("Divided 23 by 3" + '\n' + "Divided 23 by 5", fizzBuzz("23"));
           assertEquals("Fizz", fizzBuzz("3"));
           assertEquals("Buzz", fizzBuzz("5"));
           assertEquals("FizzBuzz", fizzBuzz("30"));
           assertEquals("Divided 4 by 3" + '\n' + "Divided 4 by 5", fizzBuzz("4"));
             
           String expectedMessage = "Invalid Item";
           String expectedMessageForEmpty = "Invalid Item";
           String expectedMessageForNonNumeric = "Invalid Item";

             assertEquals(expectedMessageForEmpty, isNumeric(""));
             assertEquals(expectedMessage, isNumeric("A"));
             assertEquals(expectedMessageForNonNumeric, isNumeric("@"));           


       }            
       
       public String fizzBuzz(String input) {
             boolean multipleOfThree;
             boolean multipleOfFive;
             
             multipleOfThree = Integer.valueOf(input)%3==0 ? true: false;
             multipleOfFive = Integer.valueOf(input)%5==0 ? true: false;

             String expectedOutcome = "";                         
             
             isNumeric(input);         

             if(multipleOfThree && !multipleOfFive){
            expectedOutcome="Fizz";
        }           
             if(multipleOfFive && !multipleOfThree) {                   
                  expectedOutcome="Buzz";
             }     
             else if(multipleOfThree && multipleOfFive){
               expectedOutcome="FizzBuzz";       
           }        
             else if (!multipleOfThree && !multipleOfFive){                                           
                    expectedOutcome = "Divided " +input + " by 3"  + '\n' + "Divided " +input + " by 5";
             }
             
           return expectedOutcome;
       }
       
       public String isNumeric(String input) throws NumberFormatException {
             String exception = "Invalid Item";
             try{
                    Integer.parseInt(input);
             }            
             catch(Exception e){ 
                    e.getLocalizedMessage();
             }
             return exception;
       }             
}

