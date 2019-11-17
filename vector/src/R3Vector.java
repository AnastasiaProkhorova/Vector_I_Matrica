import java.util.Scanner;
class R3Vector {

    private double x, y, z;

    public R3Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void plus(R3Vector b){
        R3Vector d = new R3Vector(x+b.x, y+b.y, z+b.z);
        System.out.println(d.x+" "+d.y+" "+d.z);
    }
    public void minus( R3Vector b){
        R3Vector f = new R3Vector(x-b.x, y-b.y, z+b.z);
        System.out.println(f.x+" "+f.y+" "+f.z);
    }
    public void mult(double k){
        R3Vector o = new R3Vector(k*x, k*y, k*z);
        System.out.println(o.x+" "+o.y+" "+o.z);
    }
    public void product(R3Vector b){
        double n = x*b.x + y*b.y + z*b.z;
        System.out.println(n);
    }
    public void mixed(R3Vector b, R3Vector c){
        double l = x*b.y*c.z + y*b.z*c.x + z*b.x*c.y-z*b.y*c.x-y*b.x*c.z-x*b.z*c.y;
        System.out.println(l);
    }
}
