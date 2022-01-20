import java.util.Timer;
import java.util.TimerTask;

public class TestMain {
    public static void main(String[] args) {
       CustomerQueue<Customer> listQue = new CustomerQueue();

       Customer c1 = new Customer("Tehillah");
        Customer c2 = new Customer("chadia");
        Customer c3 = new Customer("Kenzi");
        Customer c4 = new Customer("Ivannia");

        listQue.offer(c1);
        listQue.offer(c2);
        listQue.offer(c3);
        listQue.offer(c4);


            System.out.println("Customers on the Queue: " + listQue );
        System.out.println("");


    Timer timer = new Timer();

    timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {

            System.out.println("serving: "+ listQue.poll());
            System.out.println(listQue);
            if(listQue.getSize() == 0){
             timer.cancel();
            }

        }
    },1*50*50, 1*50*50);

    }

}
