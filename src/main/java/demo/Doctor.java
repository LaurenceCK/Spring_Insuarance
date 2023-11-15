package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
//@Component //  Spring annotation
public class Doctor implements Staff , BeanNameAware {


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;
        public void assist(){
            System.out.println("Doctor is assisting");
        }


    @Override
    public void setBeanName(String name) {
        System.out.println("Set bean name is called" +
                "");
    }
@PostConstruct
    public void postConstract(){
        System.out.println("Post Contract Method is Called");
    }
}