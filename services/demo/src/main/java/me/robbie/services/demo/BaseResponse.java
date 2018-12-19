package me.robbie.services.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class BaseResponse<T> implements Serializable {
    private String code;
    private String message;
    private String reqNo;
    private T dataBody;

    public BaseResponse(T dataBody) {
        this.dataBody = dataBody;
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(String code, String message, T dataBody) {
        this.code = code;
        this.message = message;
        this.dataBody = dataBody;
    }

    public BaseResponse(String code, String message, String reqNo, T dataBody) {
        this.code = code;
        this.message = message;
        this.reqNo = reqNo;
        this.dataBody = dataBody;
    }
}
