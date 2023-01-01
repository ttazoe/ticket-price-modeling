package org.example;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class PublicHolidays {
    //TODO : 振替休日と体育の日、成人の日の判定ロジックを組む
    private static final Map<String, String> list = new HashMap<>();
    static {
        list.put("0101", "元日");
        list.put("0110", "元日"); // 1 月 第 2 月曜日
        list.put("0211", "元日");
        list.put("0223", "元日");
        list.put("0321", "元日");
        list.put("0429", "元日");
        list.put("0503", "元日");
        list.put("0504", "元日");
        list.put("0505", "元日");
        list.put("0718", "元日");
        list.put("0811", "元日");
        list.put("0919", "元日");
        list.put("0923", "元日");
        list.put("1010", "元日"); // 10 月 第 2 月曜日
        list.put("1103", "元日");
        list.put("1123", "元日");
    }

    static boolean isPublicHolidays(LocalDateTime date){
        String day = String.format("%02d", date.getDayOfMonth());
        String month = String.format("%02d", date.getMonthValue());
        String key = month + day;
        if (list.containsKey(key)) return true;
        return false;
    }


}
