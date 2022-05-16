package kdtree;

public class KDNodo {
    int factor;
    int X;
    int Y;
    KDNodo right;
    KDNodo left;

    public KDNodo(int x,int y,int f){
        this.factor = f;
        this.X = x;
        this.Y= y;
        right = null;
        left=null;
    }
}
