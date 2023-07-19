package model.exceptions;


/*
runtimeexception = o compiladior nao obriga a mexer
exception = obriga a mexer

 */
public class DomainException extends Exception{

    public DomainException(String message){
        super(message);
    }



}
