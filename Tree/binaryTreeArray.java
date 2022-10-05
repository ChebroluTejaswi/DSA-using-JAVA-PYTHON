package Tree;

public class binaryTreeArray {
    String[] arr;
    int lastUsedIndex;
    public binaryTreeArray(int size)
    {
        this.arr=new String[size+1];
        this.lastUsedIndex=0;
        System.out.println("Tree Created!");
    }
    boolean isFull()
    {
        if(this.arr.length-1==this.lastUsedIndex)
            return true;
        else
            return  false;
    }
    void insert(String value)
    {
        if(!isFull())
        {
            this.arr[this.lastUsedIndex+1]=value;
            this.lastUsedIndex++;
            System.out.println("value - "+value+" inserted!");
        }
        else
        {
            System.out.println("Tree is full!");
        }
    }
    void preOrder(int index)
    {
        if(index>this.lastUsedIndex)
            return;
        System.out.print(arr[index]+ " ");
        preOrder(index*2);
        preOrder(index*2+1);
    }
    void inOrder(int index)
    {
        if(index>this.lastUsedIndex)
            return;
        inOrder(index*2);
        System.out.print(arr[index]+ " ");
        inOrder(index*2+1);
    }
    void postOrder(int index)
    {
        if(index>this.lastUsedIndex)
            return;
        postOrder(index*2);
        postOrder(index*2+1);
        System.out.print(arr[index]+ " ");
    }
    void levelOrder(int index)
    {
        for(int i=index;i<this.arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public int search(String value)
    {
        for(int i=1;i<this.lastUsedIndex;i++)
        {
            if(this.arr[i]==value)
                return i;
        }
        return -1;
    }
    void deleteBT()
    {
        if(this.arr!=null)
        {
            arr=null;
            System.out.println("Tree successfully deleted!");
        }
        else
        {
            System.out.println("Tree does not exist!");
        }
    }
    void deleteNode(String value)
    {
        int location = search(value);
        if(location==-1)
        {
            System.out.println("Node does not exist!");
            return;
        }
        else
        {
            arr[location]=arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Node deleted successfully!");
        }
    }
    public static void main(String[] args)
    {
        binaryTreeArray tree = new binaryTreeArray(3);
        tree.insert("N1");
        tree.insert("N2");
        tree.insert("N3");
        tree.insert("N4");
        System.out.println("\nPre Order Traversal: ");
        tree.preOrder(1);
        System.out.println("\nIn Order Traversal: ");
        tree.inOrder(1);
        System.out.println("\nPost Order Traversal: ");
        tree.postOrder(1);
        System.out.println("\nLevel Order Traversal: ");
        tree.levelOrder(1);

        tree.deleteNode("N3");
        tree.levelOrder(1);
    }
}
