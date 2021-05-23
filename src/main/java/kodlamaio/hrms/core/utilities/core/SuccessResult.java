package kodlamaio.hrms.core.utilities.core;

public class SuccessResult extends Result {

    public SuccessResult(){
        super(true);
    }

    public SuccessResult(String message) {
        super(true,message);
    }
}
