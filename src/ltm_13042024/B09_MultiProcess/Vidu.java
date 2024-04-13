package ltm_13042024.B09_MultiProcess;

class InDaySo{
    public String Name;
    public InDaySo(String name){
        this.Name = name;
    }

    public void xuatDaySo(){
        long i = 0;
        while(true){
            if(i > 1000000) break;
            System.out.println(Name + " : " + i);
            i++;
        }
    }
}

class Thread_DaySo extends Thread{
    public String Name;
    public Thread_DaySo(String name){
        this.Name = name;
    }

    @Override
    public void run() {
        super.run();
        long i = 0;
        while(true){
            if(i > 1000000) break;
            System.out.println(Name + " : " + i);
            i++;
        }
    }
}
public class Vidu {
//    InDaySo inDaySoA = new InDaySo("A");
//    InDaySo inDaySoB = new InDaySo("B");
    public static void main(String[] args) {
        Thread_DaySo inDaySoA = new Thread_DaySo("A");
        Thread_DaySo inDaySoB = new Thread_DaySo("B");
        inDaySoA.start();
        inDaySoB.start();
    }
}
