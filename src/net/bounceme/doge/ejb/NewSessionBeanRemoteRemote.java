/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bounceme.doge.ejb;

import javax.ejb.Remote;

/**
 *
 * @author thufir
 */
@Remote
public interface NewSessionBeanRemoteRemote {

    String businessMethod();
    
}
