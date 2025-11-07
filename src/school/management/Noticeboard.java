package school.management;

//import java.util.ArrayList;

public class Noticeboard {
    private String newsList;
    private String inChargeName;

//GETTERS
public String getNewsList(){return newsList;}
public String getInChargeName(){return inChargeName;}
//SETTERS
public void setNewsList(String news){this.newsList=news;}
public void setInChargeName(String inCharge){this.inChargeName=inCharge;}
//CONSTRUCTORS
public Noticeboard(String news,String inCharge){
    this.newsList=news;
    this.inChargeName=inCharge;
}
//DISPLAY METHOD
void displayNoticeBoard(){
    System.out.println("NEWS LIST ON NOTICE BOARD: "+ getNewsList());
}
//ADD-CONTENT METHOD
void addContent(){

}
}
