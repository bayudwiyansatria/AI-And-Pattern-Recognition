package Function;

public class Activation {
    public double STEP(){
        return 0;
    }

    public double SIGN(){
        return 0;
    }

    public double SIGMOID(double x){
        return 1/(1+(-(Math.exp(x))));
    }

    public double IdentityFuntion(){
        return 0;
    }
}
