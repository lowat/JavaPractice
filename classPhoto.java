import java.util.*;

class Program {

    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        return redShirtHeights.get(0) > blueShirtHeights.get(0) ? canTakePhoto(redShirtHeights, blueShirtHeights) :
                canTakePhoto(blueShirtHeights, redShirtHeights);
    }


    public boolean canTakePhoto(ArrayList<Integer> topRow, ArrayList<Integer> bottomRow){
        for(int i = 0; i < topRow.size(); i++){
            if(bottomRow.get(i) >= topRow.get(i)) return false;
        }
        return true;
    }
}