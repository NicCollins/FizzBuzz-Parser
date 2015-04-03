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

import AppData.FizzBuzzRule;
import Business.FizzBuzzBusiness;
import Controllers.FizzBuzzController;

import java.io.IOException;
import java.util.List;

/**
 * Created by NCollins on 12/4/2014.
 */
public class Console {
    public static void main(String[] args) throws IOException {
        //Initialize needed classes
        FizzBuzzBusiness fizzBuzzBusiness = new FizzBuzzBusiness();
        FizzBuzzController fizzBuzzController = new FizzBuzzController();
        
        String choice = "";
        
        while (choice != null) {
            fizzBuzzBusiness.getView(choice);
            choice = fizzBuzzController.userInput();
        }
    }
}
