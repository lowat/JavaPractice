import java.util.*;

class Program {
    public int[] arrayOfProducts(int[] array) {

        int[] products = new int[array.length];

        int leftRunningProduct = 1;
        for(int i = 0; i < array.length; i++){
            products[i] = leftRunningProduct;
            leftRunningProduct *= array[i];
        }

        int rightRunningProduct = 1;
        for(int i = array.length - 1; i >= 0; i--){
            products[i] *= rightRunningProduct;
            rightRunningProduct *= array[i];
        }
        return products;
    }
}
