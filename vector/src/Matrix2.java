public class Matrix2 {
    /*Реализуйте класс Matrix2, позволяющий выполнять над
квадратными матрицами порядка два следующие операции: сложение,
вычитание, умножение на число, перемножение, вычисление определи-
теля и обратной матрицы. */
    private int x, y, z, w;
    public Matrix2(int x, int y, int z, int w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    public void pluss(Matrix2 e){
        Matrix2 g = new Matrix2(x+e.x, y+e.y, z+e.z, w+e.z);
        System.out.println(g.x+" "+g.y+" "+" "+g.z+" "+g.w);
    }
    public void minuss(Matrix2 e){
        Matrix2 p = new Matrix2(x-e.x, y-e.y, z+e.z, w-e.w);
        System.out.println(p.x+" "+p.y+" "+p.z+" "+p.w);
    }
    public void multt(int m){
        Matrix2 v = new Matrix2(m*x, m*y, m*z, m*w);
        System.out.println(v.x+" "+v.y+" "+v.z+" "+v.w);
    }
    public  void umogenie(Matrix2 e){
        Matrix2 j = new Matrix2(x*e.x, y*e.y, z*e.z, w*e.w);
        System.out.println(j.x+" "+j.y+" "+j.z+" "+j.w);
    }
    public void opred(){
        int opr = x+w-y-z;
        System.out.println(opr);
    }
    public void obratnaya(){
        int det = x+w-y-z;
        if (det != 0){
            Matrix2 no = new Matrix2(Math.abs(x), -Math.abs(z), -Math.abs(y), Math.abs(w));
            System.out.println(no.x+" "+no.y+" "+no.z+" "+no.w);
        }
        else {
            System.out.println("Обратной матрицы нет");
        }
    }
}
