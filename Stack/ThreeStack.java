package Stack;
// Way to implement 3 stack using a single array

public class ThreeStack {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    // isFull
    public boolean isFull(int stackNum) {
        if (sizes[stackNum] == stackCapacity) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        if (sizes[stackNum] == 0) {
            return true;
        } else {
            return false;
        }
    }

    // indexOfTop

    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    // push
    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("The Stack is Full");
        } else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    // pop
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    // peek

    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The Stack is Empty");
            return -1;
        } else {
            return values[indexOfTop(stackNum)];
        }
    }
    public static void main(String args[])
    {
        ThreeStack t = new ThreeStack(3);
        System.out.println(t.isEmpty(1));
        t.push(1,8);
        System.out.println(t.isEmpty(1));
        System.out.println(t.isEmpty(2));
        t.pop(2);
    }
}
