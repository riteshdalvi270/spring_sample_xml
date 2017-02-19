package repository;

import object.CustomerObject;

/**
 * Created by ritesh on 2/18/17.
 */
public class CustomerHibernateImpl implements CustomerHibernate {

    final CustomerObject customer = new CustomerObject();

    public void setCustomer(final String firstName) {

        customer.setFirstName(firstName);
    }

    public String findCustomer() {
       return customer.getFirstName();
    }
}
