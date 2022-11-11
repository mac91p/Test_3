package Zad1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LargestJavaFile {
    public static void main(String[] args) {

        List<File> javaFiles = new ArrayList<>();
        File workspace = new File("C:\\Users\\macko\\IdeaProjects");
        findJavaFiles(workspace, javaFiles);
        System.out.println("getLargestJavaFile(javaFiles).getName() = " + getLargestJavaFile(javaFiles).getName());
        System.out.println("getLargestJavaFile(javaFiles).length() = " + getLargestJavaFile(javaFiles).length());

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

    static File getLargestJavaFile(List<File> javaFiles) {
        long largestSize = 0;
        File largestFile = null;
        for (File f:javaFiles){
            if(f !=null){
                long tempSize = f.length();
                if(tempSize > largestSize){
                    largestSize = tempSize;
                    largestFile = f;
                }
            }
        }
        return largestFile;
    }


}
