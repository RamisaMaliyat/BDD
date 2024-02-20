package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Download_File_Page extends Form
{
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();

    private final By DownloadPDF  = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,"Download as PDF"));
    private final IButton DownloadPDFLink = elementFactory.getButton(DownloadPDF ,"Download as PDF");
    private final By DownloadAsPDF  = By.xpath("//button[@type='submit']");
    private final IButton DownloadPDFButton = elementFactory.getButton(DownloadAsPDF ,"Download as PDF");

    private final By file  = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,"Albert_Einstein.pdf"));
    private final IButton filename = elementFactory.getButton(file ,"Downloaded File");

    public Download_File_Page()
    {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "wikipedia")),"Third_Page");
    }

    public void clickDownloadPDFLink()
     {

         DownloadPDFLink.click();
     }

    public void downloadAsPdf()
    {

        DownloadPDFButton.click();
    }

    public String checkFile()
    {
        Duration timeout = Duration.ofSeconds(30);
        WebDriver driver = AqualityServices.getBrowser().getDriver();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(file));
        return filename.getText();
    }

}
