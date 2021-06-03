package com.feng.exer;

import java.util.*;

/**
 * *定义个泛型类DAO<T>，在其中定义一个Map成员变量，Nap 的键为string类型，值为了类型。
 * 分别创建以下方法:
 * public void save(String id, T entity):保存Ⅰ类型的对象到Map成员变量中public T get(String id):从map中获取id 对应的对象
 * public void update(String id,T entity):替换 map 中key为id的内容,改为 entity对象public List<T>list():返回map中存放的所有T对象
 * public void delete(String id):别除指定id对象
 * @param <T>
 */
public class DAO<T> {
    private Map<String ,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        if (map.containsKey(id)){
            map.put(id,entity);
        }
    }

    public List<T> list(){
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T l :
                values) {
            list.add(l);
        }
        return list;
    }

    public void delete(String id){
        map.remove(id);
    }
}
