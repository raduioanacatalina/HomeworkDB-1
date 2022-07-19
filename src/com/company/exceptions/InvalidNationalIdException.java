package com.company.exceptions;

public class InvalidNationalIdException extends Exception
{
    public InvalidNationalIdException()
    {
        super("Pierdut buletin, nu mai stiu de unde vin.");
    }
}
