package com.mangopay.pages;

public class GoogleConsentPage extends AbstractPageObjet{

    public static final String ACCEPT_ALL_COOKIES_BUTTON = ".//html[1]/body[1]/c-wiz[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[2]/div[1]/div[1]/button[1]/span[1]";

    public void clickAcceptAllCookiesButton(){
        click(ACCEPT_ALL_COOKIES_BUTTON);
    }
}
