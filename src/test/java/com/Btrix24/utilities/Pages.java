package com.Btrix24.utilities;

import com.Btrix24.pages.TasksPage.Tasks;
import com.Btrix24.pages.homePage.ActivityStream;
import com.Btrix24.pages.login.LoginPage;
import com.Btrix24.pages.sideMenuBar.Modules;

public class Pages {
    private LoginPage loginPage;
    private ActivityStream activityStream;
    private Modules modules;
    private Tasks tasks;




    public ActivityStream activityStream() {
        if (activityStream == null) {
            activityStream = new ActivityStream();
        }
        return activityStream;
    }



    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public Modules modules() {
        if (modules == null) {
            modules = new Modules();
        }
        return modules;
    }

    public Tasks tasks() {
        if (tasks == null) {
            tasks = new Tasks();
        }
        return tasks;
    }


}
