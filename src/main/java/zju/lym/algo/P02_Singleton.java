package zju.lym.algo;

/**
 * 双重校验锁单例模式
 * 若没有第一次校验，每次调用都需上锁，效率低
 * 若没有第二次校验，可能重复创建实例
 * 若没有volatile，可能会指令重排，instance指向一块空内存
 */
public class P02_Singleton {
  private static volatile P02_Singleton instance = null;
  public static P02_Singleton getInstance() {
    if (instance == null) {
      synchronized(P02_Singleton.class) {
        if (instance == null) {
          instance = new P02_Singleton();
        }
      }
    }
    return instance;
  }
}
