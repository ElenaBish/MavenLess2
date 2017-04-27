//import java.io.FileWriter;
//import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by elena on 17.04.2017.
 */
public class WriteLogServiceOb implements Writeble {
    private static Logger log=Logger.getLogger(WriteLogServiceOb.class.getName());

    public void writeOb(Readable readOb){
      log.info("Name object "+readOb.nameOb()+", size"+readOb.sizeOb());
       // FileWriter file =new FileWriter("log.txt");
        //file.write("Name object "+readOb.nameOb()+", size"+readOb.sizeOb());
    }

}
