package language.class6;


public class commandLineArguments {

    public static void main(String[] args){
        /*for(String arg:args){
            System.out.println(arg);
        }*/
        commandLineArguments obj = new commandLineArguments();
        obj.addNumbers(args); // We need object when static method is calling a non static method

        //addNumbers(args); // We can call like this when calling method is also static public static void addNumbers(String[] args)


    }

    //public static void addNumbers(String[] args)
    public void addNumbers(String[] args)
    {
        int sum = 0;
        for(String arg:args){
            System.out.println(arg);
            sum = sum + Integer.parseInt(arg);
            //System.out.println(Integer.toString(50));
        }
        System.out.println("Sum = "+sum);
    }


}
