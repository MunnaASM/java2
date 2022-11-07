class T1 extends Thread{
    public void run(){
        int x = 200;
        while (x>=0){
            System.out.println("Running 1");
            x--;
        }
    }
}

class T2 extends Thread{
    public void run(){
        int x = 200;
        while (x>=0){
            System.out.println("Running 2");
            x--;
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();
    }
}
