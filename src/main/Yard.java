package main;

public class Yard {
    private int amount;
    public Yard(int amount){
        this.amount=amount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Mile){
            Mile other=(Mile)obj;
            return this.getAmount() == other.getAmount()*1760;
        }else if(obj instanceof Yard){
            Yard other =(Yard)obj;
            return this.getAmount()==other.getAmount();
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.amount;
    }

    public Object add(Object obj) {
        if(obj instanceof Mile){
            Mile m=(Mile)obj;
            return new Mile(this.getAmount()+m.getAmount()*1760);
        }else if(obj instanceof Yard){
            Yard y=(Yard)obj;
//            this.length = this.length*1760+y.getAmount();
            this.amount+=y.getAmount();
            return this;
        }
        return this;
    }

    public int getAmount(){
        return this.amount;
    }


}
