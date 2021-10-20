package AbstractClasses;

public abstract class ASquare extends ARectangle{

    public ASquare(String color, boolean filled, double edge) {
        super(color, filled, edge, edge);
    }

    public double getEdge() {
        return super.getLongEdge();
    }

    // super class'taki concrete method override ile abstract yapılabilir. Nadir görülür/kullanılır
    @Override
    public abstract double getPerimeter();


}
