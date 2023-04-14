import java.util.*;

class Program {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        return calcTandemSpeed(redShirtSpeeds, blueShirtSpeeds, fastest);
    }

    public int calcTandemSpeed(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean maxSpeed){
        int indexA = 0;
        int deltaA = 1;
        int indexB = maxSpeed ? redShirtSpeeds.length - 1 : 0;
        int deltaB = maxSpeed ? -1 : 1;
        int tandemSpeed = 0;
        while(validIndices(indexA, indexB, redShirtSpeeds.length)){
            tandemSpeed += Math.max(redShirtSpeeds[indexA],blueShirtSpeeds[indexB]);
            indexA += deltaA;
            indexB += deltaB;
        }
        return tandemSpeed;
    }

    public boolean validIndices(int indexA, int indexB, int listSize){
        return (indexA >= 0 && indexB >= 0 && indexA < listSize && indexB < listSize);
    }
}
