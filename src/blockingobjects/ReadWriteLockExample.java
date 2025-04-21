package blockingobjects;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Interface implemented via ReentrantReadWriteLock
 *  lock() -> returns a acquired Lock
 *  unlock() -> returns back a released lock
 *
 * When we want separate locks writes and reads.
 *
 * Writers: blocks everyone
 * Readers: block other writers, but doesn't block other readers.
 */
public class ReadWriteLockExample {
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void write() {
        try {
            readWriteLock.writeLock().lock();

        } finally {
            readWriteLock.writeLock().unlock();
        }
    }


    public void read() {
        try {
            readWriteLock.readLock().lock(); // block writers, not readers

        } finally {
            readWriteLock.readLock().unlock();
        }
    }
}
