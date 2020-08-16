package Practice.D06USBInterface;

public class Keyboard implements USB
{
    @Override
    public void open()
    {
        System.out.print("打开键盘\n");
    }

    @Override
    public void close()
    {
        System.out.print("关闭键盘\n");
    }

    public void type()
    {
        System.out.print("键盘打字\n");
    }
}
