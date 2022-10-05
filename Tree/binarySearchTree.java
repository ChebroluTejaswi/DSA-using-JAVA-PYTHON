package Tree;

public class binarySearchTree {
    binarySearchNode root;
    public binarySearchTree()
    {
        root=null;
        System.out.println("Binary search tree created!");
    }
    private binarySearchNode insertFunc(binarySearchNode currentNode, int value)
    {
        if(currentNode == null)
        {
            binarySearchNode node = new binarySearchNode();
            node.value=value;
            System.out.println("value added successfully!");
            return node;
        }
        else if(value <= currentNode.value)
        {
            currentNode.left = insertFunc(currentNode.left, value);
            return currentNode;
        }
        else
        {
            currentNode.right = insertFunc(currentNode.right,value);
            return currentNode;
        }
    }
    void insert(int value)
    {
        insertFunc(this.root,value);
    }

    void preOrder(binarySearchNode node)
    {
        if(node==null)
            return;
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(binarySearchNode node)
    {
        if(node==null)
            return;
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }
    void postOrder(binarySearchNode node)
    {
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }
    void deleteBST()
    {
        root=null;
        System.out.println("Binary Search Tree deleted successfully!");
    }
    public static void main(String args[])
    {
        binarySearchTree bt = new binarySearchTree();
        bt.insert(3);
        bt.insert(5);
        bt.insert(9);
        bt.preOrder(bt.root);
        bt.inOrder(bt.root);
        bt.postOrder(bt.root);
        bt.deleteBST();
    }
}
