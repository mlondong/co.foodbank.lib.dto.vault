package co.com.foodbank.vault.dto;

import java.util.Collection;
import co.com.foodbank.address.dto.IAddress;
import co.com.foodbank.contribution.dto.IContribution;


public interface IVault {

    String getContact();

    String getId();

    IAddress getAddress();

    String getPhones();

    Collection<IContribution> getContribution();


}
