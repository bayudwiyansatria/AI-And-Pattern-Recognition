import Function.NeuralNetwork;
import Function.Neuron;

public class Main {
    public int[] AND = {0,0,0,1};
    public int[] OR = {0,1,1,1};
    public int[] ANDNOT = {0,0,1,0};
    public int[] XOR = {0,1,1,0};

    public static void main(String[] args){
        int[][] inputSequence = { {0,0}, {0,1}, {1,0}, {1,1} };
        int iteration = 100;
        NeuralNetwork neuralNetwork = new NeuralNetwork();
        Main target = new Main();
        neuralNetwork.getError(inputSequence, target.AND, iteration);
    }
}
