/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;
import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//uncomment when test needed
// tests for task1
    // @Test
    // void Task1ReturnsZeroForEmptyElementList() {
    //     // Arrange
    //     SimpleFunctions funcs = new SimpleFunctions();
    //     List<Integer> a = new ArrayList<>();
    //     List<Integer> b = Arrays.asList(0, 1, 2);
    //     int expected = 0;

    //     // Act
    //     int result = funcs.Task1(a, b);

    //     // Assert
    //     assertEquals(expected, result, "Task1 should return 0 when the element list is empty.");
    // }

    // @Test
    // void Task1HandlesNegativeIndexes() {
    //     // Arrange
    //     SimpleFunctions funcs = new SimpleFunctions();
    //     List<Integer> a = Arrays.asList(5, 10, 15);
    //     List<Integer> b = Arrays.asList(-1, 0, 1);
    //     int expected = 5 + 10;  // Index -1 is out-of-range and should be ignored

    //     // Act
    //     int result = funcs.Task1(a, b);

    //     // Assert
    //     assertEquals(expected, result, "Task1 should ignore negative indexes.");
    // }

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Tests for Task 3
    @Test
    public void Task3ValidNestedParentheses() {
        // Arrange
        SimpleFunctions funcs = new SimpleFunctions();
        String input = "()(((()(())())))()";
        boolean T_expected = true;
        // Act
        boolean result = funcs.Task3(input);
        // Assert
        assertEquals(T_expected, result);
    }

    @Test
    public void Task3InvalidNestedParentheses() {
        // Arrange
        SimpleFunctions funcs = new SimpleFunctions();
        String input = "(((()(())))))))(";
        boolean F_expected = false;
        // Act
        boolean result = funcs.Task3(input);
        // Assert
        assertEquals(F_expected, result);
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //tests for Task4
    @Test void Task4CreatesListOfIntegerMultiples() {
        // Arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<Integer> dataA = List.of(8, 5, 1, 10);
        List<Integer> dataB = List.of(5, 1, 2, 9);
        List<Integer> expected = List.of(72, 10, 1, 50);
        // Act
        List<Integer> result = funcs.Task4(dataA, dataB);
        // Assert
        assertEquals(expected, result);
        
    }

    @Test void Task4ReturnsNullForUnequalListLength() {
        // Arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<Integer> dataA = List.of(5, 3, 20, 4);
        List<Integer> dataB = List.of(14, 2, 9);
        // Act
        List<Integer> result = funcs.Task4(dataA, dataB);
        // Assert
        assertNull(result);

    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // tests for task5

    @Test void Task5sortedListBoolTest(){
        //arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<Integer> list = List.of(123, 154, 234, 234, 343);
        Boolean expected = true;

        //act
        Boolean result = funcs.Task5(list);
        //assert
        assertEquals(expected, result);
    }
    @Test void Task5unsortedListBoolTest(){
        //arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<Integer> list = List.of(154, 343, 123, 234, 234);
        Boolean expected = false;
        //act
        Boolean result = funcs.Task5(list);
        //assert
        assertEquals(expected, result);
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // tests for Task6
    @Test 
    void Task6ReturnsEmptyListForEmptyInput() {
        // arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        // act
        List<Integer> result = funcs.Task6(input);
        // assert
        assertEquals(expected, result);
    }
        @Test 
    void Task6ReturnsCorrectRoundedNumbers() {
        // arrange
        SimpleFunctions funcs = new SimpleFunctions();
        List<Integer> input = List.of(154, 343, 123, 234, 234);
        List<Integer> expected = List.of(200, 400, 200, 300, 300);
        // act
        List<Integer> result = funcs.Task6(input);
        // assert
        assertEquals(expected, result);
    }
   // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}