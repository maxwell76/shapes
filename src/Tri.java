import TurtleGraphics.*;
public class Tri extends AbsShape{
    
    
    private double x2,y2,x3,y3;
    
    public Tri(){
        super(0,0);
        x2=1;
        y2=1;
        x3=1;
        y3=1;
    }
    
    public Tri (double x, double y, double xa, double ya, double xb, double yb){
        super(x,y);
        x2=xa;
        y2=ya;
        x3=xb;
        y3=yb;
    }
    
    public double perimeter(){
        return Math.abs((xPos-x2)*(xPos-x2)+(yPos-y2)*(yPos-y2));
    }

    @Override
    public double area() {
        return Math.abs((xPos*y2-x2*yPos)+(x2*y3-x3*y2)+(x3*yPos-xPos*y3))/2;
    }
    
    @Override
    public void move(double xLoc, double yLoc) {
        
        double xch = xLoc-xPos;
        double ych = yLoc-yPos;
        
        xPos+=xch;
        yPos+=ych;
        x2+=xch;
        y2+=ych;
        x3+=xch;
        y3+=ych;
    }

    @Override
    public void draw(StandardPen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xPos,yPos);
        
        
    }

    @Override
    public void stretchBy(double factor) {
        x2 = (x2-xPos)*factor+xPos;
        y2 = (y2-yPos)*factor+yPos;
        x3 = (x3-xPos)*factor+xPos;
        y3 = (y3-yPos)*factor+yPos;
    }
    
    public String toString(){
        String s="Triangle\n======\n";
        s+= super.toString();
        s+="\nPerimeter = "+perimeter();
        return s;
    }

   

    
}
