package com.Btrix24.step_Definitions;

import com.Btrix24.utilities.BrowserUtils;
import com.Btrix24.utilities.Pages;
import cucumber.api.java.en.Then;

public class CreateTaskFromHomepageStep_Definition {

    Pages pages = new Pages();

    @Then("send {string} on task")
    public void send_on_task(String message) {

       pages.activityStream().sentTask(message);
        BrowserUtils.waitFor(3);
    }

//    @Then("verify task has sent")
//    public void verify_task_has_sent() {
//        pages.activityStream().verifyMessagesSent();
//
//
//    }



}
