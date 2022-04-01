package Avtomabil;

public class GosNomer {
    private String gosnomer;
    private String nomer;
    private String region;
    private String FIO;
    public GosNomer(String gosnomer,String nomer,String region,String FIO){
        this.gosnomer=gosnomer;
        this.FIO=FIO;
        this.nomer=nomer;
        this.region=region;
    }
    public String getGosnomer(){
        return gosnomer;
    }
    public String getFIO(){
        return FIO;
    }
    public String GetNomer(){
        return nomer;
    }

    @Override
    public String toString(){
        return "Госномер: "+gosnomer+'\'' + " Владелец: " +FIO+'\'';
    }
}
