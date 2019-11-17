public class Main {
    public static void main(String[] args) {
       // vectora();
        //matrica();
    }
        public static void vectora() {
            R3Vector a = new R3Vector(12, 34, 22);
            R3Vector b = new R3Vector(23, 56, 67);
            R3Vector c = new R3Vector(34, 44, 55);
            double k = 3;
            a.plus(b);
            a.minus(b);
            a.mult(k);
            a.product(b);
            a.mixed(b, c);
        }
        public static void matrica() {
            Matrix2 q = new Matrix2(2, 2, 3, 4);
            Matrix2 e = new Matrix2(7, 88, 98, 99);
            int m = 6;
            q.pluss(e);
            q.minuss(e);
            q.multt(m);
            q.umogenie(e);
            q.opred();
            q.obratnaya();
        }
    }
