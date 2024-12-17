public class person {
   private String name;
    private int age;
    private String city;
    private String state;
    public void setdata(String name,int age,String city,String state){
        this.name=name;
        this.age=age;
        this.city=city;
        this.state=state;
    }
    public void getData(){
        System.out.println("name:"+name+"\n age:"+age+"\n city:"+city+"\nstate:"+state);
    }
}
