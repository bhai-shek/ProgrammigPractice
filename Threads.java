class Counter{
    int c;
    public void increment(){
        c++;
    }
}
public class Threads {
    public static void main(String a[]) throws Exception{
        Counter co=new Counter();
        Runnable ob1=()->{
            for(int i=1;i<=1000;i++){
                co.increment();
            }
        };
        Runnable ob2=()->{
            for(int i=1;i<=1000;i++){
                co.increment();
            }
        };
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(co.c);
    }
}
