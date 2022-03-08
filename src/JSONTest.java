import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import org.json.*;

public class JSONTest {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("name", "Ömer");
        hm.put("surname", "Okumuş");
        hm.put("age", "25");
        hm.put("school", "Marmara");
        hm.put("department", "CSE");
        hm.put("program", "Master");

        JSONObject jo = new JSONObject(hm);
        System.out.println(jo);

        PrintWriter pw = new PrintWriter("myjs.json");
        pw.write(jo.toString());
        pw.flush();
        pw.close();
    }
}
