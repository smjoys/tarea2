package kdtree;

public class KDTree {
    private int X;
    private int Y;
    private KDTree right;
    private KDTree left;
    public KDTree(int x,int y,KDTree r,KDTree l){
        this.X = x;
        this.Y= y;
        right = r;
        left=l;
    }
    private KDTree root;
    private int size;

    public KDTree() {
        root = null;
        size = 0;
    }

}
