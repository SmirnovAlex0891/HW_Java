package hwJava_12_12_2022;

public class QueueAndStackTest {
    public static void main(String[] args) {
        MyQueueImpl myQueue = new MyQueueImpl();

        myQueue.add("AAA");
        myQueue.add("BBB");
        myQueue.add(222);
        System.out.println("------------Queue-------------------");
        myQueue.print();
        myQueue.delete();
        myQueue.print();
        myQueue.delete();
        myQueue.print();
        myQueue.delete();
        myQueue.print();
        System.out.println("----------------Stack----------------");
        MyStackImpl myStack = new MyStackImpl();

        myStack.add("HHH");
        myStack.add("ddd");
        myStack.add("ccc");
        myStack.add(555);

        myStack.print();
        myStack.delete();
        myStack.print();
        myStack.delete();
        myStack.print();

        System.out.println(myStack.isEmpty());

        myStack.delete();
        myStack.delete();
        System.out.println(myStack.isEmpty());

    }
}
