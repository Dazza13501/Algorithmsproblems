package CA1;

public class Q4 implements Comparable<Q4>{
    String title;
    String price;
    String review;
    Q4(String title, String price, String review){
        this.title = title;
        this.price = price;
        this.review = review;
    }

    @Override
    public int compareTo(Q4 ga){
        int title = this.title.compareTo(ga.title);
        return title == 0 ? this.price.compareTo(ga.price) : title;
    }
}
