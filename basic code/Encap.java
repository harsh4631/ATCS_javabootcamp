public class Encap {
    private  String name;
    private String cmpname;
    private int  salary;
    public String getname(){

        return name;
    }
    public String getCmpname(){
        return cmpname;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String newname) {
        name=newname;
    }

    public void setCmpname(String newcmpname) {
        cmpname=newcmpname;
    }

    public void setSalary(int newsalary) {
         salary=newsalary;
    }

    public static void main(String[] args) {
        Encap ob= new Encap();
        ob.setName("ketan");
        ob.setCmpname("ATCS");
        ob.setSalary(50000);
        System.out.println(ob.getname());
        System.out.println(ob.getCmpname());
        System.out.println(ob.getSalary());
    }
}
