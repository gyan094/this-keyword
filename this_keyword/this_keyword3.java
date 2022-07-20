   //parametrized thid keyword

package this_keyword;

public class this_keyword3 {

    this_keyword3()
        {
            System.out.println("gyan");
        }
    this_keyword3(int a)
        {
            this();
            System.out.println(a);
        }

        public static void main(String[] args) {
            this_keyword3 r=new this_keyword3(200);
        }
}
