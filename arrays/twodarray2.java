package arrays;

public class twodarray2 {
        public static void main(String[] args) {
            String[][] cars = {{"camaro","corvette","Silverado"},
                                {"Mustang","F - 150","Ferrari"},
                                {"Ranger","Ranger","Tesla"}};

            for(int i = 0; i<cars.length; i++){
                System.out.println();
                for(int j = 0; j<cars[i].length; j++) {
                    System.out.println(cars[i][j] + " ");
                }
            }

        }
}
