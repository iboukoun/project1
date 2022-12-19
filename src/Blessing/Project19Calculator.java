package Blessing;

public class Project19Calculator {
    public static void main(String[] args) {
        catchIt(40);
        use();
        getIt(1);

    }
        public static void throwANumber(int throwMe)throws Exception {
            throw new Exception("I don't like the number" + throwMe + ",you can have it back!");
        }
        public static void catchIt(int catchMe){
        try {
            throwANumber(catchMe);
        }catch (RuntimeException ex){
            System.out.println("you'll never see this!");

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
                System.out.println("I'm in the finally block");

            }

            }
        public static void giveANumber(int number) throws Exception {
            throw new Exception(number + "is not the right number");
        }
        public static void getIt(int getMe){
            try{
                giveANumber(getMe);
            }catch (RuntimeException ex){
                System.out.println("impossible");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("made it to the end");
            }
        }

            //your code will go here
    public static void calculate(int x, int y) throws ArithmeticException{
            throw new ArithmeticException( "the result is "+(x / y));
    }
       public static void use(){
            int x = 4;
            int y = 2;
            try {
               calculate(x,y);
            }catch (ArithmeticException ex){
                System.out.println("do not divide by 0!");
            }catch (Exception e){
                System.out.println("some other exception");
            }finally {
                System.out.println("this will always print out");
            }

       }
        }



