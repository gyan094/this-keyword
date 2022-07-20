package this_keyword;

public class this_keyword1 {

        void show()  //method create
        {
            System.out.println(this);
        }

        public static void main(String[] args) {
            this_keyword1 r=new this_keyword1();
            System.out.println(r);
            r.show();
        }
    }


