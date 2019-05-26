package Function;

public class NeuralNetwork {
    Neuron neuron = new Neuron();
    Network network = new Network();

    public double getError(int[][] inputSequence, int[] target, int iteration){
        double responseNeuron;
        double responseNetwork;
        responseNeuron = neuron.singleNeuron(inputSequence);
        responseNetwork = network.ErrorRate(inputSequence, target, iteration);
        return 1;
    }
}
