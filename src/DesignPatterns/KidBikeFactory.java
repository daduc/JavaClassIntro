package DesignPatterns;

public class KidBikeFactory extends AbstractBikeFactory{
    BikeFrameInterface createFrame(){
        return new KidFrame();
    }
    BikeSeatInterface createSeat(){
        return new KidBikeSeat();
    }

    BikePaintInterface getPaintForBike() {
        return new KidBikeColor();
    }
}



