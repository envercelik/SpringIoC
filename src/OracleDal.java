public class OracleDal implements IBaseDal{

    private String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add (Customer customer) {
        System.out.println(connectionString);
        System.out.println("Added to oracle database : " + customer.getName());
    }





}
