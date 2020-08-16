### 操作
1. 创建
2. 添加
3. ★删除: 只要用了iterator就用迭代器的删除方法
3. 取出
4. ★包含: 重写@equals
4. 遍历: fori foreach iterator
5. 输出的时候,自定义的类需要重写 @toString

### 常用
1. ArrayList --> Array
2. LinkedList --> List
3. HashMap(HashSet) --> unsorted ★ key-->@equals+@hashcode
4. TreeMap(TreeMap) --> sorted ★ comparator/comparable
5. Properties


### 其他
1. TreeSet对于自定义类型的排序机制: 先看是不是comparable,若是则按照comparable的规则进行
2. Collections.sort用于List: 虽然是comparable但是comparator可以对其覆盖