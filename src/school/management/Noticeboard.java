//IMPLMENTATION JAMAL
//NOTICEBOARD CLASS
package school.management;

import java.util.ArrayList;

public class Noticeboard {
    private ArrayList<String> newsList=new ArrayList<>();
    private String inChargeName;

//GETTERS
public ArrayList<String> getNewsList(){return newsList;}
public String getInChargeName(){return inChargeName;}
//SETTERS
public void setNewsList(ArrayList<String> news){this.newsList=news;}
public void setInChargeName(String inCharge){this.inChargeName=inCharge;}
//CONSTRUCTORS
public Noticeboard(String inCharge){
    this.inChargeName=inCharge;
}
//DISPLAY METHOD
void displayNoticeBoard(){
    System.out.println("NEWS LIST ON NOTICE BOARD: "+ getNewsList());
}
//ADD-CONTENT METHOD
void addContent(String content){
    newsList.add(content);
}
}
