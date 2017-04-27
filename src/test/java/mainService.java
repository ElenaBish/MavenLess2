import org.junit.Test;


/**
 * Created by elena on 17.04.2017.
 */
public class mainService {
    @Test
    public void mainServiceOb(){
        ServiceObject Ob1=new ServiceObject("name",10);
        WriteServiceOb serviceOb=new WriteServiceOb();
        serviceOb.writeOb(Ob1);

        WriteLogServiceOb logServiceOb=new WriteLogServiceOb();
        logServiceOb.writeOb(Ob1);


    }
}
