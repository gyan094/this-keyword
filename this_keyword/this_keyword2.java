package this_keyword;

public class this_keyword2 {
    int a;
    this_keyword2(int a)
    {
        this.a=a;
    }
    void show()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        this_keyword2 r=new this_keyword2(100);
        r.show();

    }
}
