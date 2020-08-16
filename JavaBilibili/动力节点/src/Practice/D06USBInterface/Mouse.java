package Practice.D06USBInterface;

public class Mouse implements USB
{
    @Override
    public void open()
    {
        System.out.print("打开鼠标\n");
    }

    @Override
    public void close()
    {
        System.out.print("关闭鼠标\n");
    }

    public void click()
    {
        System.out.print("鼠标点击\n");
    }
}
