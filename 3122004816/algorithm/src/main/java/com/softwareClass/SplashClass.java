package com.softwareClass;

import com.softwareClass.entity.Expression;
import com.softwareClass.util.FileIO;
import com.softwareClass.util.Generator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplashClass {

    public static void main(String[] args) throws IOException {
        if (args.length != 5){
            System.out.println("Argument syntax is incorrect");
            System.out.println("Generate Usage: Myapp.exe -n <题目数量> -r <参数范围>");
            System.out.println("Check Usage: Myapp.exe -e <exercisefile>.txt -a <answerfile>.txt");
            System.exit(0);
        }
        if (args[1].equals("-e")&&args[3].equals("-a")){
            checkAnswer(args[2],args[4]);
        }else if (args[1].equals("-n")&&args[3].equals("-r")){
            generateExercises(Integer.parseInt(args[2]),Integer.parseInt(args[4]));
        }else{
            System.out.println("Argument syntax is incorrect");
            System.out.println("Generate Usage: Myapp.exe -n <题目数量> -r <参数范围>");
            System.out.println("Check Usage: Myapp.exe -e <exercisefile>.txt -a <answerfile>.txt");
            System.exit(0);
        }
    }

    private static void generateExercises(Integer num,Integer area) throws IOException {

        int index=0;
        try {

            String EXERCISES_FILE = "Exercises.txt";
            String ANSWERS_FILE = "Answer.txt";

            for (Expression e : new Generator().generateExpressions(num, area)) {
                index++;
                FileIO.writeOutput(EXERCISES_FILE, index + ". " + e.getExpression());
                FileIO.writeOutput(ANSWERS_FILE,index + ". " + e.evaluate());
            }
        } catch (IOException exception) {
            throw new IOException(exception.getMessage());
        }
    }

    private static void checkAnswer(String answerFile,String exercisesFile) {
        try {
            String GRADE_FILE = "Grade.txt";
            List<String> myAnswer = new ArrayList<>();
            List<String> myExercise = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(exercisesFile));
            String line;

            //解析  序号. 表达式
            String regex = "(\\d+)\\.\\s*(.+)";
            Pattern pattern = Pattern.compile(regex);

            //读取答案文件
            while((line=reader.readLine())!=null){
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    myAnswer.add(matcher.group(2));
                }
            }

            //读取习题文件
            reader = new BufferedReader(new FileReader(answerFile));
            while((line=reader.readLine())!=null){
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    myExercise.add(matcher.group(2));
                }
            }
            StringBuilder correctResult = new StringBuilder();
            StringBuilder incorrectResult = new StringBuilder();
            int correct = 0;
            int incorrect = 0;

            correctResult.append("(");
            incorrectResult.append("(");

            for (int i=0;i<myAnswer.size();i++){
                if (myAnswer.get(i).equals(new Expression(myExercise.get(i)).evaluate())){
                    correctResult.append(i+1).append(",");
                    correct++;
                }else{
                    incorrectResult.append(i+1).append(",");
                    incorrect++;
                }
            }

            if (correct!=0){
                correctResult.deleteCharAt(correctResult.length()-1);
            }
            if (incorrect!=0){
                incorrectResult.deleteCharAt(incorrectResult.length()-1);
            }
            correctResult.append(")");
            incorrectResult.append(")");
            FileIO.writeOutput(GRADE_FILE,"Correct: "+correct+" "+correctResult);
            FileIO.writeOutput(GRADE_FILE,"Wrong: "+incorrect+" "+incorrectResult);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
