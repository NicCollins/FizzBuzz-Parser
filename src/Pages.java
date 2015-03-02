/*
 * Console application to create output to various Fizz Buzz variants
 * Copyright (C) 2015.  Nicolas A. Collins
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ncollins on 2/5/2015.
 */
public class Pages {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public String options() throws IOException {
        System.out.println("================================================================");
        System.out.println("|                  Fizz Buzz Variant Solver                    |");
        System.out.println("================================================================");
        System.out.println("This application will solve any Fizz Buzz variant you can create");
        System.out.println();
        System.out.println("Please choose one of the following options:");
        System.out.println("1) Standard FizzBuzz");
        System.out.println("2) Israeli FizzBuzz Variant");
        System.out.println("3) Custom Variant");
        System.out.println("4) Exit Program");
        System.out.print("Selection: ");
        return br.readLine();
    }
    
    public String ruleBuilder() throws IOException {
        System.out.println("================================================================");
        System.out.println("|                   Fizz Buzz Rules Builder                    |");
        System.out.println("================================================================");
        System.out.println("First please select the rule building style you would like to use");
        System.out.println("1) Full sentences will be parsed and you can confirm the rule");
        System.out.println("2) The rule will be built from Number, Comparator, and Action");
        System.out.println("Selection: ");
        String parseSelect = br.readLine();
        
        switch (parseSelect) {
            case "1":
                break;
            case "2":
                break;
            default:
                break;
        }
        
        return "";
    }
}
