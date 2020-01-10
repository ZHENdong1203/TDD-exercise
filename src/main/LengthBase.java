package main;

public enum LengthBase {
    BASE(1,"base"),
    INCH(BASE.getBaseAmount(),"inch"),
    FEET(12*INCH.getBaseAmount(),"feet"),
    YARD(4*FEET.getBaseAmount(),"yard"),
    MILE(1760*YARD.getBaseAmount(),"mile");

    private int amount;
    private String str;

    public int getBaseAmount(){
        return amount;
    }
    public String getBaseStr(){
        return str;
    }

    LengthBase(int amount,String str){
        this.amount=amount;
        this.str=str;
    }

}
