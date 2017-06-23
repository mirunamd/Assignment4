import java.util.*;

public class WorldMap {
    boolean[][] map;
    int n, m;

    public int countIslands(int rows, int columns, boolean[][] a) {
        int count = 0, i, j;
        map = a;
        n = rows;
        m = columns;

        for(i = 0; i < n; i++)
            for(j = 0; j < m; j++)
                if(map[i][j]) {
                    count ++;
                    fill(i, j);
                }
        return count;
    }

    void fill(int i, int j) {
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(i, j));

        while(!q.isEmpty()) {
            Cell elem = q.poll();



            i = elem.i;
            j = elem.j;

            map[i][j] = false;

            if(i - 1 >= 0 && map[i - 1][j]) {
                q.add(new Cell(i - 1, j));
            }

            if(i + 1 < n && map[i + 1][j]) {
                q.add(new Cell(i + 1, j));
            }

            if(j - 1 >= 0 && map[i][j-1]) {
                q.add(new Cell(i, j-1));
            }

            if(j + 1 < m && map[i][j+1]) {
                q.add(new Cell(i, j+1));
            }
        }
    }
}

class Cell {
    public int i, j;

    Cell(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cell other = (Cell) obj;
        if (this.i != other.i || this.j != other.j) {
            return false;
        }
        return true;
    }
}
