package com.java.scjp.excepion.exo5_4;


public class MyException {

    public static void main(String[] args) {
        System.out.println(args.length);
        assert(args.length > 100);
        
        try {
            checkFood(args[0]);
        } catch (BadFoodException e) {
            e.printStackTrace();
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
