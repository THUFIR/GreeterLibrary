package net.bounceme.doge.ejb;

import javax.ejb.Remote;

@Remote
public interface GreeterBeanRemote {

    String greetMe(String name);
    
}


/*

net.bounceme.doge.ejb.GreeterBeanRemote


*/