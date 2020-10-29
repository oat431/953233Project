package model;

public class Cell{

    public int row;
    public int column;
    public Cell(int i,int j) {
        row=i;
        column=j;
        if((i<1)||(i>8)||(j<1)||(j>8)) {
            System.out.println(" warning "+ i +" , "+j);
        }
    }
    public void set(int i,int j) {
        this.row=i;
        this.column=j;
    }

    public boolean equals(int i,int j) {
        return (row == i) && (column == j);
    }

    public boolean equals(Cell cell) {
        return (row == cell.row) && (column == cell.column);
    }
}