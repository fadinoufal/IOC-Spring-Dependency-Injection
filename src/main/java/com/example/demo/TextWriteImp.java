package com.example.demo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
@Qualifier("SomeText")
public class TextWriteImp implements TextWriter {

    @Override
    public String WriteText(String s) {
        return s +" some text";
    }
}
