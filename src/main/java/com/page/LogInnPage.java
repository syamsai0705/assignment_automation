package com.page;

import com.base.BasePage;
import com.pageObjectRepo.LogInPageRepo;

public class LogInnPage extends BasePage implements LogInPageRepo {


    public void waitUntilInvisiblityOfLoader(){
        while (isElementPresentWithNoException(spinner,3)){
            staticWait(3);
        }
    }



}

