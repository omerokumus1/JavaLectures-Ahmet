package ObjectsAndClasses;

public class Square {
    private double edge;
    private double diagonalLength;

    Square(){

    }

    Square(double edge){
        setEdge(edge);
        setDiagonalLength();
    }

    // getter = accessor
    public double getEdge(){
        return edge;
    }

    public double getDiagonalLength(){
        return diagonalLength;
    }

    // setter = mutator
    public void setEdge(double edge){
        if (edge > 0)
            this.edge = edge;
        else {
            this.edge = 1;
            System.out.println("Edge cannot be smaller than or equal to 0.");
        }
    }

    private void setDiagonalLength(){
        double edgeSquare = edge*edge;
        this.diagonalLength = Math.sqrt(2*edgeSquare);
    }
}
