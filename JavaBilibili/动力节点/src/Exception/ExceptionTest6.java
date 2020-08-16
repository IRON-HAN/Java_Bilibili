package Exception;


public class ExceptionTest6
{
    public static void main(String[] args)
    { }
}

//  自定义异常
//  1. "xxx.Extends Exception" || "xxx.Extends RuntimeException"
//  2. Create two ctors: "no args" && " String message "
class MException extends Exception
{
    public MException()
    { }

    public MException(String message)
    { super(message); }
}
