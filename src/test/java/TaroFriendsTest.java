

import junit.framework.TestCase;


public class TaroFriendsTest extends TestCase {

    private TaroFriends tester = null;

    protected void setUp(){
        tester = new TaroFriends();
    }
    

    public void test_should_result_be_3(){
        int[] coordinates = {-3, 0, 1};
        int X = 3;
        assertEquals("given coordinates {-3, 0, 1} and X 3, results must be 3", 3, tester.getNumber(coordinates, X));
    }

    /*
    public void test_should_result_be_4(){
        int[] coordinates = {4, 7, -7};
        int X = 5;
        assertEquals("given coordinates {4, 7, -7} and X 5, results must be 4", 4, tester.getNumber(coordinates, X));
    }

 /*false	
    1204	
    1455	
    106, 347, -103, -482, 807, -507, -485, -582
    832
    /
    public void test_should_result_be_1204(){
        int[] coordinates = {106, 347, -103, -482, 807, -507, -485, -582};
        int X = 832;
        assertEquals("given coordinates {106, 347, -103, -482, 807, -507, -485, -582} and X 832", 1204, tester.getNumber(coordinates, X));
    }
    
//false	1416	1621	527, -168, 795, 113, 319, 24, 613, 661, -829, 763, 737, 541, -717, 981, -12, 512, 898, -87, 73, -968, -553, 880, 228, -586, -265, -211, -3, -252, -941, 491, -967, -766, -616, 253, -629, 293, 428, 744, -778, -203, -321, 222, 824    

    public void test_should_result_be_0(){
        int[] coordinates = {-100000000, 100000000};
        int X = 100000000;
        assertEquals("given coordinates {-100000000, 100000000} and X 100000000, results must be 0", 0, tester.getNumber(coordinates, X));
    }

    public void test_should_result_be_7(){
        int[] coordinates = {3, 7, 4, 6, -10, 7, 10, 9, -5};
        int X = 7;
        assertEquals("given coordinates {3, 7, 4, 6, -10, 7, 10, 9, -5} and X 7, results must be 7", 7, tester.getNumber(coordinates, X));
    }

    public void test_example_5(){
        int[] coordinates = {-4, 0, 4, 0};
        int X = 4;
        assertEquals("given coordinates {-4, 0, 4, 0} and X 4, results must be 4", 4, tester.getNumber(coordinates, X));
    }

    public void test_example_6(){
        int[] coordinates = {7};
        int X = 7;
        assertEquals("given coordinates {7} and X 7, results must be 0", 0, tester.getNumber(coordinates, X));
    }
    
    */
    
}