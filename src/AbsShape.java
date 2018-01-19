import TurtleGraphics.*;
abstract public class AbsShape {
    
    protected double xPos, yPos;
    
    public AbsShape(){
        xPos=0;
        yPos=0;
    }
    
    public AbsShape(double x, double y){
        xPos=x;
        yPos=y;
    }
    
    //abstract method is not defined in parent
    //it forces children to define it
    //later, you won't ned to CAST to run this
    //from a child object
    public abstract double area();
    public abstract void draw(StandardPen p);
    public abstract void stretchBy(double factor);
    
    
    //final means cant be overridden 
    //by children classes or even added to
    final public double getXPos() {
        return xPos;
    }

    
    final public double getYPos() {
        return yPos;
    }
    
    public void move(double xLoc, double yLoc) {
        xPos= xLoc;
        yPos=yLoc;
    }
    
    public String toString(){
        String str= "XPos: "+xPos;
        str+="\nYPos: "+yPos;
        str+="\nArea: "+area();
        return str;
    }
}
