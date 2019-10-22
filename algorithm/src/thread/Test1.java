package thread;

import java.util.ArrayList;

public class Test1 {
public static void main(String[] args) {
  ArrayList<Thread>threads=new ArrayList<>();
  for(int i=1;i<=10;i++){
    Thread thread=new Thread(new Runnable() {
      
      @Override
      public void run() {
        for(int j=1;j<=9;j++){
          System.out.println(Thread.currentThread().getName()+"打印"+j);
        }
        
      }
    },"线程"+i);
    threads.add(thread);
    
  }
  for(Thread thread:threads){
    thread.start();
    try {
      thread.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
}
