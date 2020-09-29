import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Enver Çelik");

        /*without IoC
        CustomerManager customerManager = new CustomerManager(new MysqlDal());
        customerManager.add(customer);
        */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //with IoC
        ICustomerService customerService = context.getBean("service",ICustomerService.class);
        customerService.add(customer);




    }
}
