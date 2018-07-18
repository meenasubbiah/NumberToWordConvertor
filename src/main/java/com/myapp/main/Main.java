package com.myapp.main;

import java.util.Scanner;
import com.myapp.service.ConversionService;


	public class Main {

			public static void main(String[] args) {
				
				try{
				
				Scanner sc=new Scanner(System.in);
				ConversionService service=new ConversionService(sc.nextInt());
				System.out.println(service.convertNumberToWords());
				}catch(Exception e){
					System.out.println("Invalid Number");
				}
	}

}
