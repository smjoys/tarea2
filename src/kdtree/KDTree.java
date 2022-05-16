package kdtree;

public class KDTree {
    private int X;
    private int Y;
    private int height;
    private KDTree right;
    private KDTree left;
    public KDTree(int x,int y){
        this.X = x;
        this.Y= y;
        height = 0;
        right = null;
        left=null;
    }
    private KDTree root;

    public KDTree() {
        root = null;
    }

}
