package multithreading;

class Demon4 {
    public static void main(String args[]) throws Exception {
        NonReentrantLock nreLock = new NonReentrantLock();
// First locking would be successful
        nreLock.lock();
        System.out.println("Acquired first lock");
// Second locking results in a self deadlock
      //  nreLock.unlock();
        System.out.println("Trying to acquire second lock");
        nreLock.lock();
       // nreLock.unlock();
        System.out.println("Acquired second lock");
    }
}
class NonReentrantLock {
    boolean isLocked;
    public NonReentrantLock() {
        isLocked = false;
    }
    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            notify();
            System.out.println("inside while");
            wait();
        }
        isLocked = true;
    }
    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
}