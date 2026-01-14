public class Practising_Constuructor {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(1,2);
        System.out.println(r.area());

    }
}

class Rectangle{
    private final int length;
    private final int breath;

    public Rectangle(int length,int breath){
      if(length==0){
        this.length=0;
      }else{
        this.length=length;
      }
      this.breath=breath;
    }

    public int area(){
        return length*breath;
    }
}