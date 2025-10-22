

class MyThread extends Thread{
    String Name;

    MyThread(String Name) {
        this.Name=Name;
    }
    
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.printf("%s count: %d\n",this.Name,i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.printf("%s Finished\n",Name);
    }
}