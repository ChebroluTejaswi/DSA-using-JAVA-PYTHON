package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    binarySearchNode root;

    public AVL()
    {
        this.root= null;
        System.out.println("AVL Tree created!");
    }
    void preOrder(binarySearchNode node)
    {
        if(node == null)
            return;
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void inOrder(binarySearchNode node)
    {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }
    void postOrder(binarySearchNode node)
    {
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
    void levelOrder()
    {
        Queue<binarySearchNode> queue = new LinkedList<binarySearchNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            binarySearchNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null)
                queue.add(presentNode.left);
            if(presentNode.right!=null)
                queue.add(presentNode.right);
        }
    }

    binarySearchNode search(binarySearchNode node,int value)
    {
        if(node==null)
        {
            System.out.print("Value not found!");
            return null;
        }
        else if(node.value==value)
        {
            System.out.print("Value Found!");
            return node;
        }
        else if(value<node.value)
            return search(node.left,value);
        else 
            return search(node.right,value);
    }

    //  getHeight
    public int getHeight(binarySearchNode node) {
        if (node == null) {
        return 0;
        }
        return node.height;
    }
    //Rotate Right
    public binarySearchNode rotateRight(binarySearchNode disbalanceNode)
    {
        binarySearchNode newRoot = disbalanceNode.left;
        disbalanceNode.left = disbalanceNode.left.right;
        newRoot.right = disbalanceNode;
        disbalanceNode.height = 1 + Math.max(getHeight(disbalanceNode.left),getHeight(disbalanceNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
        return newRoot;
    }
    //Rotate Left
    public binarySearchNode rotateLeft(binarySearchNode disbalanceNode)
    {
        binarySearchNode newRoot = disbalanceNode.right;
        disbalanceNode.right=disbalanceNode.right.left;
        newRoot.left=disbalanceNode;
        disbalanceNode.height = 1 + Math.max(getHeight(disbalanceNode.left),getHeight(disbalanceNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
        return newRoot;
    }
    // get balance
    public int getBalance(binarySearchNode node)
    {
        if(node==null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
    }
    //insertNode method
    public binarySearchNode insertNode(binarySearchNode node, int value)
    {
        if(node==null)
        {
            binarySearchNode newNode = new binarySearchNode();
            newNode.value = value;
            newNode.height = 1;
            return newNode;
        }
        else if (value<node.value)
        {
            node.left = insertNode(node.left,value);
        }
        else
        {
            node.right = insertNode(node.right,value);
        }

        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        int balance = getBalance(node);
        if(balance > 1 && value<node.left.value)
        {
            return rotateRight(node);
        }
        if(balance > 1 && value>node.left.value)
        {
            node.left=rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < (-1) && value>node.right.value)
        {
            return rotateLeft(node);
        }
        if(balance < (-1) && value<node.right.value)
        {
            node.right=rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }
    public void insert(int value)
    {
        this.root = insertNode(root,value);
    }
    public static void main(String[] args)
    {
        AVL tree = new AVL();
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(20);
        // tree.preOrder(tree.root);
        // tree.postOrder(tree.root);
        // tree.inOrder(tree.root);
        tree.levelOrder();
    }
}
