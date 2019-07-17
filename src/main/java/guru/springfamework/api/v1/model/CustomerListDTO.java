package guru.springfamework.api.v1.model;

import guru.springfamework.api.v1.model.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerListDTO {
    List<CustomerDTO> customers;
}
