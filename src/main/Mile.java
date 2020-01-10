package main;

public class Mile {
    private int length;
    public Mile(int length){
        this.length=length;
    }

    @Override
    public boolean equals(Object obj) {
        //Mile m=(Mile) obj;
        //return this.length==m.length;
        if(obj instanceof Mile){
            Mile other=(Mile)obj;
            return this.length == other.getAmount();
        }else if(obj instanceof Yard){
            Yard other =(Yard)obj;
            return 1760*this.length==other.getAmount();
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.length;
    }

    public Object add(Object obj) {
        //this.length+=((Mile)obj).length;
        //return this;
        if(obj instanceof Mile){
            Mile m=(Mile)obj;
            this.length+=m.length;
            return this;
        }else if(obj instanceof Yard){
            Yard y=(Yard)obj;
//            this.length = this.length*1760+y.getAmount();

            return new Yard(this.length * 1760 + y.getAmount());
        }
        return this;

    }

    public int getAmount(){
        return this.length;
    }



    /*public Mile add(Mile m){
        return new Mile(this.length+m.length);
    }*/
    }




