import TurtleGraphics.*;
public class Rect extends AbsShape{
    
    
    private double w, h;
    
    public Rect(){
        super(0,0);
        w=1;
        h=1;
    }
    
    public Rect(double x,  double y, double wd, double ht){
        super(x,y);
        w=wd;
        h=ht;
    }

    
    public double area() {
        return w*h;
    }
    
    public double perimeter(){
        return w+w+h+h;
    }
    
    

    
    public void draw(StandardPen p) {
         //move into position
         p.up();
         p.move(xPos, yPos);
         p.down();
         p.setDirection(0);//pointing right
         p.move(w);
         p.turn(-90);//down
         p.move(h);
         p.turn(-90);//left
         p.move(w);
         p.turn(-90);//up
         p.move(h);
    }

    
    

   
    public void stretchBy(double factor) {
        w*=factor;
        h*=factor;
    }
    
    public String toString(){
        String s="Rectangle\n======\n";
        s+= super.toString();
        s+="\nWidth and Height = "+w+", "+h;
        s+="\nPerimeter = "+perimeter();
        return s;
    }

    

    
}
