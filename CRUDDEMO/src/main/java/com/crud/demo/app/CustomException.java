package com.crud.demo.app;

public class CustomException  extends Exception{
	CustomException(){
		super();
	}
	CustomException(String message){
		super(message);
	}
}
