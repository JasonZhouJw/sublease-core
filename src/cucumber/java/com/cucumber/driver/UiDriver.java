package com.cucumber.driver;


import com.cucumber.driver.elements.UiElement;
import com.cucumber.driver.elements.UiLink;
import com.cucumber.driver.elements.UiSelect;
import com.cucumber.driver.elements.UiTable;
import com.sublease.common.view.Params;

public interface UiDriver {
    void close();

    void navigateTo(String url);

    UiElement findElementByName(String name);

    UiElement findElementByTag(String tag);

    void navigateToWithParams(String url, Params params);

    UiSelect findSelectByName(String name);

    UiElement findElementById(String id);

    void waitForTextPresent(String text);

    UiTable findTableByTag(String tag);

    UiLink findLinkById(String id);

}
