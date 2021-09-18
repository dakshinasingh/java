public abstract class Shape {
    private int xcord,ycord;
    public int getxcord(){
        return xcord;
    }
    public int getycord(){
        return ycord;
    }
    public void setxcord(int x){
        xcord=x;
    }
    public void setycord(int y){
        ycord=y;
    }
    
    public Shape(int x, int y){
        xcord=x;
        ycord=y;
    }
    
    public Shape(){
        xcord=ycord=0;
    }
    
    public abstract float getArea();    //abstract method do not have any executable body
}

class cone extends Shape{
    int r,s;

    public cone(int x, int y){
        super(x,y);
        this.r=x;
        this.s=y;
    }
    
    @Override
    public float getArea()
    {
        float area;
        double pi=3.14;
        area=(float)(pi*r*s+ pi*r*r);
        return area;    
    }
}

class box extends Shape{
    int x, y, z;

    public box(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    
    @Override
    public float getArea(){
        float area;
        area=(float)(2*(x*y)+(y*z)+(x*z));
        return area;    
    }
}

class Test{
    public static void main(String args[]){
        Shape s;
        s=new cone(4,7);
        System.out.println("Area of cone:"+s.getArea());
        s=new box(6,2,9);
        System.out.println("Area of box:"+s.getArea());
    }
}

/*
run:
Area of cone:138.16
Area of box:96.0
*/
