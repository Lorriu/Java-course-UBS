package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence {

    String reversedWord;

    public ReverseCharSequence(String word){

            char[] ch = word.toCharArray();  

            String reverse = "";  

            for(int i = ch.length-1; i >= 0; i--){  
                reverse += ch[i];  
            }  
            
            this.reversedWord = reverse;  
        }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return reversedWord.length();
    }

    @Override
    public char charAt(int index) {
        // TODO Auto-generated method stub
        return reversedWord.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        // TODO Auto-generated method stub
       return reversedWord.subSequence(start, end);
    }  

    @Override
    public String toString(){

        return reversedWord;
    }
    }



