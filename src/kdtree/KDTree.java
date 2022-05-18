package kdtree;

public class KDTree {

    public KDNodo root;

    public KDTree(){
        root = null;
    }

    public void insertar(KDNodo n){
        if (root == null) root=n;
        else revEdad(n,root);
    }

    private void revEdad(KDNodo neu,KDNodo act){
        if (neu.edad < act.edad) {
            if (act.left == null) {
                act.left=neu;
            }else revPeso(neu,act.left);
        }else {
            if (act.right == null) {
                act.right=neu;
            }else revPeso(neu,act.right);
        }
    }
    private void revPeso(KDNodo neu,KDNodo act){
        if (neu.peso < act.peso) {
            if (act.left == null) {
                act.left = neu;
            }else revEdad(neu,act.left);
        }else {
            if (act.right == null) {
                act.right = neu;
            }else revEdad(neu,act.right);
        }
    }



}
