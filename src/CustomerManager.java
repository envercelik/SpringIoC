public class CustomerManager implements ICustomerService{

    //Dependency injection
    IBaseDal dal;

   //constructor injection
    public CustomerManager(IBaseDal dal) {
        this.dal = dal;
    }


    /*
    //setter injection : not recommended
    public void setDal(IBaseDal dal) {
        this.dal = dal;
    }

     */

    @Override
    public void add(Customer customer) {
        dal.add(customer);

    }


}
