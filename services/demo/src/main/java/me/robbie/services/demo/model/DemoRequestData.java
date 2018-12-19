package me.robbie.services.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import me.robbie.services.demo.model.BaseRequest;

@Data
@NoArgsConstructor
@ToString
public class DemoRequestData extends BaseRequest {
    private String reqString;
}
