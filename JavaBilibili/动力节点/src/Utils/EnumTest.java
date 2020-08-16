package Utils;

public class EnumTest
{
    public static void main(String[] args)
    {
        Result res = divide(10, 0);
        System.out.println(res == Result.SUCCESS ? "计算成功" : "计算失败");
    }

    public static Result divide(int l, int r)
    {
        try
        {
            int res = l / r;
            return Result.SUCCESS;
        } catch (Exception e)
        {
            return Result.FAILURE;
        }
    }
}

enum Result
{SUCCESS, FAILURE}

