package AppSessionBean;

import javax.ejb.Stateless;

@Stateless(name = "FirstSessionBeanImplEJB")
public class FirstSessionBeanImplBean{

    public String sayHello(){
            return "Hello World";
        }

}
