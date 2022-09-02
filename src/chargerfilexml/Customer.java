/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chargerfilexml;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = { "phoneNumbers", "name"})
public class Customer extends Person {

    private String password;
    private List<String> phoneNumbers;

    @XmlTransient
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(name = "phone-number")
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    
}
