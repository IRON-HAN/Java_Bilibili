1. 4大父类(abstract)
    1. InputStream 字节输入流
    2. OutputStream 字节输出流
    3. Reader 字符输入流
    4. Writer 字符输出流
2. 所有的流使用完之后必须调用close() 方法
3. 输出流都有flush() 方法--在输出流最终输出之后,调用方法
4. 常用的16个
    1. 文件
        1. ★ FileInputStream 
        2. ★ FileOutputStream 
        3. FileReader
        4. FileWriter
    2. 转换(字节流-->字符流)
        1. InputStreamReader
        2. OutputStreamWriter
    3. 缓冲流
        1. BufferReader
        2. BufferWriter
        3. BufferInputStream
        4. BufferOutputStream
    4. 标准输出流
        1. PrintWriter
        2. ★ PrintStream
    5. 对象流
        1. ObjectInputStream
        2. ObjectOutputStream
       