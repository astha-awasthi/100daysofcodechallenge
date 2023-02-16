public class Deadlock{  
 public static void main(String[] args){  
   final String str1 = "JavaTpoint";  
   final String str2 = "great source for learning";  
   
   Thread t1 = new Thread() {  
     public void run(){  
       synchronized(str1){  
        System.out.println("In thread 1, str1 is locked");  
        try{ Thread.sleep(100);} catch(Exception e) {}  
      synchronized(str2){  
        System.out.println("In thread 1, str2 is locked");  
        }  
     }  
  }  
};  
 Thread t2 = new Thread() {  
      public void run(){  
       synchronized(str1){  
        System.out.println("In thread 2, str1 is locked");  
        try{ Thread.sleep(100);} catch(Exception e) {}  
      synchronized(str2){  
       System.out.println("In thread 2, str2 is locked");  
      }  
    }  
  }  
 };  
   
 t1.start();  
 t2.start();  
 }  
 }  
