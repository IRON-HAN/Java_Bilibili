1. 关于default ctor: 一旦手写就无了

## Super & This
1. 使用范围: super/this 可以出现在 实例方法和ctor中(static不适用)
2. 使用方式: super/this. super/this()
3. 省略: super/this.大部分时候可以省略
4. this. 在区分局部和实例变量的时候不能省略 [如,在set方法中]

### super this ctor
1. this() super() 不共存,都是只能在ctor的第一行
2. 子类的ctor中,如果不写super()/this()的时候默认有一个super(),所以父类的无参构造必须有

### this
1. this.属性名
2. this(args) --ctor

### super
1. super.属性名 -- 访问父类的属性
2. super.方法名(args) -- 访问父类的方法
3. super(args) -- ctor