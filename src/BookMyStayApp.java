public class BookMyStayApp {

    public static void main(String[] args) {


        System.out.println("===== Book My Stay App =====");

        /* --------------------------
           Use Case 4: Room Search
           -------------------------- */

        Room singleRoom = new SingleRoom();

        Room single = new SingleRoom();
 develop
        Room doubleRoom = new DoubleRoom();


        RoomInventory inventory = new RoomInventory();
        RoomSearchService searchService = new RoomSearchService();

        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );

        

        System.out.println("\nBooking Request Queue:");

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Double");
        Reservation r3 = new Reservation("Vanmathi", "Suite");

        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        while (bookingQueue.hasPendingRequests()) {

            Reservation request = bookingQueue.getNextRequest();

            System.out.println(
                    request.getGuestName() +
                            " requested " +
                            request.getRoomType() +
                            " room"
            );
        }

        int singleAvailable = 5;
        int doubleAvailable = 3;

        System.out.println("Single Room Details");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room Details");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);
 develop
    }
}