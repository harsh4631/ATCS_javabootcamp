import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {
        Map<String,Integer>ok=new LinkedHashMap<>();
        ok.put("onion",50);
        ok.put("patato",30);
        ok.put("tomato",70);
        ok.put("lemon",500);
        ok.put("colddrink",100);

        System.out.println("in my basket given items "+ ok);
        ok.remove("lemon");
        System.out.println("i want remove a lemon because is so costly yrr ");
        System.out.println("now in my basket are "+ok);
        System.out.println("mummy call the bread is also not in freeze so please purcahse a bread");
        ok.put("bread",50);
        System.out.println("now in my basket add a bread "+ok);
        Iterator ob=ok.entrySet().iterator();
        while(ob.hasNext()){
            System.out.println(ob.next());
        }
    }
}
