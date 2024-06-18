package com.pageObjectRepo;

import org.openqa.selenium.By;

public interface LogInPageRepo {

    By loginButton =By.xpath("//a[text()='Sign in']");
    By email = By.xpath("//input[@type='email']");
    By password = By.xpath("//input[@type='password']");
    By nextButton = By.xpath("//span[text()='Next']");
    By composeButton = By.xpath("//div[@class='T-I T-I-KE L3']");
    By subject = By.xpath("//input[@name='subjectbox']");
    By body = By.xpath("//div[@class='Am aiL Al editable LW-avf tS-tW']");
    By toFiled = By.xpath("//input[@class='agP aFw']");
    By sendKey = By.xpath("//div[text()='Send']");
    By errormesg = By.xpath("//span[@class='mUIrbf-ano']");
    By userId= By.xpath("//a[@class='gb_d gb_Ja gb_K']");
    By logoutButton =By.xpath("//div[text()='Sign out']/../../parent::a");
    By viewMesg= By.xpath("//span[text()='View message']");




    By spinner = By.xpath("(//*[@class='mat-card mat-focus-indicator spinner'])[1]");




}



