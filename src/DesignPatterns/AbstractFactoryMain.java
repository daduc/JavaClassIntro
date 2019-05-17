package DesignPatterns;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.GetSeatPart());

        //do the same for mountain Bike
        //And set up a nicely working factory

        AbstractBikeFactory factory1 = new MountainBikeFactory();
        BikeFrameInterface frame1 = factory1.createFrame();
        BikeSeatInterface seat1 = factory1.createSeat();
        System.out.println(frame1.getFrameParts());
        System.out.println(seat1.GetSeatPart());

        //AbstractBikeFactory kidBike = new KidBikeFactory();
        AbstractBikeFactory kids = new KidBikeFactory();
        BikeFrameInterface frame2 = kids.createFrame();
        BikeSeatInterface seat2 = kids.createSeat();
        System.out.println(frame2.getFrameParts());
        System.out.println(seat2.GetSeatPart());
        }

    }

