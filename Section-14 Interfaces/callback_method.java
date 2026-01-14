public class callback_method {
    public static void main(String[] args) {
        store s=new store();
        customer c1=new customer("john");
        s.register(c1);
        s.inviteSale();
        
    }
}
 class customer implements member{
    String name;

    customer (String n){
        name = n;
    }

    @Override
    public void callback(){
        System.out.println(name + " wants to get membership");
    }

 }
 interface member{
    void callback();
}

class store{
    member mem[]=new member[100];
    int count=0;

    void register(member m){
        mem[count++]=m;
    }

    void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}

