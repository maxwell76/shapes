import TurtleGraphics.*;
import BreezySwing.*;

public class MakeShapes {

    static StandardPen p=new StandardPen(new SketchPadWindow(600,600));
    
    public static void main(String[] args) {
        Circle c1,c2,c3;
        c1=new Wheel(-200,-200,20,20);
        c2=new Wheel(-200,-170,10,20);
        c3=new Wheel(-200,-155,5,20);
        makeSnowman(c1,c2,c3);
        //lesson 1 -> A parent can be made nito a child
        //(all wheels are crcles, plus more)
        //lesson 2 -> a ciled can be substituted where a parent is expected
        
        AbsShape x,y,z;
        x=new Wheel(0,0,50,5);
        y=new Wheel(100,0,50,5);
        z=new Rect(-200,200,240,50);
        //must cast to specific class first
        makeWaggon((Wheel)x,(Wheel)y,(Rect)z);
        
        AbsShape s1=new Rect(100,100,50,50);
        s1.draw(p);
        AbsShape s2 = makeShapeFromAnother(s1,"c");
        s2.draw(p);
    }
    
    public static AbsShape makeShapeFromAnother(AbsShape x, String type){
        AbsShape result;
        double area,w,h,rad;
        area=x.area();
        if (type.equals("c")){
            rad = Math.sqrt(area/Math.PI);
            result=new Circle(x.getXPos(), x.getYPos(),rad);
        }
        else if (type.equals("r")){
            w = Math.sqrt(area/Math.PI);
            h = Math.sqrt(area/Math.PI);
            result=new Circle(x.getXPos(), x.getYPos(),area);
        }
        else{//must be a Wheel
            rad = Math.sqrt(area/Math.PI);
            result=new Wheel(x.getXPos(), x.getYPos(),rad,5);
        }
        return result;
    }
    
    public static void makeSnowman(Circle a, Circle b, Circle c){
        a.draw(p);
        b.draw(p);
        c.draw(p);
        
    }
    
    public static void makeWaggon(Wheel a, Wheel b, Rect c){
        a.draw(p);
        b.draw(p);
        c.draw(p);
    }

}
