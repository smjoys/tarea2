package kdtree;

public class KDNodo {
    int factor;
    int edad;
    int peso;
    KDNodo right;
    KDNodo left;

    public KDNodo(int x,int y,int f){
        this.factor = f;
        this.edad = x;
        this.peso = y;
        right = null;
        left = null;
    }
}
