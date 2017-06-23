public class Test {
    public static void main(String[] args) {
        testExample(); // 3
        testNoIsland(); // 0
        testEmptyMap(); // 0
    }

    public static void testExample() {
        boolean[][] a = {{false, true, false, true}, {true, true, false, false}, {false, false, true, false}, {false, false, true, false}};
        int n = 4, m = 4;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);
        System.out.println("Expected output: 3, got: " + nr);
    }

    public static void testNoIsland() {
        boolean[][] a = {{false, false, false, false}, {false, false, false, false}};
        int n = 2, m = 4;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);
        System.out.println("Expected output: 0, got: " + nr);
    }

    public static void testEmptyMap() {
        boolean[][] a = {};
        int n = 0, m = 0;
        WorldMap wmap = new WorldMap();
        int nr = wmap.countIslands(n, m, a);
        System.out.println("Expected output: 0, got: " + nr);
    }
}

