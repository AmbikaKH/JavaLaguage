package language.class12;

import java.text.ParseException;
import java.util.Date;

final class immuteClass{ // Class is final
    int a;  // We cannot change a since we do not have any setter for a
    Date date;

    // Constructor
    public immuteClass(int a, Date date){
        this.a = a;
        this.date = date;
    }

    //Getter method
    public int getA(){ // a cannot be changes
        return a;
    }

    public int add5(){ //
        return a+5;
    }

    public Date displayDate(){
        //return this.date; // this makes date mutable
        return new Date(this.date.getTime()); // We need to pass only reference to make it immutable
    }

}
public class ImmutableClass {

    public static void main(String[] args) throws ParseException {

        Date date = MyDateUtil.StringtoDate("08/08/2021");
        immuteClass im = new immuteClass(10, date);
        System.out.println(im.getA());
        System.out.println(im.add5());
        System.out.println(im.displayDate());

        im.displayDate().setTime(new Date().getTime());
        System.out.println(im.displayDate());

    }

}
