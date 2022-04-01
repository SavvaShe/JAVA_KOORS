package Samolet;

public class Plane {
    private String nazsamolet;
    private int nomer;
    public Plane(String nazsamolet,int nomer){
        this.nazsamolet=nazsamolet;
        this.nomer=nomer;
    }


    public String getNazsamolet() {
        return nazsamolet;
    }

    public void setNazsamolet(String nazsamolet) {
        this.nazsamolet = nazsamolet;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }
    @Override
    public String toString() {
        return "Самолет{" +
                "Название самолета='" + nazsamolet + '\'' +
                ", номер самолета='" + nomer + '}';
    }
}
