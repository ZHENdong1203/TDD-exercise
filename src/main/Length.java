package main;

public class Length {
    private final int amount;
    private final LengthBase base;
    private Length(int amount,LengthBase base){
        this.amount=amount;
        this.base=base;
    }

    public static Length inch(int amount){
        return new Length(amount,LengthBase.INCH);
    }

    public static Length feet(int amount){
        return new Length(amount,LengthBase.FEET);
    }

    public static Length yard(int amount){
        return new Length(amount,LengthBase.YARD);
    }

    public static Length mile(int amount){
        return new Length(amount,LengthBase.MILE);
    }


    @Override
    public boolean equals(Object obj) {
        Length length=(Length)obj;
        return getBaseAmount()==length.getBaseAmount();
    }

    public int getBaseAmount() {
        return amount*base.getBaseAmount();
    }

    public int getAmount(){
        return amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Length add(Length length){
        return new Length(getBaseAmount()+length.getBaseAmount(),LengthBase.BASE);
    }

    public static void main(String[] args){
        int result;
        System.out.println(Length.feet(3).getBaseAmount()+"inch");
    }


}
