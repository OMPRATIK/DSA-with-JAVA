public class AccModifier {
    public static void main(String args[]){
        bankAcc myacc = new bankAcc();
        myacc.Setpw("12345");
        myacc.getPw();
    }
}

class bankAcc{
    public String username;
    private String password;

    public void Setpw(String pw){ 
        this.password =pw;
    }
    public void getPw() {
        System.out.println(this.password);
    }
}
