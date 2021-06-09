package comm.example;

public class CD {
    private int cdid;
    private String cdname;
    private double cdprice;
    String idStatus=idCheck();
    public CD(){
    this(10);
        System.out.println("default");
    }

    public CD(int cdid) {
        this(cdid,"titanic");
        System.out.println("one");
    }

    public CD(int cdid,String cdname) {
        this(cdid,cdname,201.12);
        System.out.println("two");
    }

    public CD(int cdid,String cdname,double cdprice) {
        this.cdid = cdid;
        this.cdname = cdname;
        this.cdprice = cdprice;
        System.out.println("three");
    }
    public String idCheck()
    {
        if(this.cdid<0 || this.cdid>100) {
            System.out.println("Invalid Id");
            return
        }
        else
        {
            this.cdid = cdid
            return cdid;
        }
    }
    public
    public String getDetails()
    {
        return " id: "+cdid+" name: "+cdname+" price: "+cdprice+"Status_of_id": +idStatus;
    }
}
