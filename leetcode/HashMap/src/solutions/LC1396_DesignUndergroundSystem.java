package solutions;

import java.util.Arrays;
import java.util.HashMap;

public class LC1396_DesignUndergroundSystem {
    public static void main(String[] args){
        UndergroundSystem obj = new UndergroundSystem();
//        obj.checkIn(10,"leyton", 3);
//        obj.checkOut(10,"paradise" , 8);
//        System.out.println(obj.getAverageTime("leyton" , "paradise"));
//        obj.checkIn(5 , "leyton" , 10);
//        obj.checkOut(5 , "paradise" , 16);
//        System.out.println(obj.getAverageTime("leyton" , "paradise"));
//        obj.checkIn(2, "Leyton", 21);
//        obj.checkOut(2, "Paradise", 30);
//        System.out.println(obj.getAverageTime("leyton" , "paradise"));


//        obj.checkIn(45, "Leyton", 3);
//        obj.checkIn(32, "Paradise", 8);
//        obj.checkIn(27, "Leyton", 10);
//        obj.checkOut(45, "Waterloo", 15);  // Customer 45 "Leyton" -> "Waterloo" in 15-3 = 12
//        obj.checkOut(27, "Waterloo", 20);  // Customer 27 "Leyton" -> "Waterloo" in 20-10 = 10
//        obj.checkOut(32, "Cambridge", 22); // Customer 32 "Paradise" -> "Cambridge" in 22-8 = 14
//        System.out.println(obj.getAverageTime("Paradise", "Cambridge")); // return 14.00000. One trip "Paradise" -> "Cambridge", (14) / 1 = 14
//        System.out.println(obj.getAverageTime("Leyton", "Waterloo"));    // return 11.00000. Two trips "Leyton" -> "Waterloo", (10 + 12) / 2 = 11
//        obj.checkIn(10, "Leyton", 24);
//        System.out.println(obj.getAverageTime("Leyton", "Waterloo"));    // return 11.00000
//        obj.checkOut(10, "Waterloo", 38);  // Customer 10 "Leyton" -> "Waterloo" in 38-24 = 14
//        System.out.println(obj.getAverageTime("Leyton", "Waterloo"));    // return 12.00000. Three trips "Leyton" -> "Waterloo", (10 + 12 + 14) / 3 = 12

        obj.checkIn(880754,"ZX5B4CTZ",83);
        obj.checkOut(880754,"6OAM89OZ",149);
        obj.checkIn(998735,"W3R9AY6I",216);
        obj.checkOut(998735,"6OAM89OZ",263);
        obj.checkIn(581332,"W3R9AY6I",326);
        obj.checkIn(362890,"W3R9AY6I",385);
        obj.checkOut(581332,"6OAM89OZ",397);
        obj.checkIn(34036,"ZX5B4CTZ",400);
        obj.checkOut(34036,"6OAM89OZ",415);
        obj.checkIn(362890,"6OAM89OZ",437);
        obj.getAverageTime("W3R9AY6I","6OAM89OZ");
        obj.checkIn(998200,"W3R9AY6I",520);
        obj.checkIn(476790,"ZX5B4CTZ",581);
        obj.getAverageTime("ZX5B4CTZ","6OAM89OZ");
        obj.checkIn(360021,"W3R9AY6I",615);
        obj.getAverageTime("W3R9AY6I","6OAM89OZ");
        obj.checkOut(360021,"6OAM89OZ",644);
        obj.getAverageTime("ZX5B4CTZ","6OAM89OZ");


    }
}

class UndergroundSystem {

    private int checkInTime = 0;
    private int checkOutTime = 0;
    private double averageTime = 0;
    private int userId;
    private String checkInStation;
    private String checkOutStation;


    // there should be 2 hashmaps
    // 1 to store user and thier time
    // 2 station and thier time
    private final HashMap<Integer , Double> userIdAndTimeDiff = new HashMap<>();
    private final HashMap<String , String>  startStationAndEndStation = new HashMap<>();
    private final HashMap<String[] , Integer> numberOfTimesTripWasMade = new HashMap<>();
    private final HashMap<String[] , Double> EachTripAndTimeTaken =  new HashMap<>();
    private final HashMap<Integer , String> userAndCheckInStation = new HashMap<>();

    public UndergroundSystem() {
        this.checkInTime = 0;
        this.checkOutTime = 0;
        this.averageTime = 0;
        this.userId = 0;
        this.checkOutStation = null;
        this.checkInStation = null;
    }

