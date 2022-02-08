package de.neuefische.tasks.week1;


public class Ifelse {

//    public static void main(String[] args)
//    {
//
//        System.out.println(quantity(25, "gelb"));
//    }




    public static String quantity(int personen, String alarmStufe)
    {

        switch (alarmStufe) {
            case "gelb":
                return checkCustomer(personen, 30);
            case "rot":
                return checkCustomer(personen, 0);
            case "grün":
                return checkCustomer(personen, 60);
            default:
                return "Unbekannte Farbe";
        }
    }

    private static String checkCustomer(int personen, int maxNumberOfCustomers)
    {

        if (personen > maxNumberOfCustomers) {
            return "Zu viele Personen";
        }
        return "Maximale Personenzahl nicht überschritten";
    }



//        if ("gelb".equals(alarmStufe)) {
//            if (personen > 30) {
//                return "Zu viele Personen";
//            } else return "Maximale Personenzahl nicht überschritten";
//        } else if ("grün".equals(alarmStufe) {
//            if (personen > 30) {
//                return "Zu viele Personen";
//            } else return "Maximale Personenzahl nicht überschritten";
//        } else if ("rot".equals(alarmStufe) {
//            return "Zu viele Personen";
//        } else
//
//
//            return "Keine Bedingung";
}

