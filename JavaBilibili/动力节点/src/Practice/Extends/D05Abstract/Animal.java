/*
 * 1. abstract method[写法]: 类似于C++函数声明
 * 2. abstract class 不一定包含 abstract method
 *   有abstract method 必定是 abstract class
 * 3. 子类必须对所有 abstract方法override
 * 4. abstract class 可以有ctor, 用于初始化父类成员
 * */
package Practice.Extends.D05Abstract;

public abstract class Animal
{
    public abstract void eat();

    public abstract void sleep();

    public Animal()
    {
        System.out.print("Animal()\n");
    }
}
