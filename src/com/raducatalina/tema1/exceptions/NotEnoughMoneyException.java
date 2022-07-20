package com.raducatalina.tema1.exceptions;

public class NotEnoughMoneyException extends Exception
{
    public NotEnoughMoneyException()
    {
        super("Nu aveti destui bani in cont!");
    }

}
