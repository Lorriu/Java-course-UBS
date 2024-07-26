

//EXERCISE

//Create each array then print the 5th element of each one


public class Arrays {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");

    
//Array of 8 integer elemnts
        int[] eight = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(eight[5]);

//Array of 12 float elents

        float[] twelve = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0, 2.1, 2.2};

        System.out.println(twelve[5]);

//array of 5 Double elements

        double[] five = {2.49, 3.59, 5.69, 7.8, 9.69};

        System.out.println(five[5]);

//array of 6 boolean elements

        boolean[] six = new boolean[6];

        six[0] = true;
        six[1] =  false;
        six[2] = false;
        six[3] = true;
        six[4] = false;
        six[5] = true;

        System.out.println(six[5]);





//STRETCH GOAL code that initialises a matrix with the 4 above codes

        Object[][] matrix = {

                {1, 2, 3, 4, 5, 6, 7, 8},
                {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0, 2.1, 2.2},
                {2.49, 3.59, 5.69, 7.8, 9.69},
                {true, false, false, true, false, true}
            
        };


}
}
