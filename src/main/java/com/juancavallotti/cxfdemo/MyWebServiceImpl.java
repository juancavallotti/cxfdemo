package com.juancavallotti.cxfdemo;

import com.juancavallotti.cxfdemo.domain.Customer;
import com.juancavallotti.cxfdemo.domain.CustomerRequest;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author juancavallotti
 */
@WebService
public class MyWebServiceImpl implements MyWebService {
    
    @WebMethod
    @Override
    public String doSomeWork(String work) {
        return "Doing some work with this: "+work;
    }
    
    
    @Override
    @GET @Path("/beRestful") @Produces("text/plain") //REST Annotations
    @WebMethod //SOAP Annotations
    public String beRestful(@QueryParam("name") String name) {
        return "Your name is: "+name;
    }
    
    
    @WebMethod
    public ArrayList<Customer> findCustomers(CustomerRequest request) {
        
        
        ArrayList<Customer> ret = new ArrayList<Customer>();
        
        Customer customer = new Customer();
        
        customer.setCustomerName(request.getName());
        customer.setMembershipLevel(request.getMembershipLevel());
        customer.setCustomerSince(new Date());
        
        ret.add(customer);
        
        return ret;
    }
    
}
