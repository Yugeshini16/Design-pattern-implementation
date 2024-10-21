import java.util.ArrayList;
import java.util.List;

    //Behavioural Pattern_Observer
    //Subject (channel) that notifies its students (users) when a new video is uploaded
    class Channel {
        private String channelName;
        private List<Users> students = new ArrayList<>(); //maintains the list of the users
        private String latestVideo;

        public Channel(String channelName) {
            this.channelName = channelName;
        }

        public void subscribe(Users user) {
            students.add(user); /*a prebuilt method provided by the Java Collections Framework & add elements to a
             collection like (ArrayList) (available for any class that implements the List interface in Java)*/
        }

        public void unsubscribe(Users user) {
            students.remove(user);
        }

        public void notifyStudents() {
            for (Users student : students) { //for each subscriber present in the list "subscribers". A list to maintain the users.
                student.update(channelName, latestVideo); //.update() is written in Users class
            }
        }

        public void uploadVideo(String videoTitle) {
            this.latestVideo = videoTitle;
            System.out.println("\n New video uploaded: " + videoTitle);
            notifyStudents();
        }
    }



    // Observer (user) that receives notifications from the channel when a new video is uploaded
    class Users {
        private String username;

        public Users(String username) {
            this.username = username;
        }

        public void update(String channelName, String latestVideo) {
            System.out.println("User " + username +" received notification: New video on channel '" + channelName + "' - " + latestVideo);
        }
    }


    class classWeb {
    public static void main(String[] args) {
        // Create a YouTube channel
        Channel channel = new Channel("Programming Tutorials");

        // Create users (subscribers)
        Users user1 = new Users("Yuge");
        Users user2 = new Users("Nila");
        Users user3 = new Users("Sharu");

        // Users subscribe to the channel
        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        // Upload new videos
        channel.uploadVideo("Java Basics");
        channel.uploadVideo("Python Course");

        // User unsubscribes
        channel.unsubscribe(user3);

        // Upload another video
        channel.uploadVideo("JavaScript Tutorial");
    }
}






















