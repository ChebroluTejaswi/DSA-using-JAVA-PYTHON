package Hashing;
import java.util.*;

public class Direct_Chaining {
    LinkedList <String>[] hashTable;
    int maxChainsize=5;
    
    public Direct_Chaining(int size)
    {
        hashTable = new LinkedList[size]; 
    }

    public int modASCII(String word,int M){
        char ch[];
        ch=word.toCharArray();
        int sum=0;
        for(int i=0;i<word.length();i++)
        {
            sum=sum+ch[i];
        }
        return sum%M;
    }

    public void insert(String word)
    {
        int index = modASCII(word, hashTable.length);
        if(hashTable[index]==null)
        {
            hashTable[index] = new LinkedList<String>();
            hashTable[index].add(word);
        }
        else{
            hashTable[index].add(word);
        }
    }

    public void displayHashTable()
    {
        if(hashTable==null)
        {
            System.out.println("Does not exist");
            return;
        }
        else
        {
            for(int i=0;i<hashTable.length;i++)
            {
                System.out.println(hashTable[i]);
            }
        }
    }

    public boolean search(String word)
    {
        int newIndex = modASCII(word, hashTable.length);
        if(hashTable[newIndex]==null)
        {
            System.out.println("Not found!");
            return false;
        }
        else
        {
            if(hashTable[newIndex].contains(word))
            {
                System.out.println("Element Found");
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void delete(String word)
    {
        int newIndex = modASCII(word, hashTable.length);
        boolean result = search(word);
        if(result==true)
        {
            hashTable[newIndex].remove(word);
            System.out.println("Successfully deleted");
        }
    }
    public static void main(String args[])
    {
        Direct_Chaining d = new Direct_Chaining(3);
        d.insert("apple");
        d.insert("orange");
        d.insert("mango");
        d.displayHashTable();
        System.out.println(d.search("apple"));
        System.out.println(d.search("kiwi"));
        d.delete("apple");
        d.displayHashTable();
    }
}