    public void checkIn(int id, String stationName, int t) {
        this.checkInStation = stationName.toLowerCase();
        this.userId = id;
        this.checkInTime = t;

        // so when a user checks in we should add the user to the user and time hashmap
        // then add the station the user checked in from into user and station hashmap
        userIdAndTimeDiff.put(userId ,(double) checkInTime);
        userAndCheckInStation.put(userId , this.checkInStation);
    }

    public void checkOut(int id, String stationName, int t) {
        this.checkOutStation = stationName.toLowerCase();
        this.userId = id;
        this.checkOutTime = t;

        double checkInTimeForThisUser = 0;
        double timeDiffForThisUser = 0.0;

        // if this user has check in
        if(userIdAndTimeDiff.containsKey(userId)) {

            // get the start and end station for this user
            startStationAndEndStation.put(userAndCheckInStation.get(userId) , this.checkOutStation);

            // get the check in time for this user
            checkInTimeForThisUser = userIdAndTimeDiff.get(userId);

            // get the time for this user's trip
            timeDiffForThisUser = this.getTimeDifference((int) checkInTimeForThisUser , this.checkOutTime);

            // update the user total time taken for the user's trip
            userIdAndTimeDiff.put(this.userId, timeDiffForThisUser);

            // create a trip array containing the user's checkIn station and checkOut station
            String[] trip = {userAndCheckInStation.get(userId) , this.checkOutStation};

            // if no trip has been taken
            if (EachTripAndTimeTaken.isEmpty() && numberOfTimesTripWasMade.isEmpty()) {
                // add the trip and the total time taken for the trip
                EachTripAndTimeTaken.put(trip, timeDiffForThisUser);
                // add the trip and 1(since this is the first time taking this trip
                numberOfTimesTripWasMade.put(trip, 1);
            }
            // if trips have been made before
            else {
                // then iterate over the hashmap to find the trip that equals this current trip
                for (String[] key : EachTripAndTimeTaken.keySet())
                    // if this trip has not been taken before
                    if (!Arrays.equals(key, trip)) {
                        // then add the trip and the time taken
                        EachTripAndTimeTaken.put(trip, timeDiffForThisUser);
                    }
                    // if the trip has been taken
                    else {
                        // then update the total time to take this trip
                        EachTripAndTimeTaken.put(trip, EachTripAndTimeTaken.get(trip) + timeDiffForThisUser);
                    }
                // then iterate over the hashmap to find the trip that equals this current trip
                for (String[] key : numberOfTimesTripWasMade.keySet())
                    // if this trip has been taken before
                    if (Arrays.equals(key, trip)) {
                        // increment the number of times the trip has been taken
                        numberOfTimesTripWasMade.put(key, numberOfTimesTripWasMade.get(key) + 1);
                        break;
                    }
                    // if the trip has not been taken before
                    else
                        // add 1 (since this is the first time)
                        numberOfTimesTripWasMade.put(trip, 1);

            }
        }

    }

    public double getAverageTime(String startStation, String endStation) {

        // avoiding case constraint
        String initStation = startStation.toLowerCase();
        String finalStation = endStation.toLowerCase();

        // create an array
        String[] key = {initStation , finalStation};

        int noOfTimesTripWasMade = 0;
        double totalTimeForEachTrip = 0;

        // check if this trip (startStation - endStation) has been made
        if(startStationAndEndStation.containsKey(initStation) && startStationAndEndStation.get(initStation).equals(finalStation)) {

            // then get the number of times this trip was made
            for (String[] trip : numberOfTimesTripWasMade.keySet())
                // if the trip has been taken
                if (Arrays.equals(trip, key)) {

                    // get the number of times the trip was taken
                    noOfTimesTripWasMade = numberOfTimesTripWasMade.get(trip);

                    // then get the total time for this trip
                    totalTimeForEachTrip = EachTripAndTimeTaken.get(trip);
                }

            // get the average time
            this.averageTime = totalTimeForEachTrip / noOfTimesTripWasMade;
        }

        return averageTime;
    }

    private double getTimeDifference(int checkInTime , int checkOutTime){
        // ensure the checkIn time is less than the checkOut time
        if (checkInTime > checkOutTime)
            throw new IllegalArgumentException();

        // return time difference
        return checkOutTime - checkInTime;
    }
}