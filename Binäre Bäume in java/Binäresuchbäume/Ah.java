package Binarysearchtree;
public class Ah implements ComparableContent<Ah>{

    private int UHH;

    public Ah(int phs){
        this.UHH=phs;
    }

    public int getInt(){
        return this.UHH;
    }

    public boolean isGreater(Ah pContent) {
        return(this.UHH>pContent.UHH); 
    }
    public boolean isEqual(Ah pContent) {
        return(this.UHH==pContent.UHH);
    }
    public boolean isLess(Ah pContent) {
        return(this.UHH<pContent.UHH);
    }
    
}
