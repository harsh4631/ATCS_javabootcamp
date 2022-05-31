import java.util.HashMap;
import java.util.Iterator;

public class Map1 {
    public static void main(String[] args) {
        HashMap<Integer,String> ob=new HashMap<>();
        ob.put(1,"harsh");
        ob.put(2,"harshit");
        ob.put(3,"harshita");
        ob.put(4,"harshul");
        System.out.println(ob);
        Iterator ok=ob.entrySet().iterator();
        while (ok.hasNext()){
            System.out.println(ok.next());
        }
        ob.replace(2,"apple");
        System.out.println(ob);
        String value=ob.get(4);
        System.out.println(value);


    }
}
