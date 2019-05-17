package DesignPatterns;

import java.util.Random;

public class MountainColor implements BikePaintInterface {
    @Override
    public String getPaintForBike() {
         String[] colors = {
                "strawberry Banana", "blue Raspberry", "green Apple", "yellow Kiwi"};
        Random r = new Random();
        int randomNumber = r.nextInt(colors.length);
        return colors[randomNumber];
    }
}
