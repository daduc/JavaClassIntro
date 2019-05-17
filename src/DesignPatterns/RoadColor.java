package DesignPatterns;

import java.util.Random;

public class RoadColor implements BikePaintInterface {
    @Override
    public String getPaintForBike() {
        String[] colors = {
                "black Banana", "blue Dolphin", "pink Apple", "yellow Kiwi"};
        Random r = new Random();
        int randomNumber = r.nextInt(colors.length);
        return colors[randomNumber];
    }
}
