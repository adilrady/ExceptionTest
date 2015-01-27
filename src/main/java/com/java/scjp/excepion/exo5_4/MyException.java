package com.java.scjp.excepion.exo5_4;


public class MyException {

    public static void main(String[] args) {
        System.out.println(args.length);

        //We should add -ea option to java command, because Never triggered in production code:
        if(args.length == 2){
            throw new IllegalArgumentException();
        }
        
        try {
            checkFood(args[0]);
        } catch (BadFoodException e) {
            e.printStackTrace();
        }
        
        try {
            int x = Integer.parseInt("two");
        } catch (NumberFormatException nfe) {
            // TODO: handle exception
        } catch (IllegalArgumentException iae) {
            // TODO: handle exception
        }
            
    }
    
    
    private static void checkFood(String food) throws BadFoodException {
        if(food.startsWith("Moroccan")){
            System.out.println("Good Food");
        }else{
            throw new BadFoodException();
        }
            
    }
}
