       driver= Driver.getInstance().getDriver();
        driver.get("https://www.amazon.com/");
        try {
            Wait wait=new WebDriverWait(driver,20);
            if(wait.until(ExpectedConditions.alertIsPresent())==null){
                System.out.println("none happening");
            }else {
                Alert alert=driver.switchTo().alert();
                alert.accept();
            }
        }catch (NoAlertPresentException en){
            en.printStackTrace();
        }


       }

    }
