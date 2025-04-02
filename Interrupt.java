public class Contohthread {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () ->{
            for (int i = 0; i < 10; i++){
                if(Thread.interrupted()){
                    return;
                }
              
            System.out.println("Runnable: " + i);
            try {
                 Thread.sleep(1000);
                }
            catch (InterruptedException ex){
                        return;
                }
            }
        };
        var thread = new Thread(runnable);
        
        System.out.println("Program sedang berjalan.. ");
      
        thread.start();
        thread.sleep(4000);
        thread.interrupt();
      
        System.out.println("wait..");
      
        thread.join();
      
        System.out.println("Program telah dijalankan");
    }
}
