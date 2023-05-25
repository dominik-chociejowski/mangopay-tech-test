package com.mangopay.pages;

public class GoogleMapsPage extends AbstractPageObjet {


    public static final String SEARCH_INPUT = ".//input[@id='searchboxinput']";
    public static final String SEARCH_BUTTON = ".//html[1]/body[1]/div[3]/div[9]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]";
    public static final String HEADLINE_TEXT = ".//h1";
    public static final String DIRECTIONS_BUTTON = ".//html[1]/body[1]/div[3]/div[9]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[1]";
    public static final String DESTINATION_FIELD = ".//html[1]/body[1]/div[3]/div[9]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]";

    public void typeIntoSearchBox(String city){
        input(SEARCH_INPUT, city);
    }

    public void clickSearchButton(){
        click(SEARCH_BUTTON);
    }

    public void clickDirectionsButton(){
        click(DIRECTIONS_BUTTON);
    }

    public String getHeadlineText(){
        return getText(HEADLINE_TEXT);
    }

    public String getDestinationFieldText(){
        return getAttribute(DESTINATION_FIELD);
    }
}
