package Function;

public class MathMatrix {
    Neuron neuron = new Neuron();

    public double sum(int[][] inputSequence,double[] Weight){
        double sum = 0;
        for(int i=0; i<inputSequence.length; i++){
            sum = (neuron.BIAS*Weight[0])+(inputSequence[i][0]*Weight[1])+(inputSequence[i][1]*Weight[2]);
            //System.out.println("SUM = ("+neuron.BIAS+" x "+Weight[0]+") + ("+inputSequence[i][0]+" x "+Weight[1]+") + ("+inputSequence[i][1]+" x "+Weight[2]+") = "+sum);
        }
        return sum;
    }
}
