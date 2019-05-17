package DesignPatterns;

public class MountainBikeFactory extends AbstractBikeFactory {
    BikeFrameInterface createFrame(){
        return new MountainFrame();
    }
    BikeSeatInterface createSeat(){
        return new MountainSeat();
    }

    BikePaintInterface getPaintForBike() {
        return new MountainColor();
    }
}
