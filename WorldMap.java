import java.util.*;

public class WorldMap {
    boolean[][] map;
    int map_rows, map_columns;
    Queue<Cell> q;
    
    WorldMap(){
        q = new LinkedList<>();
    }

    public int countIslands(int rows, int columns, boolean[][] a) {
        int count = 0, i, j;
        map = a;
        map_rows = rows;
        map_columns = columns;

        for(i = 0; i < map_rows; i++)
            for(j = 0; j < map_columns; j++)
                if(map[i][j]) {
                    count ++;
                    fill(i, j);
                }
        return count;
    }

    void fill(int i, int j) {
        q.add(new Cell(i, j));

        while(!q.isEmpty()) {
            Cell elem = q.poll();

            i = elem.row;
            j = elem.col;

            map[i][j] = false;

            for(Direction dir : Direction.values())
              addNewDir(elem, dir);

           /* if(i - 1 >= 0 && map[i - 1][j]) {
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
            } */
        }
    }

    void addNewDir(Cell elem, Direction dir){
      int new_row = elem.row + dir.row;
      int new_col = elem.col + dir.col;

      if(new_row < 0 || new_row >= map_rows) 
        return;
      if(new_col < 0 || new_col >= map_columns)
        return;
      
      if(!map[new_row][new_col])
        return;

      q.add(new Cell(new_row, new_col));
    }
}

class Cell {
    public int row, col;

    Cell(int i, int j) {
        row = i;
        col = j;
    }
}

enum Direction {
        TOP(-1, 0), DOWN(1, 0), LEFT(0, -1), RIGHT(0, 1);
        int row;
        int col;

        Direction(int row, int col) {
            this.row = row;
            this.col = col;
        }
}
