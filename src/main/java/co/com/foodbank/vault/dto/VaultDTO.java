package co.com.foodbank.vault.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import co.com.foodbank.address.dto.AddressDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.vault.dto 11/08/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaultDTO {

    @NotNull
    @NotBlank(message = "Phone must be completed.")
    @Size(min = 8, max = 20, message = "Phone must be between 8 and 20 digits.")
    public String phones;

    @NotNull
    @NotBlank(message = "Contact must be completed. ")
    public String contact;

    @Valid
    public AddressDTO address;


}
