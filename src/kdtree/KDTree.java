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

    public float factor(int edad, int peso){
        KDNodo i = searchEdad(root,edad,peso);
        if (i != null){
            return i.factor;
        }
        return -1;

    }

    private KDNodo searchEdad(KDNodo n, int edad, int peso){
        if (n == null || n.edad == edad && n.peso == peso) return n;
        if (edad < n.edad) {
            return searchPeso(n.left,peso,edad);
        }else return searchPeso(n.right,peso,edad);
    }
    private KDNodo searchPeso(KDNodo n, int peso, int edad){
        if (n == null || n.edad == edad && n.peso == peso) return n;
        if (peso < n.peso) {
            return searchEdad(n.left,edad,peso);
        }else return searchEdad(n.right,edad,peso);
    }

}
