package org.example;

public class BackSequence implements CharSequence {
    private String str;

    public BackSequence(String value){

        this.str=value;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {

        final int strLength=str.length();

        if(index<0 || index>=strLength) {
            throw new IndexOutOfBoundsException("Incorrect value of index");

        }

        return str.charAt(strLength-index-1);

    }

    @Override
    public CharSequence subSequence(int start, int end) {

        int length=str.length()-1;

        if(start<0 || end<0){
            throw new IndexOutOfBoundsException();

        }

        if(start>length || end>length || start>end){
            throw new IndexOutOfBoundsException();
        }

        StringBuilder builder=new StringBuilder();

        int startFrom=length-start;

        int resultEnd=length-end;

        for(    int i=startFrom;   i>=resultEnd;    i--    ){

            builder.append(str.charAt(i));

        }


        return builder.toString();


    }

    @Override
    public String toString() {
        StringBuffer builder=new StringBuffer();


        for(int i=str.length()-1;i>=0;i--){

            builder.append(str.charAt(i));
        }

        return builder.toString();


    }

}
