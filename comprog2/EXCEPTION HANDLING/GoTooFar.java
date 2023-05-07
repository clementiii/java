public class GoTooFar {
    public static void main(String args[]) {
        int[] x = new int[5];
        
        for (int i = 0; i < 5; i++) {
            x[i] = i;
        }
        
        try {
            for (int i = 0; i <= x.length; i++) {
                System.out.println(x[i]);
            }    
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Now you have gone too far!");
        }
    }    
}
