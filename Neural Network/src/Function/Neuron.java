package Function;

public class Neuron {
    public double BIAS = 1.0;
    public double LearningRate = 1.0;


    public double[] getWeight(int[][] inputSequence){
        double[] Weight = {};
        while(Weight.length != inputSequence.length){
            Weight = setWeight(Weight);
        }
        return Weight;
    }

    public double[] setWeight(double[] Weight){
        double[] newWeight = new double[Weight.length+1];
        for(int i=0; i< newWeight.length-1; i++){
            newWeight[i] = Weight[i];
        }
        newWeight[Weight.length] = Math.random();
        return newWeight;
    }

    public double singleNeuron(int[][] inputSequence) {
        double calculation;
        MathMatrix callMatrix = new MathMatrix();
        calculation = callMatrix.sum(inputSequence,getWeight(inputSequence));
        return calculation;
    }
}
