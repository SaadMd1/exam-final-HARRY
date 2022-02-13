package price;

//cette page sert a connaitre la remise de chaque livre en fonction de livre different
public class BooksSetDiscount {
    private int differentCopies;
    private int discount;

    public BooksSetDiscount(int differentCopies, int discount){
        this.differentCopies = differentCopies;
        this.discount = discount;
    }

    public int getDifferentCopies(){
        return differentCopies;
    }

    public int getDiscount(){
        return discount;
    }
}
