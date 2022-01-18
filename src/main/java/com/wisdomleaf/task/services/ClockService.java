package com.wisdomleaf.task.services;

import org.springframework.stereotype.Service;

@Service
public class ClockService {
    public String getSpokenTime(String time) {
        String minutes[] = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine",
                "thirty", "thirty one", "thirty two", "thirty three", "thirty four",
                "thirty five", "thirty six", "thirty seven", "thirty eight", "thirty nine",
                "forty", "forty one", "forty two", "forty three", "forty four",
                "forty five", "forty six", "forty seven", "forty eight", "forty nine",
                "fifty", "fifty one", "fifty two", "fifty three", "fifty four",
                "fifty five", "fifty six", "fifty seven", "fifty eight", "fifty nine"
        };

        String hours[] = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three"
        };
        try {
            int hour = Integer.parseInt(time.split(":")[0]);
            int minute = Integer.parseInt(time.split(":")[1]);
            String timeInEnglish = "";
            if (hour == 0 && minute == 0) {
                timeInEnglish = "It's Midnight";
            } else if (hour == 12 && minute == 0) {
                timeInEnglish = "It's Midday";
            } else {
                timeInEnglish = "It's " + hours[hour] + " " + minutes[minute];
            }
            return timeInEnglish;
        } catch (Exception exception) {
            System.out.println("exception :" + exception);
            return "Incorrect Time passed";
        }
    }
}