import java.util.HashMap;

public class Mapuser {
    private int rollno;
    private String name;

    public Mapuser(int rollno,String name){
        super();
        this.rollno=rollno;
        this.name=name;
    }
    public int getMarks() {
        return this.rollno;
    }

    public String getName() {
        return this.name;
    }
    public void setMarks(int rollno){
        this.rollno=rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    public static void main(String[] args) {
        HashMap<Integer,Mapuser> ob=new HashMap();
//        Mapuser ok=new Mapuser(1,"harsh");
//        Mapuser ok1=new Mapuser(2,"jai");

//        ob.put(new Mapuser(1,"harsh"), "h");
//        ob.put(new Mapuser(2,"harsh"), "J");
        ob.put(1,new Mapuser(1,"harsh"));
        System.out.println(ob);
    }
}

