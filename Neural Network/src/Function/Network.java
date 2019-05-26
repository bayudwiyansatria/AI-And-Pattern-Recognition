package Function;

public class Network {
    Neuron neuron = new Neuron();
    public double ErrorRate(int[][] inputSequence, int[] target, int iteration){
        double Error = 0;
        int epoch = 0;
        for (int i =0; i<iteration; i++){
            for (int j = 0; j < target.length; i++) {
                Error = target[j] - neuron.singleNeuron(inputSequence);
            }
            epoch++;
            System.out.println(epoch);
        }
        return Error;
    }
}
