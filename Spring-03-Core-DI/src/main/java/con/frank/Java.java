package con.frank;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component
@AllArgsConstructor
public class Java {

    //Field Injecton
    //@Autowired
    //OfficeHours officeHours;

    // Constructor Injection
    OfficeHours officeHours;

    //@Autowired
//    public Java(OfficeHours officeHours){
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
