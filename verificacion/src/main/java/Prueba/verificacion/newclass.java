package Prueba.verificacion;

public class newclass {
    private Long Id;
    private String mesage;


    public newclass(Long Id, String mesage){
        this.Id = Id;
        this.mesage = mesage;
    }
    public Long getId(){
        return this.Id;
    }
    public void setId(Long Id){
        this.Id = Id;
    }
    public String getMesage(){
        return this.mesage;
    }
    public void setMesage(String mesage){
        this.mesage = mesage;
    }
}   
