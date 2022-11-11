package Zad2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ComparisonJavaFiles {
    public static void main(String[] args) {

        List<File> fileList = new ArrayList<>();
        File workspace = new File("C:\\Users\\macko\\IdeaProjects");
        findJavaFiles(workspace, fileList);
        Map<DayOfWeek, Integer> mapWithDaysCounter = getMapWithDaysCounters(fileList);
        for (Map.Entry<DayOfWeek, Integer> dayOfWeekIntegerEntry : mapWithDaysCounter.entrySet()) {
            System.out.println(dayOfWeekIntegerEntry);
        }

        //MONDAY=51
        //TUESDAY=85
        //WEDNESDAY=52
        //THURSDAY=33
        //FRIDAY=30
        //SATURDAY=26
        //SUNDAY=50
    }

    static void findJavaFiles(File dir, List<File> javaFiles) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory())
                findJavaFiles(f, javaFiles);
            else if (f.getName().endsWith(".java"))
                javaFiles.add(f);
        }
    }

    static DayOfWeek getDayOfWeekFromFile(File f) {
        BasicFileAttributes bfa = null;
        try {
            bfa = Files.readAttributes(f.toPath(), BasicFileAttributes.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileTime fileTime = bfa.creationTime();
        Instant instant = fileTime.toInstant();
        DayOfWeek dayOfWeek = DayOfWeek.from(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()));
        return dayOfWeek;
    }

    static Map<DayOfWeek, Integer> getMapWithDaysCounters(List<File> list) {
        int monCnt = 0;
        int tueCnt = 0;
        int wedCnt = 0;
        int thuCnt = 0;
        int friCnt = 0;
        int satCnt = 0;
        int sunCnt = 0;

        Map<DayOfWeek, Integer> map = new LinkedHashMap<>();
        for (File file : list) {
            switch (getDayOfWeekFromFile(file)) {
                case MONDAY -> monCnt++;
                case TUESDAY -> tueCnt++;
                case WEDNESDAY -> wedCnt++;
                case THURSDAY -> thuCnt++;
                case FRIDAY -> friCnt++;
                case SATURDAY -> satCnt++;
                case SUNDAY -> sunCnt++;
            }
        }
        map.put(DayOfWeek.MONDAY, monCnt);
        map.put(DayOfWeek.TUESDAY, tueCnt);
        map.put(DayOfWeek.WEDNESDAY, wedCnt);
        map.put(DayOfWeek.THURSDAY, thuCnt);
        map.put(DayOfWeek.FRIDAY, friCnt);
        map.put(DayOfWeek.SATURDAY, satCnt);
        map.put(DayOfWeek.SUNDAY, sunCnt);
        return map;
    }


}
