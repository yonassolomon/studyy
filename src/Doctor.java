public class Doctor {
    person p=new person();
    private String name;
    private String specialized;
    public int[] patients=new  int[3];//here i want that the doctor have some patients
    public void setData(String name, String specialized){
        this.name=name;
        this.specialized=specialized;
    }
    public void gettData(){
        System.out.println("name:"+name+"\n specialix=zed:"+specialized);
    }
}
