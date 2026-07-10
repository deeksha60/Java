package multithreading.SynchronizedExample;

public class counter {
    int count;
    synchronized void increment(){ //if two threads  trying to access the same resource we use synchronized to access the resource
        count++;
    }
}
