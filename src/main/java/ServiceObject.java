/**
 * Created by elena on 17.04.2017.
 */
public class ServiceObject implements Readable {
     private String nameOb;
     private int sizeOb;

    public ServiceObject(String nameOb, int sizeOb) {
        this.nameOb = nameOb;
        this.sizeOb = sizeOb;
    }

    public String nameOb(){
        return nameOb;
    }

    public int sizeOb(){
        return  sizeOb;
    }
}
