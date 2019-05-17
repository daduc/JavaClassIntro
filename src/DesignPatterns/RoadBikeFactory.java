package DesignPatterns;

public class RoadBikeFactory extends AbstractBikeFactory {
    BikeFrameInterface createFrame() {
        return new RoadFrame();
    }

    BikeSeatInterface createSeat() {
        return new RoadSeat();

    }

    BikePaintInterface getPaintForBike(){
        return new RoadColor();

}
}