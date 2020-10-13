/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwthread;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrei.nichita0308
 */
public class Candidate extends Thread{
    private String name;
    private int age;
    private int educationlvl;
     private static BlockingQueue<Request> waitingqueue= null;
     Request r=new Request();
     private Eworker e=new Eworker();
    public Candidate(String name, int age, int educationlvl) {
        this.name = name;
        this.age = age;
        this.educationlvl = educationlvl;
    }

    Candidate() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEducationlvl() {
        return educationlvl;
    }

    public static BlockingQueue<Request> getWaitingqueue() {
        return waitingqueue;
    }
    
    public void run()
    {
        try {
             
            waitingqueue.add(r);
            wait(10);
            e.verify1(r);
        } catch (InterruptedException ex) {
            Logger.getLogger(Eworker.class.getName()).log(Level.SEVERE, null, ex);
        }
        run();
    }
       
  }
    
    

