### Map
1. map不继承collection
2. 键值对: key/value 都是引用数据类型,都存储对象的地址
3. key是主导 value是附属

### Method
1. V put(key,value) 添加键值对
2. V remove(key) 删除键值对
3. V get(key) 获得某一key的value
4. void clear() 清空
5. boolean containsKey(key) map是否包含key
6. boolean containsValue(value) map是否包含value

1. int size() 获取个数
2. boolean isEmpty() 判空

1. Set<K> keySet() 获取map中的所有key,存入一个Set
2. Collection<V> values() 获取map中所有的value,存入Collection
3. Set<Map.Entry<K,V>> entrySet() 将map集合转成set集合

* Map.Entry<K,V>: 静态内部类

### v = map.get(k) 实现原理
1. 调用k的hashcode()计算出hash, 通过哈希算法转换为数组index
2. 如果该index指向的位置为null, 则返回null
3. 如果该index指向的位置有链表, 则用k与链表中的每个节点中的k进行equals.
4. 如果找到了equals的那个元素, 返回. 找不到, 返回null.

### map.put(k,v)
1. 利用k,v创造一个node
2. 调用k的hashcode()计算出hash, 通过哈希算法转换为数组index
3. 如果该index指向的位置为null, 则直接添加
4. 如果该index指向的位置有链表, 则用k与链表中的每个节点中的k进行equals.
5. 如果所有的equals都是false, 则该node成功添加
6. 如果有equals为true, 则用v覆盖原来的value
