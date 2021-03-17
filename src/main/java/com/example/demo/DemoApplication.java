package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.Collections.reverseOrder;

@SpringBootApplication
public class DemoApplication<list> {
    //sort the data with the help of ArrayList
 List<Bank> bank = new ArrayList<Bank>();
 bank.add(("HSBC",5601-2345-3446-5678,Nov-2017))
 bank.add(("RCB", 4519-4532-4524-2456,Oct-2017))
 bank.add(("AE",  3786-7334-8965-345, Dec-2018))
 Collections.sort(bank, new Comparator <Bank> ())
    {
        @Override
        public int compare (Bank b1, Bank b2)
        {
            return (int) (b1.getName().compareTo(b2.getName()));
        }
    })
    // in descending order
    Collections.sort(bank, (b1, b2)-> (b2.getName().compareTo(b1.getName())))
    System.out.println("Descending order => " + employees)

    //Using Replaceall in String\\
    public str replaceAll(String regex, String replacement) {
        return null;
    }
    String str = "5601-2345-3446-5678";
    String str2 = "4519-4532-4524-2456";
    String str3 = "3786-7334-8965-345";
        /* replace card numbers after 4 digit with x */
        String str4 = str.replaceAll("\\s","");
        System.out.println(str);
}




