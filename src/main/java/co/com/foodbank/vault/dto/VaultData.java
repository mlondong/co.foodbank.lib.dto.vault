package co.com.foodbank.vault.dto;

import java.util.Collection;
import co.com.foodbank.address.dto.Address;
import co.com.foodbank.contribution.state.ContributionData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.dto 11/08/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaultData {

    private String id;

    private Address address;

    private String phones;

    private String contact;

    private Collection<ContributionData> contribution;



}
