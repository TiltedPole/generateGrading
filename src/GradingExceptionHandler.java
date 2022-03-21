public class GradingExceptionHandler extends Exception{

    String fm; // fault message (fm)

    public GradingExceptionHandler(String errMessage){
        fm = errMessage;
    }

    public String getFm(){
        return fm;
    }

}
