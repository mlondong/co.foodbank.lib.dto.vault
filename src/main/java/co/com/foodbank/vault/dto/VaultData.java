package co.com.foodbank.vault.dto;

import java.util.Collection;
import co.com.foodbank.address.dto.Address;
import co.com.foodbank.address.dto.IAddress;
import co.com.foodbank.contribution.state.ContributionData;

public class VaultData {

    private String id;

    private Address address;

    private String phones;

    private String contact;

    // private Collection<IContribution> contribution;
    private Collection<ContributionData> contribution;


    public VaultData() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public VaultData(Address address, String phones, String contact,
            Collection<ContributionData> contribution) {
        this.address = address;
        this.phones = phones;
        this.contact = contact;
        this.contribution = contribution;
    }

    public IAddress getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Collection<ContributionData> getContribution() {
        return contribution;
    }

    public void setContribution(Collection<ContributionData> contribution) {
        this.contribution = contribution;
    }



}
