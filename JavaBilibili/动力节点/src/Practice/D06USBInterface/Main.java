package Practice.D06USBInterface;

public class Main
{
    public static void main(String[] args)
    {
        Laptop laptop = new Laptop();
        laptop.PowerOn();

        // 写法1: up-cast
        USB mouse = new Mouse();
        laptop.UseDevice(mouse);

        // 写法2: 直接用实现类
        // 传参的时候进行up-cast
        Keyboard keyboard = new Keyboard();
        laptop.UseDevice(keyboard);
        laptop.UseDevice(new Keyboard());

        laptop.PowerOff();
    }

}
