package com.example.timetablewiz;

import android.content.Context;
import android.widget.TextView;

public class Schedule {

    private String monday[] = new String[14];
    private String tuesday[] = new String[14];
    private String wednesday[] = new String[14];
    private String thursday[] = new String[14];
    private String friday[] = new String[14];

    public Schedule() {
        for(int i=0; i<14 ; i++) {
            monday[i] = "";
            tuesday[i] = "";
            wednesday[i] = "";
            thursday[i] = "";
            friday[i] = "";
        }
    }

    public void addSchedule(String scheduleText) { // 요일 구분해서 시간 끊기
        int temp;
        if((temp = scheduleText.indexOf("월")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";// 교시에 해당하는 숫자데이터 넣기
                }
            }
        }
        if((temp = scheduleText.indexOf("화")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";// 교시에 해당하는 숫자데이터 넣기
                }
            }
        }
        if((temp = scheduleText.indexOf("수")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";// 교시에 해당하는 숫자데이터 넣기
                }
            }
        }
        if((temp = scheduleText.indexOf("목")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";// 교시에 해당하는 숫자데이터 넣기
                }
            }
        }
        if((temp = scheduleText.indexOf("금")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";// 교시에 해당하는 숫자데이터 넣기
                }
            }
        }
    }


    public boolean validate(String scheduleText) {      //중복체크
        if(scheduleText.equals("")) {
            return true;
        }
        int temp;
        if((temp = scheduleText.indexOf("월")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if(!monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {  // 공백이 아니라면 해당 시간표는 중복
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("화")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if(!tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {  // 공백이 아니라면 해당 시간표는 중복
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("수")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if(!wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {  // 공백이 아니라면 해당 시간표는 중복
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("목")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if(!thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {  // 공백이 아니라면 해당 시간표는 중복
                        return false;
                    }
                }
            }
        }
        if((temp = scheduleText.indexOf("금")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if(!friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {  // 공백이 아니라면 해당 시간표는 중복
                        return false;
                    }
                }
            }
        }
        return true;  // 여기까지 오면 중복 안된 것
    }

    public void addSchedule(String scheduleText, String courseTitle, String courseProfessor) {
        String professor;
        if(courseProfessor.equals("")) {
            professor = "";
        }
        else {
            professor = "(" + courseProfessor + ")";
        }

        int temp;
        if((temp = scheduleText.indexOf("월")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle + professor;
                }
            }
        }
        if((temp = scheduleText.indexOf("화")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle + professor;
                }
            }
        }
        if((temp = scheduleText.indexOf("수")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle + professor;
                }
            }
        }
        if((temp = scheduleText.indexOf("목")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    tuesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle + professor;
                }
            }
        }
        if((temp = scheduleText.indexOf("금")) > -1) {
            temp +=2;
            int startPoint = temp;
            int endPoint = temp;
            for(int i =temp; i<scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if(scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if(scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle + professor;
                }
            }
        }
    }

    public void setting(AutoResizeTextView[] monday, AutoResizeTextView[] tuesday, AutoResizeTextView[] wednesday, AutoResizeTextView[] thursday, AutoResizeTextView[] friday, Context context) {
        for(int i = 0; i < 14 ; i++) {
            if(!this.monday[i].equals("")) {
                monday[i].setText(this.monday[i]);
                monday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary)); // 해당 강의가 존재할 시 색상이 바뀜
            }
            else {
                monday[i].setText("가나다라마바사아자차카");
            }

            if(!this.tuesday[i].equals("")) {
                tuesday[i].setText(this.tuesday[i]);
                tuesday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary)); // 해당 강의가 존재할 시 색상이 바뀜
            }
            else {
                tuesday[i].setText("가나다라마바사아자차카");
            }

            if(!this.wednesday[i].equals("")) {
                wednesday[i].setText(this.wednesday[i]);
                wednesday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary)); // 해당 강의가 존재할 시 색상이 바뀜
            }
            else {
                wednesday[i].setText("가나다라마바사아자차카");
            }

            if(!this.thursday[i].equals("")) {
                thursday[i].setText(this.thursday[i]);
                thursday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary)); // 해당 강의가 존재할 시 색상이 바뀜
            }
            else {
                thursday[i].setText("가나다라마바사아자차카");
            }

            if(!this.friday[i].equals("")) {
                friday[i].setText(this.friday[i]);
                friday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary)); // 해당 강의가 존재할 시 색상이 바뀜
            }
            else {
                friday[i].setText("가나다라마바사아자차카");
            }
            monday[i].resizeText();
            tuesday[i].resizeText();
            wednesday[i].resizeText();
            thursday[i].resizeText();
            friday[i].resizeText();
        }
    }

}
