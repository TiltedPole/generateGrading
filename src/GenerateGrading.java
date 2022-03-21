public class GenerateGrading {

    public String generateGrade(int exam, int coursework) throws GradingExceptionHandler{

        int overall;
        String grade;
        String result;

        if((exam < 0 || exam > 75) || (coursework < 0 || coursework > 25 )){
            throw new GradingExceptionHandler("Invalid values, please try again.");
        }
        else
        {
            overall = exam + coursework;

            if(overall >= 70){
                grade = "A";
            }else if(overall >= 50 && overall < 70){
                grade = "B";
            }else if(overall >= 30 && overall < 50){
                grade = "C";
            }else{
                grade = "D";
            }
            result = "Overall mark = " + overall + ", Grade = " + grade;
            System.out.println(result);
            return result;
        }
    }
}
