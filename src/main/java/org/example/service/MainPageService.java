package org.example.service;

import org.example.page.MainPage;

import static org.example.utils.Constants.MAIN_PAGE_URL;

public class MainPageService {
    private final MainPage mainPage = new MainPage();

    public MainPageService openPageAndAcceptCookie() {
        mainPage.openPage(MAIN_PAGE_URL)
                .acceptCookie();
        return this;
    }

    public String inputCorrectValues(String number, String sum, String email) {
        mainPage.inputNumber(number)
                .inputMany(sum)
                .inputEmail(email)
                .clickPayButton();
        return this.toString();
    }

    public String getNameTitle() {
        mainPage.chekTitle();
        return this.toString();
    }

    public FramePageService clickPayButton() {
        mainPage.clickPayButton();
        return new FramePageService();
    }

}
