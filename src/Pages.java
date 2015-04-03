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
import Views.OptionsView;
import Views.RuleBuilderView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ncollins on 2/5/2015.
 */
public class Pages {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public String options() throws IOException {
        new OptionsView();
        return br.readLine();
    }
    
    public String ruleBuilderOptions() throws IOException {
        new RuleBuilderView();
        String parseSelect = br.readLine();
        
        switch (parseSelect) {
            case "1":
                return "5";
            case "2":
                return "6";
            default:
                return "3";
        }
    }

    public List<FizzBuzzRule> ruleBuilderSentence() {
        return null;
    }

    public List<FizzBuzzRule> ruleBuilderArray() {
        return null;
    }
}
