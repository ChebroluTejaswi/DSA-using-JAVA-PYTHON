package Tree;
import java.util.ArrayList;

class TreeNode{
    String data;
    ArrayList<TreeNode> children;
    public TreeNode(String data)
    {   
        this.data=data;
        this.children= new ArrayList<TreeNode>();
    }
    void addChild(TreeNode node)
    {
        this.children.add(node);
    }
    String print(int level)
    {
        String str=" ".repeat(level)+ this.data+"\n";
        for(TreeNode node : this.children){
            str += node.print(level+1);
        };
        return str;
    }
}

public class basicTree {
    public static void main(String[] args)
    {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);

        System.out.println(drinks.print(0));
    }
}
