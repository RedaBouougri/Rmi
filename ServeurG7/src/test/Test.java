/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Machine;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;

/**
 *
 * @author Lachgar
 */
public class Test {
    
    public static void main(String[] args) {
        try {
            MachineService ms = new MachineService();
           /* ms.create(new Machine("RE44", "HP", 2000));
            ms.create(new Machine("RE54", "DELL", 5000));
            ms.create(new Machine("RE74", "LENOV", 6000));*/
            
            for(Machine m : ms.findAll())
                System.out.println(m);
        } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
