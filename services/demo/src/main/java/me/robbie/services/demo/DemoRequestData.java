package me.robbie.services.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class DemoRequestData extends BaseRequest {
    private String reqString;
}
