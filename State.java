public class State {

    public static void main(String[] args) throws InterruptedException {
        var thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getState());
            System.out.println("Jalan di thread:  " + Thread.currentThread().getName());
            });
        thread.setName("1");
        System.out.println(thread.getState());
        thread.start();
        thread.join();
        System.out.println(thread.getState());
    }
}