/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwthread;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author andrei.nichita0308
 */
public class Request {
    private String cname;
    private int cage;
    private int clvl;

    public Request(String cname, int cage, int clvl) {
        this.cname = cname;
        this.cage = cage;
        this.clvl = clvl;
    }

    public String getCname() {
        return cname;
    }

    public int getCage() {
        return cage;
    }

    public int getClvl() {
        return clvl;
    }
    
    Request() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static BlockingQueue<Request> waitingqueue= null;
    public void queueadd(Request q)
    {
        waitingqueue.add(q);
    }
    
    public Request getrequest()
    {
       return waitingqueue.remove();
    }
}
