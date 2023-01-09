import javax.swing.tree.TreeNode;

public class GivenATreeNode {
    public static boolean isSameTree(TreeNode n, TreeNode m){
        if(n==null && m==null) return true;
        if(n==null || m==null) return false;
        if(!n.equals(m)) return false;
        int index=0;
        while(!n.isLeaf() & !m.isLeaf()){
            isSameTree(n.getChildAt(index), m.getChildAt(index));
            index++;
        }
        return true;
    }
}
