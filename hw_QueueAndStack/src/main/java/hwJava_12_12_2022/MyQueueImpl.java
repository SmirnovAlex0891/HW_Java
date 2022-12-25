package hwJava_12_12_2022;

import java.util.ArrayList;
import java.util.List;

public class MyQueueImpl implements MyQueue{
    private List<Object> objectList = new ArrayList<>();

    @Override
    public void add(Object el) {
        objectList.add(el);
    }

    @Override
    public Integer delete() {
        if (objectList.isEmpty())
            return null;
        objectList.remove(0);
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if (objectList.size() == 0)
            return true;
        return false;
    }


    public void print() {
        System.out.println(objectList);
    }


}
