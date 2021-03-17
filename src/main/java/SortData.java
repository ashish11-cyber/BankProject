import java.util.ArrayList;
import java.util.Collections;
public class SortData {
//sort the data with the help of ArrayList
    public static void main(String... args)
    //creating object of ArrayList class
    ArrayList<String> list;
    {
        list = new ArrayList<String>();
    }
    list.add('HSBC':'5601-2345-3446-5678':'Nov-2017');
    list.add('RCB' :'4519-4532-4524-2456':'Oct-2017');
    list.add('AE'  :'3786-7334-8965-345': 'Dec-218');
    //printing the unsorted ArrayList
    System.out.println("Before Sorting:" + list);
    //Sorting ArrayList in ascending Order
    //using Collection.sort() method
    Collections.sort(list,Collections.reverseOrder());
    //Print the sorted ArrayList
    System.out.println("After Sorting: " + list);

    //replaceAll
    private str replaceAll() {
        return replaceAll();
    }

    //replaceAll
    private str replaceAll(String regex, String replacement)
    String str = "5601-2345-3446-5678";
    String str2 = "4519-4532-4524-2456";
    String str3 = "3786-7334-8965-345";
    /* replace card numbers after 4 digit. */
    String str4 = str.replaceAll("\\s","");
    System.out.println(str);
    }

