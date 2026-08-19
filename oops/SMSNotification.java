public class SMSNotification implements Notification{
    @Override
    public String sendNotification(String message) {
        return "SMS";
    }
}


//SMSNotification sms = new SMSNotification()

//        sms.sendNotification("Hello, this is a test SMS notification.");
