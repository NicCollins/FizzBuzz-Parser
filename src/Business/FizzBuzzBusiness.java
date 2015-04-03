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

package Business;

import Views.OptionsView;
import Views.RuleBuilderView;

import java.io.IOException;

/**
 * Created by ncollins on 4/2/2015.
 */
public class FizzBuzzBusiness {
    public void getView(String choice) throws IOException {
        switch (choice) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                new RuleBuilderView();
                break;
            case "4":
                //choice = null;
                break;
            case "5":
                //rules = consolePages.ruleBuilderSentence();
                break;
            case "6":
                //rules = consolePages.ruleBuilderArray();
                break;
            case "7":
                break;
            default:
                new OptionsView();
                break;
        }
    }
}
