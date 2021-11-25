import java.sql.Time;
import java.util.Date;
public class Json {
    static String firstName = "firstName";
    int bakiye;
    String birim;
    Date date;
    Time time;


    public static void main(String[] args) {
        String respond = "{\n" +
                "\"bakiye\": 5000\n" +
                "\"unit\": \"dolar\"\n" +
                "\"date\": \"19.11.2021\"\n" +
                "\"time\": \"18:45\"\n" +
                "}";
        Json jsonObj = new Json();
//        jsonObj.parseJson(respond);
////        jo.get(Halı.firstName);
    }

//    private void parseJson(String respond){
//        String[] respond_parsed;
//        if(respond_parsed[0] == "bakiye")
//            this.bakiye = respond_parsed[0][1]
//    }
}



