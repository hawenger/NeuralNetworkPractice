import java.util.List;

public class Driver {
    static double [][] X= {
            {0,0},
            {1,0},
            {0,1},
            {1,1}
    };
    static double [][] Y= {
            {0},{1},{1},{0}
    };

    public static void main(String[] args) {

        NeuralNetwork nn = new NeuralNetwork(2,10,1);


        List<Double>output;

        nn.fit(X, Y, 50000);
        double [][] input = {
                {0,0},{0,1},{1,0},{1,1}
        };
        for(double d[]:input)
        {
            output = nn.predict(d);
            System.out.println(output.toString());
        }

    }
}

//src https://towardsdatascience.com/understanding-and-implementing-neural-networks-in-java-from-scratch-61421bb6352c
