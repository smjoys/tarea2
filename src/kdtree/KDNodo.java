package kdtree;

public class KDNodo {
    int X;
    int Y;
    KDNodo right;
    KDNodo left;

    public KDNodo(int x,int y){
        this.X = x;
        this.Y= y;
        right = null;
        left=null;
    }
}
