package com.example.demo.domain.base;

import java.util.List;

public class BaseResponse<T> {

    private T result;
    private Boolean hasError;
    private List<ErrorObject> errorMessage;

    public BaseResponse() {
    }

    public BaseResponse(T result, Boolean hasError, List<ErrorObject> errorMessage) {
        this.result = result;
        this.hasError = hasError;
        this.errorMessage = errorMessage;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public List<ErrorObject> getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(List<ErrorObject> errorMessage) {
        this.errorMessage = errorMessage;
    }
}


 class ErrorObject {
    public Integer Code;
    public  String Message;
}
