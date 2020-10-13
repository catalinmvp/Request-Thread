/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwthread;

/**
 *
 * @author andrei.nichita0308
 */
public class Eworker extends Thread{
    private Request r=new Request();
    
    public void verify1(Request r)
    {
        if(r.getrequest().getClvl()>3)
        {
            Visa v=new Visa();
            v.setVisa_candidateName(r.getrequest().getCname());
        }
        else
            System.out.println("Rejected request");
    }

   
    
}
