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

/**
 * Created by NCollins on 12/4/2014.
 */
public class Console {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("                   Fizz Buzz Variant Solver");
        System.out.println("================================================================");
        System.out.println("This application will solve any Fizz Buzz variant you can create");
        System.out.println();
        System.out.println("Please choose one of the following options:");
        System.out.println("1) Standard FizzBuzz");
        System.out.println("2) Israeli FizzBuzz Variant");
        System.out.println("3) Custom Variant");
        System.out.print("Selection: ");
        String choice = br.readLine();
    }
}
