public class EmailNotification implements Notification {
    @Override
    public String sendNotification(String message){
        return "Email";
    }

}
