import TurtleGraphics.*;

public class Wheel extends Circle{
    //inherit x, y, radius from Circle
    private int spokes; //new property
    
    public Wheel(){
    super();//calling Circle default constructor
    spokes=0;
    }
    
    public Wheel(double x,double y, double r, int s){
        super(x,y,r);//calling Circle constructor, passing up x, y, r
        spokes=s;
    }
    
    public void draw(StandardPen p){
        //draw the outer part of the wheel
        super.draw(p);
        //draw the spokes
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(i);
            p.move(xPos, yPos);
            p.down();
            p.setDirection(i*360/spokes);
            p.move(radius);
            
        }
    }
    
    public void setSpokes(int s){
        spokes=s;
    }
    public String toString(){
        String s="Wheel\n======\n";
        s+="XPOS = "+xPos;
        s+="\nYPOS = "+yPos;
        s+="\nRadius = "+radius;
        s+="\nArea = " +area();
        s+="\nNumber of Spokes= "+spokes;
        s+="\nCircumference = "+circumference();
        return s;
    }
    
}
