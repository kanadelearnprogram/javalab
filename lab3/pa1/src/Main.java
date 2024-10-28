public class Main {

    static Shape findMaxP(Shape[] n){
        int index=0;
        for (int i = 0; i < n.length; i++) {
            double m=n[i].getPerim();
            if (n[index].getPerim()<m){
                index=i;
            }
        }
        return n[index];
    }

     static Shape findMinA(Shape [] n){

        int min=0;
        for (int i = 0; i < n.length; i++) {
            double m=n[i].getArea();
            if (n[min].getArea()>m){
                min=i;
            }
        }
        return n[min];
    }


    public static void main(String[] args) {
        Shape [] n= new Shape[16];

        for (int i = 0; i < n.length ; i++) {
            if (i%2==0){
                Shape c =new Circle(i);
                n[i]=c;
            }else {
                Shape c =new Rectangle(i+10,i+10);
                n[i]=c;
            }
        }

        System.out.println(findMaxP(n));
        System.out.println(findMinA(n));


    }
}
