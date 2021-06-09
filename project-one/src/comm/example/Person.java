package comm.example;

public class Person {

    //instance variables
    private int personId;
    private String personName;
    private int personAge;
    //compositions
    private Address address=null;


    //parameterized constructors
    public Person(int personId,String personName,int personAge,Address address)
    {
        this.personId=personId;
        this.personName=personName;
        this.personAge=personAge;
        this.address=address;
    }



    public String getDetails()
    {
        String status= cheekAge();
        String statusName=checkName();
        if(this.address==null)
        {
            address=new Address("dummy address1","dummy address 2");
        }
        return "Person ID: "+personId + " Person Name: "+personName+" Person Age: "+personAge+"Address: "+this.address.getAddress()+
                " Status Of Age:  "+status +" Status Of Name: "+statusName;
    }


    public String cheekAge()
    {
        if((this.personAge>=0) && (this.personAge>=18))
        {
            return "adult";
        }

        else if ((this.personAge<=18) &&(this.personAge>=0))
        {
            return "minor";

        }
        else
        {
            return "invalid age";
        }
    }

    public String checkName()
    {

        if(this.personName.length()<5)
        {
            return "invalid name";
        }
        else
        {
            return "valid name";
        }
    }



}
