import junit.framework.TestCase;

public class GenerateGradingTest extends TestCase{

    // Test Number: 1
    // Objective: The generated grade is displayed
    // Input(s): Exam mark: 56, Coursework mark: 22
    // Expected Output: Overall mark = 78, Grade = A
    public void testGenerateGrading001(){
        try{
            GenerateGrading testObj = new GenerateGrading();
            assertEquals("Overall mark = 78, Grade = A", testObj.generateGrade(56, 22));
        } catch (GradingExceptionHandler e) {
            fail("Error");
        }
    }

    // Test Number: 2
    // Objective: The generated grade is displayed
    // Input(s): Exam mark: 57, Coursework mark: 10
    // Expected Output: Overall mark = 67, Grade = B
    public void testGenerateGrading002(){
        try{
            GenerateGrading testObj = new GenerateGrading();
            assertEquals("Overall mark = 67, Grade = B", testObj.generateGrade(57, 10));
        } catch (GradingExceptionHandler e) {
            fail("Error");
        }
    }

    // Test Number: 3
    // Objective: The generated grade is displayed
    // Input(s): Exam mark: 32, Coursework mark: 15
    // Expected Output: Overall mark = 47, Grade = C
    public void testGenerateGrading003(){
        try{
            GenerateGrading testObj = new GenerateGrading();
            assertEquals("Overall mark = 47, Grade = C", testObj.generateGrade(32, 15));
        } catch (GradingExceptionHandler e) {
            fail("Error");
        }
    }

    // Test Number: 4
    // Objective: The generated grade is displayed
    // Input(s): Exam mark: 12, Coursework mark: 10
    // Expected Output: Overall mark = 22, Grade = D
    public void testGenerateGrading004(){
        try{
            GenerateGrading testObj = new GenerateGrading();
            assertEquals("Overall mark = 22, Grade = D", testObj.generateGrade(12, 10));
        } catch (GradingExceptionHandler e) {
            fail("Error");
        }
    }

    // Test Number: 5
    // Objective: Error is displayed and user is re-prompted.
    // Input(s): Exam mark: 56, Coursework mark: -12
    // Expected Output: "Invalid values, please try again."
    public void testGenerateGrading005(){
        String actualResult = "";
        GenerateGrading testObj = new GenerateGrading();

        try{
            actualResult = testObj.generateGrade(56, -12);
            fail("No exception.");

        } catch (GradingExceptionHandler e) {
            assertEquals("Invalid values, please try again.", e.getFm());
        }
    }

    // Test Number: 6
    // Objective: Error is displayed and user is re-prompted.
    // Input(s): Exam mark: -50, Coursework mark: 15
    // Expected Output: "Invalid values, please try again."
    public void testGenerateGrading006(){
        String actualResult = "";
        GenerateGrading testObj = new GenerateGrading();

        try{
            actualResult = testObj.generateGrade(-50, 15);
            fail("No exception.");

        } catch (GradingExceptionHandler e) {
            assertEquals("Invalid values, please try again.", e.getFm());
        }
    }

    // Test Number: 7
    // Objective: Error is displayed and user is re-prompted.
    // Input(s): Exam mark: 120, Coursework mark: 15
    // Expected Output: "Invalid values, please try again."
    public void testGenerateGrading007(){
        String actualResult = "";
        GenerateGrading testObj = new GenerateGrading();

        try{
            actualResult = testObj.generateGrade(120, 15);
            fail("No exception.");

        } catch (GradingExceptionHandler e) {
            assertEquals("Invalid values, please try again.", e.getFm());
        }
    }

    // Test Number: 8
    // Objective: Error is displayed and user is re-prompted.
    // Input(s): Exam mark: 66, Coursework mark: 40
    // Expected Output: "Invalid values, please try again."
    public void testGenerateGrading008(){
        String actualResult = "";
        GenerateGrading testObj = new GenerateGrading();

        try{
            actualResult = testObj.generateGrade(66, 40);
            fail("No exception.");

        } catch (GradingExceptionHandler e) {
            assertEquals("Invalid values, please try again.", e.getFm());
        }
    }
}
