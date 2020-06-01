package by.tr.mod8;

public class TimeTest {
    public static void main(String[] args) {
        Time timer = new Time(20,51,40);
        System.out.println("Start time "+ timer.hour + ":"+timer.minute+ ":"+timer.second);
        timer.setHour(5);
        timer.setMinute(6);
        timer.setSecond(56);
        System.out.println("Current time "+ timer.hour + ":"+timer.minute+ ":"+timer.second);
        timer.setHour(15);
        timer.setMinute(34);
        timer.setSecond(13);
        System.out.println("Current time "+ timer.hour + ":"+timer.minute+ ":"+timer.second);

        timer.addSecond(123);
        System.out.println("Current time "+ timer.hour + ":"+timer.minute+ ":"+timer.second);
        timer.addMinute(125);

        System.out.println("Current time "+ timer.hour + ":"+timer.minute+ ":"+timer.second);
        timer.addHour(20);
        System.out.println("Current time "+ timer.hour + ":"+timer.minute+ ":"+timer.second);
        timer.addSecond(36064);
        System.out.println("Current time "+ timer.hour + ":"+timer.minute+ ":"+timer.second);
    }
}
