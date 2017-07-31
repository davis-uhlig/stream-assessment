package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/31/17.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entry {
    private Day day;
    private String note;
    private int duration;

    public Entry(Day day, String note, int duration) {
        this.day = day;
        this.note = note;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public Day getDay() {
        return day;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "day=" + day +
                ", note='" + note + '\'' +
                '}';
    }

    public static List<Entry> populate(){
        List<Entry> entries = new ArrayList<>();
        Random random = new Random();

        Entry entry = new Entry(Day.MONDAY,"Today I went to play sports", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.TUESDAY,"Lunch was a salad today... was still hungry", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.WEDNESDAY,"Hump day! Looking forward to the weekend.", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.WEDNESDAY,"Why isn't the day over yet?!", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.THURSDAY,"Poker night", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.FRIDAY,"Finally Friday!", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.SATURDAY,"Saturdaze", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.SUNDAY,"Sunday Bumday", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.MONDAY,"I dont like writing in this journal", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.SATURDAY,"Why am I writing on a Saturday?", random.nextInt(100));
        entries.add(entry);

        entry = new Entry(Day.TUESDAY,"toooos day", random.nextInt(100));
        entries.add(entry);

        return entries;

    }
}

