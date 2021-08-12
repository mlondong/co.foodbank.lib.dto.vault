package co.com.foodbank.vault.interfaces;

import java.util.Collection;
import co.com.foodbank.address.interfaces.IAddress;
import co.com.foodbank.contribution.interfaces.IContribution;


/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.interfaces
 *         11/08/2021
 */
public interface IVault {

    String getContact();

    String getId();

    IAddress getAddress();

    String getPhones();

    Collection<IContribution> getContribution();


}
