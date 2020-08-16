package Array;

public class MStack
{
    private static final int DEFAULT_CAPACITY = 3;

    private int capacity;

    // ★ : 初始化时, 先让栈帧指向一个不存在的位置
    private int index = -1;

    private Object[] objects;

    /**
     * @description: construct a stack with DEFAULT_CAPACITY
     * @return: None
     * @throws: None
     * @date: 20/8/15 8:03
     */
    public MStack()
    {
        capacity = DEFAULT_CAPACITY;
        objects = new Object[capacity];
    }

    /**
     * @description: construct a stack with given capacity
     * @param: capacity
     * @return: None
     * @throws: None
     * @date: 20/8/15 8:03
     */
    public MStack(int capacity)
    {
        this.setCapacity(capacity);
        objects = new Object[capacity];
    }

    public static void main(String[] args)
    {
        MStack stack = new MStack();
        try
        {
            stack.push(100);
            stack.push(200);
            stack.push(105);
            stack.push(145);
        } catch (MStackException e)
        {
            e.printStackTrace();
        }
        try
        {
            System.out.println("stack.pop() = " + stack.pop());
            System.out.println("stack.pop() = " + stack.pop());
            System.out.println("stack.pop() = " + stack.pop());
            System.out.println("stack.pop() = " + stack.pop());
        } catch (MStackException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * @description: judge if a stack is already full
     * @return: boolean
     * @throws: None
     * @date: 20/8/15 8:04
     */
    public boolean isFull()
    { return index == capacity - 1; }

    /**
     * @description: judge if a stack is already empty
     * @return: boolean
     * @throws: None
     * @date: 20/8/15 8:04
     */
    public boolean isEmpty()
    { return index == -1; }

    public void setCapacity(int capacity)
    { this.capacity = capacity; }

    public int length()
    { return index + 1; }

    /**
     * @description: remove the top element and return the value
     * @return: java.lang.Object
     * @throws: MStackException
     * @author: Pcy
     * @date: 20/7/17 14:38
     */
    public Object pop() throws MStackException
    {
        if (isEmpty())
            throw new MStackException("Failed! The stack is empty.");
        return objects[index--];
    }

    /**
     * @description: add one element to the bottom
     * @param: the object to be pushed
     * @return: void
     * @throws: MStackException
     * @author: Pcy
     * @date: 20/7/17 14:48
     */
    public void push(Object o) throws MStackException
    {
        if (isFull())
            throw new MStackException("Failed! The stack is full.");
        objects[++index] = o;
    }
}

/**
 * @author Pcy
 * @description: MStackException
 * @date: 20/7/17 14:39
 */
class MStackException extends Exception
{
    private static final long serialVersionUID = 167629942170776760L;

    public MStackException()
    { }

    public MStackException(String message)
    { super(message); }
}

