package co.com.foodbank.vault.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import co.com.foodbank.address.dto.AddressDTO;

public class VaultDTO {

    @NotNull
    @NotBlank
    @Size(min = 8, max = 20)
    public String phones;

    @NotNull
    @NotBlank
    public String contact;

    @Valid
    public AddressDTO address;



    public VaultDTO() {}



    public VaultDTO(AddressDTO address, String phones, String contact) {
        this.address = address;
        this.phones = phones;
        this.contact = contact;
    }



    public AddressDTO getAddress() {
        return address;
    }



    public void setAddress(AddressDTO address) {
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



    @Override
    public String toString() {
        return "VaultDTO [phones=" + phones + ", contact=" + contact
                + ", address=" + address + "]";
    }



}
