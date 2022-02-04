package de.neuefische.tasks;

public class Fakultät {

    public static void main(String[] args) {

//        loop(5);
//        loop2(0);
    }


//       public static int loop(int fak){
//

//            System.out.println("1");
//            int start = 1;
//            for (int i = 1; i <= fak; i++) {
//                start = start * i;
//                System.out.println(start);
//            }
//            System.out.println(start);
//
//            return start;
//
//
//        }

        public static int loop2(int fak){
            System.out.println("1");
            int start = 1;
            int i = 1;
            while( i <= fak)
            {
                start = start * i;
                i++;
            }
            System.out.println(start);
            return start;



        }

    }
