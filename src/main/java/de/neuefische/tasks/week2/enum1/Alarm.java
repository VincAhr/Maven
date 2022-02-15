package de.neuefische.tasks.week2.enum1;

public class Alarm {


        public static String checkNumberOfCustomers(int numberOfCustomers, AlarmLevel alarmLevel) {
            return alarmLevel.getMessage(numberOfCustomers);
        }


}
