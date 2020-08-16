package Practice.D06USBInterface;

public class Laptop
{
    public void PowerOn()
    {
        System.out.print("打开电脑\n");
    }

    public void PowerOff()
    {
        System.out.print("关闭电脑\n");
    }

    public void UseDevice(USB device)
    {
        device.open();
        MethodDevice(device);
        device.close();
    }

    public void MethodDevice(USB device)
    {
        if (device instanceof Mouse)
            ((Mouse) device).click();
        if (device instanceof Keyboard)
            ((Keyboard) device).type();
    }

}
