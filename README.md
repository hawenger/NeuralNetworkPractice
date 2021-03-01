# NeuralNetworkPractice

#### Command line Java application building Neural Network & Matrix Library from scratch.
Input is XOR dataset containing 4 samples and tested on 5000 epochs.

![Image of Neural Network Results](https://user-images.githubusercontent.com/63066634/109548155-241a3800-7a81-11eb-8b2e-41c49a2cc26e.PNG)

## Matrix Library

Matrix Library created under Matrix class with functionalities like addition, subtraction, transpose and the multiplication of matrices.
Data is a 2d double array, holding the matrix contents.  The rows and columns object variables hold the number of rows and columns of the matrix.
Sigmoid and its derivative are applied to elements of the matrix.  The derivative of Sigmoid ir neccessary for calculation of gradients for backpropagation.

## Neural Network

The NeuralNetwork class contains contains weights and bias matrix variable for different layers as well as the learning rate. IT contains all neccessary
functions for the Forward Pass in order to generate a prediction. The necessary error for backpropigation occurs inside the train function.  The train function is
iterated over according to the # of epochs in the fit function with random datapoints from the dataset.

