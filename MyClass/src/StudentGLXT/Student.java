package StudentGLXT;

public class Student {
    private String name;
    private String sid;
    private String adress;
    private String age;

    public Student() {
    }

    public Student(String name, String sid, String adress,String age){
        this.name=name;
        this.adress=adress;
        this.age=age;
        this.sid=sid;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getAge(){
        return age;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public String getAdress(){
        return adress;
    }
    public void setSid(String sid){
        this.sid=sid;
    }
    public String getSid(){
        return sid;
    }

}
