package com.myapp.service;

import com.myapp.domain.Number;

public class ConversionService {
	
		private static String[] to_19 = { "",  "one",   "two",  "three", "four",   "five",   "six",
	        "seven", "eight", "nine", "ten",   "eleven", "twelve", "thirteen",
	        "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen","" };
		private static String[] tens  = { "","","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		private static String[] denoms  = {"", "", "thousand", "million"};
		private Number number;
		private String words;
		
		
		public ConversionService(int number) {
			super();
			
			this.number = new Number(number);
			this.words="";
		}
	
		public Number getNumber() {
			return number;
		}
	
		public void setNumber(Number number) {
			this.number = number;
		}
		
		public String getWords() {
			
			return words;
		}
	
		public void setWords(String words) {
			this.words = words;
		}
	
	
		public int[] divideNumberToParts(){
			int i=0,flag=0;
			if(number.getInitDigits()!=0){
				flag=1;
			}
			int[] p = new int[number.getParts()+flag];
			int num=number.getNumber();
			while(i<number.getParts()){
				
				p[i]=num%1000;
				num=num/1000;
				
				i++;
			}
			if(flag==1){
				p[i]=num;
			}
			return p;
			
			
		}
		public String convertNumberToWords(){
			int[] p=divideNumberToParts();
			int i=p.length-1;
			while(i>=0){
				
				
				if(p[i]/100!=0){
					words=((p[i]%100)==0?words+" "+to_19[p[i]/100]+" hundred":words+" "+to_19[p[i]/100]+" hundred and");
				}
				
				if(p[i]%100<20){
					words= words+" "+to_19[p[i]%100];
					
				}
				else{
					words=words+" "+tens[(p[i]%100)/10] +" "+ to_19[p[i]%10];	
				
				}
				if(p[i]!=0){
					words=words+" "+denoms[i+1];
				}
				i--;
				
			}
			
			
			return words;
			
		}

	
}


