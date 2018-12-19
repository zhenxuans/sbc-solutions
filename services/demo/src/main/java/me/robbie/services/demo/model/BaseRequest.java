package me.robbie.services.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class BaseRequest {
    private String reqNumber;
    private long timeStamp;
}
