package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeLL {
    binaryNode root;

    // Creating Binary tree
    public binaryTreeLL(){
        this.root=null;
        System.out.println("Binary tree created!");
    }

    // Traversal - Pre Order
    void preOrder(binaryNode node)
    {
        if(node==null)
            return;
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    // Traversal - In Order
    void inOrder(binaryNode node)
    {
        if(node==null)
            return;
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }
    // Traversal -Post Order
    void postOrder(binaryNode node)
    {
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
    // Traversal -Level Order
    void levelOrder(binaryNode node)
    {
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            binaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null)
            {
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null)
            {   
                queue.add(presentNode.right);
            }
        }
    }

    // Search
    void search(binaryNode node,String value)
    {
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            binaryNode presentNode = queue.remove();
            if(presentNode.value==value)
            {
                System.out.println(value+" - Found!");
                return;
            }
            else
            {
                if(presentNode.left!=null)
                {
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null)
                {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println(value+" - Not Found!");
    }

    // Insert - (level order traversal)
    void insert(String value)
    {
        binaryNode node = new binaryNode();
        node.value=value;
        // Case 1
        if(root==null)
        {
            root=node;
            System.out.println("Added a node to root!");
            return;
        }
        // Case 2
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            binaryNode presentNode = queue.remove();
            if(presentNode.left==null)
            {
                presentNode.left=node;
                System.out.println(value+" - Successfully inserted!");
                break;
            }
            else if(presentNode.right==null)
            {
                presentNode.right=node;
                System.out.println(value+" - Successfully inserted!");
                break;
            }
            else
            {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    void deleteBT(){
        root=null;
        System.out.println("Binary tree successfully deleted!");
    }

    binaryNode getDeepestNode()
    {
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        binaryNode presentNode =null;
        while(!queue.isEmpty())
        {
            presentNode = queue.remove();
            if(presentNode.left!=null)
                queue.add(presentNode.left);
            if(presentNode.right!=null)
                queue.add(presentNode.right);
        }
        return presentNode;
    }
    void deleteDeepestNode()
    {
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        binaryNode presentNode =null,previousNode =null;
        while(!queue.isEmpty())
        {
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left==null){
                previousNode.right=null;
                return;
            }
            else if(presentNode.right==null){
                presentNode.left=null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }
    void deleteGivenNode(String value)
    {
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            binaryNode presentNode = queue.remove();
            if(presentNode.value==value)
            {
                presentNode.value=getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("\n"+value+" - Node deleted successfully!");
                return;
            }
            else
            {
                if(presentNode.left!=null)
                    queue.add(presentNode.left);
                if(presentNode.right!=null)
                    queue.add(presentNode.right);
            }
        }
        System.out.println("\n"+value+" - Node doesnot exist!");
    }
    public static void main(String[] args)
    {
        binaryTreeLL binaryTree = new binaryTreeLL();

        // binaryNode n1 = new binaryNode();
        // n1.value="n1";
        // binaryNode n2 = new binaryNode();
        // n2.value="n2";
        // binaryNode n3 = new binaryNode();
        // n3.value="n3";
        // binaryNode n4 = new binaryNode();
        // n4.value="n4";
        // binaryNode n5 = new binaryNode();
        // n5.value="n5";
        // binaryNode n6 = new binaryNode();
        // n6.value="n6";
        // binaryNode n7 = new binaryNode();
        // n7.value="n7";
        // binaryNode n8 = new binaryNode();
        // n8.value="n8";
        // binaryNode n9 = new binaryNode();
        // n9.value="n9";

        // n1.left=n2;
        // n1.right=n3;
        // n2.left=n4;
        // n2.right=n5;
        // n3.left=n6;
        // n3.right=n7;
        // n4.left=n8;
        // n4.right=n9;

        // binaryTree.root=n1;
        // System.out.println("Pre-Order");
        // binarytree.preOrder(binarytree.root);
        // System.out.println("\n\nIn-Order");
        // binarytree.inOrder(binarytree.root);
        // System.out.println("\n\nPost-Order");
        // binarytree.postOrder(binarytree.root);
        // System.out.println("\n\nLevel-Order");
        // binarytree.levelOrder(binarytree.root);

        // binaryTree.search(binaryTree.root,"n3");
        // binaryTree.search(binaryTree.root,"n10");

        binaryTree.insert("n1");
        binaryTree.insert("n2");
        binaryTree.insert("n3");
        binaryTree.insert("n4");
        binaryTree.insert("n5");
        binaryTree.insert("n6");
        binaryTree.insert("n7");
        binaryTree.insert("n8");
        binaryTree.insert("n9");
        binaryTree.levelOrder(binaryTree.root);
        binaryTree.deleteGivenNode("n10");
        binaryTree.deleteGivenNode("n3");
        binaryTree.levelOrder(binaryTree.root);
    }
}
