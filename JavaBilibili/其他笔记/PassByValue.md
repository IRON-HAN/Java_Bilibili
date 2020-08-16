1. 当方法接收一个引用时, 可以改变引用对象的属性
```
public static void triple(Person p)
{
    p.setSalary(3*p.getSalary());
}
triple(test);
```
* 解释:
1. p被初始化为test(引用)值的拷贝
2. p和test同时引用那个在heap中的对象,并通过语句将工资提高了3倍
3. 方法结束,p不再引用,但是test依然引用那个对象

2. 一个方法不能让引用指向另一个对象
```
public static void swap(String l,String r)
{
    String tmp=l;
    l=r;
    r=tmp;
}
swap(s1,s2);
```
* 解释:
1. 传递参数的时候,l得到了s1地址值,r得到s2地址值
2. 对l,r的值的修改不影响s1,s2的指向(传值, 形参改变不影响实参)
```cpp
void swap(string &l, string &r)
{
    string tmp=l;
    l=r;
    r=tmp;
}
swap(s1,s2);
```
* 解释:
1. C++按照引用的方式传递, 使得形参和实参得到绑定, 同步修改