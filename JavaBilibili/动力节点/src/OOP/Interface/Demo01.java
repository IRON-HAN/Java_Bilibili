package OOP.Interface;

public class Demo01
{
    public static void main(String[] args)
    {
        // upcast
        MMath mMath = new MMathImpl();

        int res = mMath.sum(10, 20);
        System.out.println(res);
    }
}

interface MMath
{
    static final double PI = 3.14;

    int sum(int l, int r);

}

class MMathImpl implements MMath
{

    @Override
    public int sum(int l, int r)
    {// 注意: interface自带public但是class需要手动添加
        return l + r;
    }
}
