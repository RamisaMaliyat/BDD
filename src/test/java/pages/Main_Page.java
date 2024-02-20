package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Main_Page extends Form
{
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By NameToSearchLocator = By.id("searchInput");
    private final ITextBox NameToSearch = elementFactory.getTextBox(NameToSearchLocator,"Name_To_Search");

    private final By SearchLocator  = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,"Search"));
    private final IButton SearchButton = elementFactory.getButton(SearchLocator,"Search");

    private final By Language = By.xpath("//*[@id='searchLanguage']//option[@value='es']");
    private final IButton SelectLanguage = elementFactory.getButton(Language,"SelectLanguage");

    private final By ArticlePageTitleLocator  = By.xpath("//*[@id='firstHeading']//*[@class='mw-page-title-main']");
    private final ILabel ArticlePageTitle = elementFactory.getLabel(ArticlePageTitleLocator,"ArticlePageTitle");

    private final By suggestionsLocator  = By.xpath("//*[@class='suggestions-dropdown']");

    private final By MainPageTitleLocator = By.xpath("//span[@class='central-textlogo__image sprite svg-Wikipedia_wordmark']");
    private final ILabel MainPageTitle = elementFactory.getLabel(MainPageTitleLocator , "Main Page Title");





    public Main_Page()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "wikipedia")),"First_Page");
    }

    public void Search(String name)
    {
        NameToSearch.sendKeys(name);

    }
    public void Submit()
    {

        SearchButton.click();
    }

    public void ChangeLanguage()
    {

        SelectLanguage.click();
    }

    public boolean isArticlePageOpen()
    {

        return ArticlePageTitle.state().isDisplayed();
    }

    public boolean Suggestion()
    {
        List<ILabel> suggestionList = getList();

        for (ILabel suggestion : suggestionList) {
            if (((WebElement) suggestion).isDisplayed()) {
                return true; // If any element is displayed, return true
            }
        }
        return false;
    }

    private List<ILabel> getList()
    {
        return AqualityServices.getElementFactory().findElements(suggestionsLocator, "due",
                ElementType.LABEL);
    }


    public boolean isMainPageOpen()
    {
        return MainPageTitle.state().isDisplayed();
    }
}