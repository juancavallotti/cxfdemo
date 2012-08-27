package com.juancavallotti.cxfdemo.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juancavallotti
 */
@XmlRootElement
public class CustomerRequest implements Serializable {
    
    private String name;
    private Integer membershipLevel;

    public CustomerRequest() {
    }

    public CustomerRequest(String name, Integer membershipLevel) {
        this.name = name;
        this.membershipLevel = membershipLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(Integer membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
    
}
