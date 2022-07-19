package com.company.exceptions;

public class NotEnoughMoneyException extends Exception
{
    public NotEnoughMoneyException()
    {
        super("Nu aveti destui bani in cont!");
    }

}
