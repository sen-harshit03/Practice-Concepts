package lock;

import java.util.concurrent.locks.Lock;

/**
 * The very base of multithreading allows multiple threads to operate on an object simultaneously.
 *
 * Wooohoo!!! faster processing
 *
 * But, ooooopsss!!! We got the race condition for free.
 *
 * To solve this, java came with the concept of locks on the object.
 *
 * There are basically two types of Lock:
 * 1. Intrinsic lock or monitor lock:
 *      - Every object in java has an intrinsic lock. Thread acquires this lock when it enters the synchronized block.
 *
 *      - Intrinsic locks in java are REENTRANT, which means if a thread sitting in one synchronized block can enter the
 *      other synchronized block without blocking.
 *
 *      synchronized outer() {
 *          inner();
 *      }
 *      synchronized inner() {}
 *
 *      If it would be non-reentrant then thread would be waiting for the lock that it is already acquiring to execute inner.
 *      So, DEADLOCK 😵‍💫
 *
 *      Some characteristics of intrinsic lock:
 *      1. Automatic acquisition and release of lock : so less flexible 😞
 *      2. No option for unlock. 😞
 *      3. No interruption while threads are waiting for the lock 😎
 *      4. No fairness 😞
 *
 *
 * 2. Lock Interface
 *    - It is way through which we explicitly acquire and release the lock using lock() and unlock() methods.
 *    - It offers more flexibility and control over the intrinsic lock.
 *    - Manual acquiring and releasing of lock via code.
 *    - we have other tryLock() which help us to acquire lock without blocking. This tries of acquire lock, if failed then returns a false.
 *    - Timed lock attempts.
 *    - Reentrant
 *    - Fairness can be achieved.
 *
 *  ReentrantLock implements Lock
 *  - lock, unlock, trylock, lockInterruptibly, isFair
 *
 *  - lock/unlock behavior is kinda same as the intrinsic one, if lock not available -> then goes to waiting state.
 *  - tryLock: Through this we can specify fallbacks or backoffs if lock is not acquired. (Can specify timeouts).
 *
 *
 *  Waiting mechanism:
 *  For intrinsic lock, it's managed by JVM
 *  For ReentrantLock, it is done through code, thus offers interruptions.
 *
 *
 *  For more exclusion among writes and readers, we have ReadWriteLock.
 *  ReadWriteLock(I): offers lock() and unLock() methods which returns the Lock instance.
 *
 *  ReentrantReadWriteLock:
 *  - Offers two locks: ReadLock and WriteLock
 *  - General principle: Writers block other writers and readers, readers can work simultaneously.
 *
 *
 */
public class LockDetailed {


}
