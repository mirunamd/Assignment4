public class Test {
    public static void main(String[] args) {
        testExample(); // 3
        testNoIsland(); // 0
        testEmptyMap(); // 0
        testFullMap(); // 1
        testSpiralMap(); // 4     
        testDotMap(); // 1
    }

    public static void testExample() {
        boolean[][] a = {
        {false, true, false, true}, 
        {true, true, false, false}, 
        {false, false, true, false}, 
        {false, false, true, false}};
        int n = 4, m = 4;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);

        int expected = 3;
        System.out.println("Expected output: " + expected + ", got: " + nr + ". Results equal: " + (expected == nr));
    }

    public static void testNoIsland() {
        boolean[][] a = {
        {false, false, false, false},  
        {false, false, false, false}};
        int n = 2, m = 4;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);
    
        int expected = 0;
        System.out.println("Expected output: " + expected + ", got: " + nr + ". Results equal: " + (expected == nr));
    }

    public static void testEmptyMap() {
        boolean[][] a = {};
        int n = 0, m = 0;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);
      
        int expected = 0;
        System.out.println("Expected output: " + expected + ", got: " + nr + ". Results equal: " + (expected == nr));
    }
    
    public static void testFullMap() {
        boolean[][] a = {
        {true, true, true, true}, 
        {true, true, true, true}, 
        {true, true, true, true}, 
        {true, true, true, true}};
        int n = 4, m = 4;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);
  
        int expected = 1;
        System.out.println("Expected output: " + expected + ", got: " + nr + ". Results equal: " + (expected == nr));
    }

    public static void testSpiralMap() {
        boolean[][] a = {
        {true, false, false, false}, 
        {false, true, false, false}, 
        {false, false, true, false}, 
        {false, false, false, true}};
        int n = 4, m = 4;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);

        int expected = 4;
        System.out.println("Expected output: " + expected + ", got: " + nr + ". Results equal: " + (expected == nr));
    }

     public static void testDotMap() {
        boolean[][] a = {
        {false, false, false}, 
        {true, true, false}, 
        {false, false, false}};
        int n = 3, m = 3;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);
    
        int expected = 1;
        System.out.println("Expected output: " + expected + ", got: " + nr + ". Results equal: " + (expected == nr));
    }
}

